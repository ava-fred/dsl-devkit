/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.sample.helloworld.ui;

import com.avaloq.tools.ddk.sample.helloworld.ui.internal.HelloworldActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class HelloWorldUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return HelloworldActivator.getInstance().getInjector("com.avaloq.tools.ddk.sample.helloworld.HelloWorld");
	}

}
