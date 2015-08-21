package org.gemoc.execution.engine.io.addons;

import java.util.Collection;

import org.eclipse.ui.PlatformUI;
import org.gemoc.commons.eclipse.ui.ViewHelper;
import org.gemoc.concurrent_addons.eventscheduling.timeline.views.timeline.EventSchedulingTimeLineView;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.LogicalStep;
import org.gemoc.executionframework.ui.views.engine.EnginesStatusView;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.engine_addon.DefaultEngineAddon;
import org.gemoc.gemoc_modeling_workbench.concurrent.ui.views.step.LogicalStepsView;
import org.gemoc.gemoc_modeling_workbench.concurrent.ui.views.stimulimanager.StimuliManagerView;

public class PrepareViewFrontend extends DefaultEngineAddon 
{

	private EventSchedulingTimeLineView _timelineView;
	
	@Override
	public void engineStarted(final IExecutionEngine engine) 
	{
		if (PlatformUI.isWorkbenchRunning())
		{
			PlatformUI
				.getWorkbench()
				.getDisplay()
				.syncExec(
						new Runnable()
						{
							@Override
							public void run() {
								ViewHelper.retrieveView(StimuliManagerView.ID);
								ViewHelper.showView(EnginesStatusView.ID);
								_timelineView = ViewHelper.showView(EventSchedulingTimeLineView.ID);
								_timelineView.configure(engine);
								ViewHelper.showView(LogicalStepsView.ID);
							}			
						});	
		}
	}

	@Override
	public void aboutToSelectLogicalStep(IExecutionEngine engine, Collection<LogicalStep> logicalSteps) 
	{
		_timelineView.update(engine);
	}

	@Override
	public void logicalStepSelected(IExecutionEngine engine, LogicalStep selectedLogicalStep) 
	{
		_timelineView.update(engine);
	}

	@Override
	public void proposedLogicalStepsChanged(IExecutionEngine engine, Collection<LogicalStep> logicalSteps) {
		_timelineView.update(engine);
	}
	
	

}
