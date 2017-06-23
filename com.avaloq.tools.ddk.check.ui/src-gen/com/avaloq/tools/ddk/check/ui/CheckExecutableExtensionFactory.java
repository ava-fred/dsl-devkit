/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.check.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.avaloq.tools.ddk.check.ui.internal.CheckActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CheckExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CheckActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CheckActivator.getInstance().getInjector(CheckActivator.COM_AVALOQ_TOOLS_DDK_CHECK_CHECK);
	}
	
}