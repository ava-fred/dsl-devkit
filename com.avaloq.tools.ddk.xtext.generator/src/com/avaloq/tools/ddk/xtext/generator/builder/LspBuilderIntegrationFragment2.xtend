/*******************************************************************************
 * Copyright (c) 2016 Avaloq Evolution AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Avaloq Evolution AG - initial API and implementation
 *******************************************************************************/

package com.avaloq.tools.ddk.xtext.generator.builder

import com.google.inject.Inject
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager;
import org.eclipse.osgi.util.NLS
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.TypeReference

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.xtext.GrammarUtil.*
import org.eclipse.xtext.GrammarUtil

class LspBuilderIntegrationFragment2 extends AbstractXtextGeneratorFragment {

  static val LOGGER = LogManager.getLogger(LspBuilderIntegrationFragment2)

  @Inject FileAccessFactory fileAccessFactory

  @Inject XtextGeneratorNaming packageNaming

  def private TypeReference createSuffixedTypeReference(String suffix) {
    return new TypeReference(
      packageNaming.getGenericIdeBasePackage(grammar), GrammarUtil.getSimpleName(grammar) + suffix
    )
  }

  def protected TypeReference getLspBuildSetupGeneratedClass() {
    createSuffixedTypeReference("LspBuildSetupGenerated")
  }

  def protected TypeReference getLspBuildSetupServiceClass() {
    createSuffixedTypeReference("LspBuildSetupService")
  }

  override generate() {
    if (projectConfig.genericIde.enabled) {
      if (LOGGER.isInfoEnabled()) {
        LOGGER.info(NLS.bind("executing generate for {0}", getClass().getName()));
      }
      generateServiceRegistration
      generateBuildService
      generateBuildSetup
    }
  }

  def generateServiceRegistration() {
    fileAccessFactory.createTextFile("META-INF/services/com.avaloq.tools.ddk.xtext.build.ILspLanguageSetup", '''
      «getLspBuildSetupServiceClass.name»
    ''').writeTo(projectConfig.genericIde.srcGen)
  }

  def generateBuildService() {
    fileAccessFactory.createJavaFile(getLspBuildSetupServiceClass, '''
      import java.util.List;

      import com.avaloq.tools.ddk.xtext.build.AbstractDynamicSetupService;
      import com.avaloq.tools.ddk.xtext.build.ILspLanguageSetup;
      import com.google.common.collect.ImmutableList;
      import com.google.inject.Injector;
      import com.google.inject.Module;

      /**
       * Generated by com.avaloq.tools.ddk.xtext.generator.builder.LspBuilderIntegrationFragment2.
       */
      public class «lspBuildSetupServiceClass.simpleName» extends AbstractDynamicSetupService implements ILspLanguageSetup {

        @SuppressWarnings("nls")
        private static final String GRAMMAR = "«grammar.name»";
        @SuppressWarnings("nls")
        private static final List<String> PARENTS = ImmutableList.of(//
           «FOR g: grammar.allUsedGrammars SEPARATOR '
,'»"«g.name»" //«ENDFOR»
        );

        public Injector doSetup(Module overrideModule, Module... additionalModules) {
          return new «grammar.simpleName»LspBuildSetupGenerated(SETUP_LOCK, overrideModule, additionalModules).createInjectorAndDoEMFRegistration();
        }

        @Override
        public List<String> getParentLanguages() {
          return PARENTS;
        }

        @Override
        public String getLanguageName() {
          return GRAMMAR;
        }

      }
    ''').writeTo(projectConfig.genericIde.srcGen)
  }

  def generateBuildSetup() {
    fileAccessFactory.createJavaFile(getLspBuildSetupGeneratedClass, '''
      import org.eclipse.xtext.util.Modules2;

      import com.google.common.collect.ImmutableList;
      import com.google.inject.Guice;
      import com.google.inject.Injector;
      import com.google.inject.Module;
      import com.google.inject.util.Modules;


      /**
       * Generated by com.avaloq.tools.ddk.xtext.generator.builder.LspBuilderIntegrationFragment2.
       */
      public class «lspBuildSetupGeneratedClass.simpleName» extends «packageNaming.getGenericIdeSetup(grammar)» {

        private final Module overrideModule;
        private final Module[] additionalModules;
        private final Object lock;

        public «lspBuildSetupGeneratedClass.simpleName»(final Object lock, final Module overrideModule, Module... additionalModules) {
          this.lock = lock;
          this.overrideModule = overrideModule;
          this.additionalModules = additionalModules;
        }

        public «lspBuildSetupGeneratedClass.simpleName»(final Module overrideModule, Module... additionalModules) {
          this.lock = null;
          this.overrideModule = overrideModule;
          this.additionalModules = additionalModules;
        }

        @Override
        public Injector createInjectorAndDoEMFRegistration() {
          registerEPackages();
          Injector injector = createInjector();
          if (lock != null) {
            synchronized (lock)  {
              register(injector);
            }
          } else {
            register(injector);
          }
          return injector;
        }

        @Override
        public Injector createInjector() {
          return Guice.createInjector(getModules());
        }

        protected void registerEPackages() {
          «FOR mmd: grammar.metamodelDeclarations.typeSelect(GeneratedMetamodel)»
            if («grammar.namespace».«mmd.name».«mmd.name.toFirstUpper()»Package.eINSTANCE == null) {
              throw new IllegalStateException("EPackage could not be initialized: " + «grammar.namespace».«mmd.name».«mmd.name.toFirstUpper()»Package.eNS_URI); //$NON-NLS-1$
            }
          «ENDFOR»
        }

        protected Iterable<Module> getModules() {
          return ImmutableList.<Module> builder().add(Modules.override(Modules2.mixin(new «grammar.name»RuntimeModule(), new «packageNaming.getGenericIdeModule(grammar)»())).with(overrideModule)).add(additionalModules).build();
        }

      }
    ''').writeTo(projectConfig.genericIde.srcGen)
  }

}
