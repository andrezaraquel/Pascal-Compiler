/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.pascal.ui.internal.PascalActivator;

public class PascalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PascalActivator.getInstance().getInjector("org.xtext.example.pascal.Pascal");
	}

}
