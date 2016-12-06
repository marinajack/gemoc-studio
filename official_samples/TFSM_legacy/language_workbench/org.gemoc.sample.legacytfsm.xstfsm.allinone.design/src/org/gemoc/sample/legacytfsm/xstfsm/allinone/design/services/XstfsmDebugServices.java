package org.gemoc.sample.legacytfsm.xstfsm.allinone.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.execution.sequential.javaengine.ui.Activator;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XstfsmDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("TimeFSM_AllInOne", "Debug"));

		return res;
	}

	@Override
	public String getModelIdentifier() {
		return Activator.DEBUG_MODEL_ID;
	}

}