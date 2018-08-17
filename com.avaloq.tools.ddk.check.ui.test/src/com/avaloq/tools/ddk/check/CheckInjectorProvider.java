/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.check;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;

import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 * Producer strategy for {@link Injector Injectors}.
 */
public class CheckInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

  private GlobalStateMemento stateBeforeInjectorCreation;
  private GlobalStateMemento stateAfterInjectorCreation;
  private Injector injector;

  static {
    GlobalRegistries.initializeDefaults();
  }

  @Override
  public Injector getInjector() {
    if (injector == null) {
      stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
      this.injector = internalCreateInjector();
      stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    }
    return injector;
  }

  /**
   * Create an {@link Injector}.
   * 
   * @return the {@link Injector}
   */
  protected Injector internalCreateInjector() {
    return new CheckStandaloneSetup() {
      @Override
      public Injector createInjector() {
        return Guice.createInjector(createRuntimeModule());
      }
    }.createInjectorAndDoEMFRegistration();
  }

  /**
   * Create a {@link CheckRuntimeModule}.
   * 
   * @return the {@link CheckRuntimeModule}
   */
  protected CheckRuntimeModule createRuntimeModule() {
    // make it work also with Maven/Tycho and OSGI
    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
    return new CheckRuntimeModule() {
      @Override
      public ClassLoader bindClassLoaderToInstance() {
        return CheckInjectorProvider.class.getClassLoader();
      }
    };
  }

  @Override
  public void restoreRegistry() {
    stateBeforeInjectorCreation.restoreGlobalState();
  }

  @Override
  public void setupRegistry() {
    getInjector();
    stateAfterInjectorCreation.restoreGlobalState();
  }
}
