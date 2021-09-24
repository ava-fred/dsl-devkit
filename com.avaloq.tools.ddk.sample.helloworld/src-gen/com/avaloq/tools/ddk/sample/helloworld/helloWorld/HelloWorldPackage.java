/**
 * generated by Xtext 2.19.0
 */
package com.avaloq.tools.ddk.sample.helloworld.helloWorld;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.HelloWorldFactory
 * @model kind="package"
 * @generated
 */
public interface HelloWorldPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "helloWorld";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.avaloq.com/tools/ddk/sample/helloworld/HelloWorld";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "helloWorld";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HelloWorldPackage eINSTANCE = com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl.init();

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.ModelImpl
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The feature id for the '<em><b>Keywords Example</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__KEYWORDS_EXAMPLE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.GreetingImpl
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__NAME = 0;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.KeywordsExampleImpl <em>Keywords Example</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.KeywordsExampleImpl
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl#getKeywordsExample()
   * @generated
   */
  int KEYWORDS_EXAMPLE = 2;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORDS_EXAMPLE__OPTION = 0;

  /**
   * The number of structural features of the '<em>Keywords Example</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORDS_EXAMPLE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getKeywordsExample <em>Keywords Example</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Keywords Example</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getKeywordsExample()
   * @see #getModel()
   * @generated
   */
  EReference getModel_KeywordsExample();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Greeting#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.Greeting#getName()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Name();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.KeywordsExample <em>Keywords Example</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keywords Example</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.KeywordsExample
   * @generated
   */
  EClass getKeywordsExample();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.KeywordsExample#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.KeywordsExample#getOption()
   * @see #getKeywordsExample()
   * @generated
   */
  EAttribute getKeywordsExample_Option();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HelloWorldFactory getHelloWorldFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.ModelImpl
     * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '<em><b>Keywords Example</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__KEYWORDS_EXAMPLE = eINSTANCE.getModel_KeywordsExample();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.GreetingImpl
     * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.KeywordsExampleImpl <em>Keywords Example</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.KeywordsExampleImpl
     * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.HelloWorldPackageImpl#getKeywordsExample()
     * @generated
     */
    EClass KEYWORDS_EXAMPLE = eINSTANCE.getKeywordsExample();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEYWORDS_EXAMPLE__OPTION = eINSTANCE.getKeywordsExample_Option();

  }

} //HelloWorldPackage
