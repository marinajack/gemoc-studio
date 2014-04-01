/*******************************************************************************
 * Copyright (c) 2013 Obeo. All Rights Reserved.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1 L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 *******************************************************************************/
package fr.obeo.dsl.debug;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * {@link Thread} utility class.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public final class ThreadUtils {

	/**
	 * Constructor.
	 */
	private ThreadUtils() {
		// nothing to do here.
	}

	/**
	 * Tells if the given {@link Thread} can be resumed.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread}'s {@link Thread#getDebugTarget() debug target} is
	 *         connected and the given {@link Thread} state is suspended.
	 */
	public static boolean canResume(Thread thread) {
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED;
	}

	/**
	 * Requests resuming the given {@link Thread}. The {@link Thread} state must be {@link State#SUSPENDED
	 * suspended}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void resumedReply(Thread thread) {
		if (canResume(thread)) {
			thread.setState(State.RUNNING);
		} else {
			throw new IllegalStateException(
					"can't resume a not suspended thread or a thread in a not connected debug target.");
		}
	}

	/**
	 * Tells if the given {@link Thread} can be suspended.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread}'s {@link ThreadUtils#isActive(Thread) is active},
	 *         <code>false</code> otherwise
	 */
	public static boolean canSuspend(Thread thread) {
		return isActive(thread);
	}

	/**
	 * Tells if the given {@link Thread} is active.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread}'s {@link Thread#getDebugTarget() debug target} is
	 *         connected and the given {@link Thread} state is running, <code>false</code> otherwise
	 */
	public static boolean isActive(Thread thread) {
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& ThreadUtils.isActiveStat(thread.getState());
	}

	/**
	 * Tells if the given {@link State} is active from a debugger perspective.
	 * 
	 * @param state
	 *            the {@link State}
	 * @return <code>true</code> if the state is {@link State#RUNNING} or is
	 *         {@link ThreadUtils#isSteppingState(State) stepping}, <code>false</code> otherwise
	 */
	private static boolean isActiveStat(State state) {
		return state == State.RUNNING || ThreadUtils.isSteppingState(state);
	}

	/**
	 * Tells if the given {@link Thread} is stepping.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread}'s {@link Thread#getDebugTarget() debug target} is
	 *         connected and the given {@link Thread} state is stepping into, stepping over, or stepping
	 *         return, <code>false</code> otherwise
	 */
	public static boolean isStepping(Thread thread) {
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& ThreadUtils.isSteppingState(thread.getState());
	}

	/**
	 * Tells if the given {@link State} is stepping.
	 * 
	 * @param state
	 *            the {@link State}
	 * @return <code>true</code> if the given {@link State} is one of {@link State#STEPPING_INTO},
	 *         {@link State#STEPPING_OVER}, {@link State#STEPPING_RETURN}.
	 */
	private static boolean isSteppingState(State state) {
		return state == State.STEPPING_INTO || state == State.STEPPING_OVER || state == State.STEPPING_RETURN;
	}

	/**
	 * Suspends the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void suspendRequest(Thread thread) {
		if (canSuspend(thread)) {
			thread.setState(State.SUSPENDING);
		} else {
			throw new IllegalStateException(
					"can't suspend a not running or stepping thread or a thread in a not connected debug target.");
		}
	}

	/**
	 * Notify the suspension of the given {@link Thread} to the given
	 * {@link StackFrame#getCurrentInstruction() instruction}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void suspendedReply(Thread thread) {
		final StackFrame topStackFrame = thread.getTopStackFrame();
		final State state = thread.getState();
		if (thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& (state == State.SUSPENDING || isActiveStat(state))) {
			thread.setState(State.SUSPENDED);
			if (topStackFrame != null) {
				ThreadUtils.unchangeVariables(thread);
			}
		} else {
			throw new IllegalStateException(
					"a suspend reply must happend when the thread is suspending, running, or stepping and the debug target is connected.");
		}
	}

	/**
	 * Resets the {@link Variable#isValueChanged() changed} {@link Variable} of the given {@link Thread}
	 * {@link Thread#getTopStackFrame() top stack frame}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	private static void unchangeVariables(Thread thread) {
		// TODO optimize by keeping track of changed variables with an adapter
		for (Variable variable : thread.getTopStackFrame().getVariables()) {
			if (variable.isValueChanged()) {
				variable.setValueChanged(false);
			}
		}
	}

	/**
	 * Requests the termination the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void terminateRequest(Thread thread) {
		if (ThreadUtils.canTerminate(thread)) {
			thread.setState(State.TERMINATING);
		} else {
			throw new IllegalStateException("can't terminate a thread if this debug target is not connected.");
		}
	}

	/**
	 * Notify the {@link terminateRequest termination} is done for the given {@link Thread} . The
	 * {@link Thread} {@link Thread#getState() state} must be {@link State#TERMINATING terminating}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void terminatedReply(Thread thread) {
		if ((thread.getDebugTarget().getState() == DebugTargetState.CONNECTED || thread.getDebugTarget()
				.getState() == DebugTargetState.TERMINATING)
				&& thread.getState() != State.TERMINATED) {
			thread.setState(State.TERMINATED);
		} else {
			throw new IllegalStateException(
					"a terminate reply can't happend when the debug target is not connected, terminating or if the thread is already terminated.");
		}
	}

	/**
	 * Tells if the given {@link Thread} can be terminated.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread}'s {@link Thread#getDebugTarget() debug target} is
	 *         connected.
	 */
	public static boolean canTerminate(Thread thread) {
		return DebugTargetUtils.canTerminate(thread.getDebugTarget());
	}

	/**
	 * Request to step over the given {@link Thread}. The {@link Thread} {@link Thread#getState() state} must
	 * be {@link State#SUSPENDED suspended}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void stepOverReply(Thread thread) {
		if (ThreadUtils.canStepOver(thread)) {
			thread.setState(State.STEPPING_OVER);
		} else {
			throw new IllegalStateException(
					"can't step over when the thread is not in suspended mode or the debug target is disconnected.");
		}
	}

	/**
	 * Tells if we can {@link ThreadUtils#stepReturnReply(Thread) step return} the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread} is suspended and the
	 *         {@link Thread#getTopStackFrame() top stack frame} has a {@link StackFrame#getParentFrame()
	 *         parent frame}.
	 */
	public static boolean canStepReturn(Thread thread) {
		final StackFrame topStackFrame = thread.getTopStackFrame();
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED && topStackFrame != null
				&& topStackFrame.getParentFrame() != null;
	}

	/**
	 * Request to step return the given {@link Thread}. The {@link Thread} {@link Thread#getState() state}
	 * must be {@link State#SUSPENDED suspended} and the {@link Thread#getTopStackFrame() top stack frame}
	 * must has a {@link StackFrame#getParentFrame() parent frame}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void stepReturnReply(Thread thread) {
		if (canStepReturn(thread)) {
			thread.setState(State.STEPPING_RETURN);
		} else {
			throw new IllegalStateException(
					"can't step return when the thread is not in suspended mode or the debug target is disconnected or the current stack frame don't have a parent frame.");
		}
	}

	/**
	 * Tells if we can {@link ThreadUtils#stepIntoReply(Thread) step into} the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread} is suspended.
	 */
	public static boolean canStepInto(Thread thread) {
		final StackFrame topStackFrame = thread.getTopStackFrame();
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED && topStackFrame != null
				&& topStackFrame.isCanStepIntoCurrentInstruction();
	}

	/**
	 * Request to step into the given {@link Thread}. The {@link Thread} {@link Thread#getState() state} must
	 * be {@link State#SUSPENDED suspended}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void stepIntoReply(Thread thread) {
		if (canStepInto(thread)) {
			thread.setState(State.STEPPING_INTO);
		} else {
			throw new IllegalStateException(
					"can't step into when the thread is not in suspended mode or the debug target is disconnected or the current instruction don't support step into.");
		}
	}

	/**
	 * Tells if we can {@link stepOverRequest step over} the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the given {@link Thread} is suspended.
	 */
	public static boolean canStepOver(Thread thread) {
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED;
	}

	/**
	 * Gets the {@link Variable} with the given {@link Variable#getName() name} from the
	 * {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @param name
	 *            the {@link Variable#getName() variable name}
	 * @return the {@link Variable} with the given {@link Variable#getName() name} from the
	 *         {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread} if any,
	 *         <code>null</code> otherwise
	 */
	public static Variable getVariable(Thread thread, String name) {
		final Variable res;
		final StackFrame topStackFrame = thread.getTopStackFrame();
		if (topStackFrame != null) {
			res = DebugTargetUtils.getVariable(topStackFrame, name);
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Notify sets the {@link Variable} with the given {@link Variable#getName() name} from the
	 * {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread} to the given
	 * {@link EObject value}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @param declarationTypeName
	 *            the {@link Variable#getDeclarationType() declaration type name}
	 * @param name
	 *            the {@link Variable#getName() variable name}
	 * @param value
	 *            the {@link Object value} to set
	 */
	public static void setVariableReply(Thread thread, String declarationTypeName, String name, Object value) {
		if (canSetVariable(thread)) {
			if (thread.getTopStackFrame() != null) {
				DebugTargetUtils.setVariable(thread.getTopStackFrame(), declarationTypeName, name, value);
			} else {
				throw new IllegalStateException("can't set a variable when there is not stack frame.");
			}
		} else {
			throw new IllegalStateException(
					"can't set a variable when the debug target is not connected or the thread is not suspended.");
		}
	}

	/**
	 * Tells if we can {@link ThreadUtils#setVariableReply(Thread, String, String, Object) set a variable} for
	 * the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the {@link Thread#getDebugTarget() debug target} is connected and the
	 *         {@link Thread} is suspended.
	 */
	private static boolean canSetVariable(Thread thread) {
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED;
	}

	/**
	 * Notify the deletion of the {@link Variable} with the given {@link Variable#getName() name} in the given
	 * {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @param name
	 *            the {@link Variable#getName() variable name}
	 */
	public static void deleteVariableReply(Thread thread, String name) {
		final Variable variable = getVariable(thread, name);
		if (variable != null) {
			EcoreUtil.delete(variable); // TODO optimize with a cross referencer
		}
	}

	/**
	 * Gets the {@link RegisterGroup} with the given {@link RegisterGroup#getName() name} from the
	 * {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @param name
	 *            the {@link RegisterGroup#getName() register group name}
	 * @return the {@link RegisterGroup} with the given {@link RegisterGroup#getName() name} from the
	 *         {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread} if any,
	 *         <code>null</code> otherwise
	 */
	public static RegisterGroup getRegisterGroup(Thread thread, String name) {
		final RegisterGroup res;
		final StackFrame topStackFrame = thread.getTopStackFrame();
		if (topStackFrame != null) {
			res = DebugTargetUtils.getRegisterGroup(topStackFrame, name);
		} else {
			res = null;
		}
		return res;
	}

	/**
	 * Notify pushing a new {@link StackFrame} with the given {@link StackFrame#getName() name} in the given
	 * {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @param name
	 *            the {@link StackFrame#getName() stack frame name}
	 * @param context
	 *            the {@link StackFrame#getContext() context}
	 * @param instruction
	 *            the {@link StackFrame#getCurrentInstruction() current instruction}
	 * @param canStepInto
	 *            tells if we can {@link StackFrame#isCanStepIntoCurrentInstruction() step into} the current
	 *            instruction
	 */
	public static void pushStackFrameReply(Thread thread, String name, EObject context, EObject instruction,
			boolean canStepInto) {
		if (ThreadUtils.canPushFrame(thread)) {
			final StackFrame topStackFrame = thread.getTopStackFrame();

			final StackFrame newFrame = DebugPackage.eINSTANCE.getDebugFactory().createStackFrame();
			newFrame.setName(name);
			newFrame.setContext(context);
			newFrame.setCurrentInstruction(instruction);
			newFrame.setCanStepIntoCurrentInstruction(canStepInto);
			if (topStackFrame != null) {
				newFrame.setParentFrame(topStackFrame);
				newFrame.setContext(topStackFrame.getCurrentInstruction());
			} else {
				thread.setBottomStackFrame(newFrame);
				newFrame.setContext(thread.getContext());
			}
			thread.setTopStackFrame(newFrame);
		} else {
			throw new IllegalStateException(
					"can't push a stack frame when the debug target is not connected or the thread is not suspended.");
		}
	}

	/**
	 * Tells if we can {@link ThreadUtils#pushStackFrameReply(Thread, String) push a stack frame}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the {@link Thread#getDebugTarget() debug target} is
	 *         {@link DebugTargetState#CONNECTED connected} and the given {@link Thread} is
	 *         {@link State#SUSPENDED}.
	 */
	public static boolean canPushFrame(Thread thread) {
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED;
	}

	/**
	 * Notify popping the {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 */
	public static void popStackFrameReply(Thread thread) {
		if (ThreadUtils.canPopFrame(thread)) {
			final StackFrame topStackFrame = thread.getTopStackFrame();
			thread.setTopStackFrame(topStackFrame.getParentFrame());
			EcoreUtil.delete(topStackFrame); // TODO optimize with cross referencer
		} else {
			throw new IllegalStateException(
					"can't pop a stack frame when the debug target is not connected or the thread is not suspended or the current top frame has no parent.");
		}
	}

	/**
	 * Tells if we can {@link ThreadUtils#popStackFrameReply(Thread) push a stack frame}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the {@link Thread#getDebugTarget() debug target} is
	 *         {@link DebugTargetState#CONNECTED connected} and the given {@link Thread} is suspended and
	 *         there is a {@link Thread#getTopStackFrame() top stack frame} with a
	 *         {@link StackFrame#getParentFrame() parent frame}.
	 */
	public static boolean canPopFrame(Thread thread) {
		final StackFrame topStackFrame = thread.getTopStackFrame();
		return thread.getDebugTarget().getState() == DebugTargetState.CONNECTED
				&& thread.getState() == State.SUSPENDED && topStackFrame != null
				&& topStackFrame.getParentFrame() != null;
	}

	/**
	 * Tells if the given {@link Thread} is suspended.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @return <code>true</code> if the {@link Thread#getState() state} is {@link State#SUSPENDED},
	 *         <code>false</code> otherwise
	 */
	public static boolean isSuspended(Thread thread) {
		return thread.getState() == State.SUSPENDED;
	}

	/**
	 * Get the containing {@link Thread} of the given {@link StackFrame}.
	 * 
	 * @param frame
	 *            the {@link StackFrame}
	 * @return the containing {@link Thread} of the given {@link StackFrame} if nay, <code>null</code>
	 *         otherwise
	 */
	public static Thread getThread(StackFrame frame) {
		Thread res = null;

		EObject current = frame.eContainer();
		while (current instanceof StackFrame) {
			current = current.eContainer();
		}

		if (current instanceof Thread) {
			res = (Thread)current;
		}

		return res;
	}

	/**
	 * Sets the {@link StackFrame#getCurrentInstruction() current instruction} of the
	 * {@link Thread#getTopStackFrame() top stack frame} of the given {@link Thread}.
	 * 
	 * @param thread
	 *            the {@link Thread}
	 * @param instruction
	 *            the {@link StackFrame#getCurrentInstruction() current instruction}
	 * @param canStepInto
	 *            tells if we can {@link StackFrame#isCanStepIntoCurrentInstruction() step into the current
	 *            instruction}
	 */
	public static void setCurrentInstructionReply(Thread thread, EObject instruction, boolean canStepInto) {
		final StackFrame topStackFrame = thread.getTopStackFrame();

		if (topStackFrame != null) {
			topStackFrame.setCurrentInstruction(instruction);
			topStackFrame.setCanStepIntoCurrentInstruction(canStepInto);
		} else {
			throw new IllegalStateException("can't set current instrcution when there is no top stack frame.");
		}
	}

}
