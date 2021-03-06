/*******************************************************************************
 * Copyright (c) 2015, 2017  Inria  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.concurrent.language.wb.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.gemoc.concurrent.language.wb.sample.deployer.Activator;

public class TFSMExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.zip", "org.gemoc.sample.tfsm.concurrent"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.k3dsa.zip", "org.gemoc.sample.tfsm.concurrent.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.moc.dse.zip", "org.gemoc.sample.tfsm.concurrent.moc.dse"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.moc.lib.zip", "org.gemoc.sample.tfsm.concurrent.moc.lib"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.model.zip", "org.gemoc.sample.tfsm.concurrent.model"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.xtfsm.zip", "org.gemoc.sample.tfsm.concurrent.xtfsm"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.xtfsm.design.zip", "org.gemoc.sample.tfsm.concurrent.xtfsm.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.xtfsm.edit.zip", "org.gemoc.sample.tfsm.concurrent.xtfsm.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.tfsm.concurrent.xtfsm.editor.zip", "org.gemoc.sample.tfsm.concurrent.xtfsm.editor"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}