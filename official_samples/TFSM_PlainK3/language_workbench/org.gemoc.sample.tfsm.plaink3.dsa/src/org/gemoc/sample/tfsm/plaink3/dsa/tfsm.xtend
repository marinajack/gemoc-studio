package org.gemoc.sample.tfsm.plaink3.dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.sample.tfsm_plaink3.FSMClock
import org.gemoc.sample.tfsm_plaink3.FSMEvent
import org.gemoc.sample.tfsm_plaink3.State
import org.gemoc.sample.tfsm_plaink3.TFSM
import org.gemoc.sample.tfsm_plaink3.Transition

import static extension org.gemoc.sample.tfsm.plaink3.dsa.FSMClockAspect.*
import static extension org.gemoc.sample.tfsm.plaink3.dsa.FSMEventAspect.*
import static extension org.gemoc.sample.tfsm.plaink3.dsa.TFSMAspect.*
import static extension org.gemoc.sample.tfsm.plaink3.dsa.TFSMVisitorAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step

@Aspect(className=TFSM)
class TFSMAspect {

	@Step
	def public void init() {

		_self.currentState = _self.initialState;
		_self.localClock.numberOfTicks = 0
		_self.localEvents.forEach[e|e.isTriggered = false]
		_self.stepNumber = 0
		_self.lastStateChangeStepNumber = 0

		println("[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".Init()]Initialized " + _self.name)
	}

}

@Aspect(className=FSMClock)
class FSMClockAspect {

	// Clock tick
	@Step
	def public Integer ticks() {
		_self.numberOfTicks = _self.numberOfTicks + 1
		println(
			"[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".ticks()]New number of ticks : " +
				_self.numberOfTicks.toString)
		return _self.numberOfTicks
	}

}

@Aspect(className=State)
class StateAspect {
	def public void onEnter() {
		println("[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".onEnter()]Entering " + _self.name)
	}

	def public void onLeave() {
		println("[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".onLeave()]Leaving " + _self.name)
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
		_self.source.owningFSM.currentState = _self.target
		println(
			"[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".fire()]Fired " + _self.name + " -> " +
				_self.action)
	}
}

@Aspect(className=FSMEvent)
class FSMEventAspect {

	@Step
	def public void trigger() {
		_self.isTriggered = true
	}

	@Step
	def public void unTrigger() {
		_self.isTriggered = false
	}

}
