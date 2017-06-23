/**
 */
package com.avaloq.tools.ddk.xtext.format.format.impl;

import com.avaloq.tools.ddk.xtext.format.format.ColumnLocator;
import com.avaloq.tools.ddk.xtext.format.format.Constant;
import com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective;
import com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration;
import com.avaloq.tools.ddk.xtext.format.format.FormatFactory;
import com.avaloq.tools.ddk.xtext.format.format.FormatPackage;
import com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup;
import com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference;
import com.avaloq.tools.ddk.xtext.format.format.GrammarRule;
import com.avaloq.tools.ddk.xtext.format.format.GrammarRuleDirective;
import com.avaloq.tools.ddk.xtext.format.format.GroupBlock;
import com.avaloq.tools.ddk.xtext.format.format.IndentLocator;
import com.avaloq.tools.ddk.xtext.format.format.IntValue;
import com.avaloq.tools.ddk.xtext.format.format.KeywordPair;
import com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator;
import com.avaloq.tools.ddk.xtext.format.format.Locator;
import com.avaloq.tools.ddk.xtext.format.format.Matcher;
import com.avaloq.tools.ddk.xtext.format.format.MatcherList;
import com.avaloq.tools.ddk.xtext.format.format.MatcherType;
import com.avaloq.tools.ddk.xtext.format.format.NoFormatLocator;
import com.avaloq.tools.ddk.xtext.format.format.OffsetLocator;
import com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator;
import com.avaloq.tools.ddk.xtext.format.format.Rule;
import com.avaloq.tools.ddk.xtext.format.format.SpaceLocator;
import com.avaloq.tools.ddk.xtext.format.format.SpecificDirective;
import com.avaloq.tools.ddk.xtext.format.format.StringValue;
import com.avaloq.tools.ddk.xtext.format.format.WildcardRule;
import com.avaloq.tools.ddk.xtext.format.format.WildcardRuleDirective;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.XtextPackage;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormatPackageImpl extends EPackageImpl implements FormatPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formatConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grammarRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grammarRuleDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardRuleDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grammarElementReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grammarElementLookupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextFreeDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matcherListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keywordPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matcherEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noFormatLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spaceLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightPaddingLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linewrapLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass offsetLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indentLocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum matcherTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FormatPackageImpl()
  {
    super(eNS_URI, FormatFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FormatPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FormatPackage init()
  {
    if (isInited) return (FormatPackage)EPackage.Registry.INSTANCE.getEPackage(FormatPackage.eNS_URI);

    // Obtain or create and register package
    FormatPackageImpl theFormatPackage = (FormatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormatPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XtextPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFormatPackage.createPackageContents();

    // Initialize created meta-data
    theFormatPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFormatPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FormatPackage.eNS_URI, theFormatPackage);
    return theFormatPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormatConfiguration()
  {
    return formatConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormatConfiguration_TargetGrammar()
  {
    return (EReference)formatConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormatConfiguration_ExtendedFormatConfiguration()
  {
    return (EReference)formatConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormatConfiguration_FormatterBaseClass()
  {
    return (EReference)formatConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormatConfiguration_Constants()
  {
    return (EReference)formatConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormatConfiguration_Rules()
  {
    return (EReference)formatConfigurationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_IntType()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_StringType()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_IntValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_StringValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Literal()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntValue_Reference()
  {
    return (EReference)intValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Literal()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringValue_Reference()
  {
    return (EReference)stringValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Override()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrammarRule()
  {
    return grammarRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarRule_TargetRule()
  {
    return (EReference)grammarRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarRule_Directives()
  {
    return (EReference)grammarRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardRule()
  {
    return wildcardRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardRule_Directives()
  {
    return (EReference)wildcardRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrammarRuleDirective()
  {
    return grammarRuleDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardRuleDirective()
  {
    return wildcardRuleDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrammarElementReference()
  {
    return grammarElementReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarElementReference_Assignment()
  {
    return (EReference)grammarElementReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarElementReference_RuleCall()
  {
    return (EReference)grammarElementReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarElementReference_Self()
  {
    return (EReference)grammarElementReferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarElementReference_Rule()
  {
    return (EReference)grammarElementReferenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarElementReference_Keyword()
  {
    return (EReference)grammarElementReferenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrammarElementLookup()
  {
    return grammarElementLookupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarElementLookup_Rule()
  {
    return (EReference)grammarElementLookupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGrammarElementLookup_Keyword()
  {
    return (EAttribute)grammarElementLookupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextFreeDirective()
  {
    return contextFreeDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextFreeDirective_GrammarElements()
  {
    return (EReference)contextFreeDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextFreeDirective_MatcherList()
  {
    return (EReference)contextFreeDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecificDirective()
  {
    return specificDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificDirective_GrammarElements()
  {
    return (EReference)specificDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificDirective_MatcherList()
  {
    return (EReference)specificDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatcherList()
  {
    return matcherListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatcherList_Matchers()
  {
    return (EReference)matcherListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupBlock()
  {
    return groupBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupBlock_GrammarElement()
  {
    return (EReference)groupBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupBlock_MatcherList()
  {
    return (EReference)groupBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupBlock_SubGroup()
  {
    return (EReference)groupBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupBlock_Directives()
  {
    return (EReference)groupBlockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeywordPair()
  {
    return keywordPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeywordPair_Left()
  {
    return (EAttribute)keywordPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeywordPair_Right()
  {
    return (EAttribute)keywordPairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeywordPair_LeftMatchers()
  {
    return (EReference)keywordPairEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeywordPair_RightMatchers()
  {
    return (EReference)keywordPairEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatcher()
  {
    return matcherEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatcher_Locator()
  {
    return (EReference)matcherEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatcher_Type()
  {
    return (EAttribute)matcherEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatcher_Condition()
  {
    return (EReference)matcherEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocator()
  {
    return locatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoFormatLocator()
  {
    return noFormatLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpaceLocator()
  {
    return spaceLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpaceLocator_Value()
  {
    return (EReference)spaceLocatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpaceLocator_NoSpace()
  {
    return (EAttribute)spaceLocatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRightPaddingLocator()
  {
    return rightPaddingLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightPaddingLocator_Value()
  {
    return (EReference)rightPaddingLocatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinewrapLocator()
  {
    return linewrapLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinewrapLocator_Value()
  {
    return (EReference)linewrapLocatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinewrapLocator_Minimum()
  {
    return (EReference)linewrapLocatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinewrapLocator_Default()
  {
    return (EReference)linewrapLocatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinewrapLocator_Maximum()
  {
    return (EReference)linewrapLocatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinewrapLocator_NoLinewrap()
  {
    return (EAttribute)linewrapLocatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnLocator()
  {
    return columnLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnLocator_Fixed()
  {
    return (EAttribute)columnLocatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnLocator_Value()
  {
    return (EReference)columnLocatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnLocator_Parameter()
  {
    return (EReference)columnLocatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnLocator_Relative()
  {
    return (EAttribute)columnLocatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnLocator_Nobreak()
  {
    return (EAttribute)columnLocatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOffsetLocator()
  {
    return offsetLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOffsetLocator_Fixed()
  {
    return (EAttribute)offsetLocatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOffsetLocator_Value()
  {
    return (EReference)offsetLocatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOffsetLocator_Nobreak()
  {
    return (EAttribute)offsetLocatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndentLocator()
  {
    return indentLocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndentLocator_Increment()
  {
    return (EAttribute)indentLocatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentLocator_Value()
  {
    return (EReference)indentLocatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentLocator_Parameter()
  {
    return (EReference)indentLocatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMatcherType()
  {
    return matcherTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatFactory getFormatFactory()
  {
    return (FormatFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    formatConfigurationEClass = createEClass(FORMAT_CONFIGURATION);
    createEReference(formatConfigurationEClass, FORMAT_CONFIGURATION__TARGET_GRAMMAR);
    createEReference(formatConfigurationEClass, FORMAT_CONFIGURATION__EXTENDED_FORMAT_CONFIGURATION);
    createEReference(formatConfigurationEClass, FORMAT_CONFIGURATION__FORMATTER_BASE_CLASS);
    createEReference(formatConfigurationEClass, FORMAT_CONFIGURATION__CONSTANTS);
    createEReference(formatConfigurationEClass, FORMAT_CONFIGURATION__RULES);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__INT_TYPE);
    createEAttribute(constantEClass, CONSTANT__STRING_TYPE);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEAttribute(constantEClass, CONSTANT__INT_VALUE);
    createEAttribute(constantEClass, CONSTANT__STRING_VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__LITERAL);
    createEReference(intValueEClass, INT_VALUE__REFERENCE);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__LITERAL);
    createEReference(stringValueEClass, STRING_VALUE__REFERENCE);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__OVERRIDE);

    grammarRuleEClass = createEClass(GRAMMAR_RULE);
    createEReference(grammarRuleEClass, GRAMMAR_RULE__TARGET_RULE);
    createEReference(grammarRuleEClass, GRAMMAR_RULE__DIRECTIVES);

    wildcardRuleEClass = createEClass(WILDCARD_RULE);
    createEReference(wildcardRuleEClass, WILDCARD_RULE__DIRECTIVES);

    grammarRuleDirectiveEClass = createEClass(GRAMMAR_RULE_DIRECTIVE);

    wildcardRuleDirectiveEClass = createEClass(WILDCARD_RULE_DIRECTIVE);

    grammarElementReferenceEClass = createEClass(GRAMMAR_ELEMENT_REFERENCE);
    createEReference(grammarElementReferenceEClass, GRAMMAR_ELEMENT_REFERENCE__ASSIGNMENT);
    createEReference(grammarElementReferenceEClass, GRAMMAR_ELEMENT_REFERENCE__RULE_CALL);
    createEReference(grammarElementReferenceEClass, GRAMMAR_ELEMENT_REFERENCE__SELF);
    createEReference(grammarElementReferenceEClass, GRAMMAR_ELEMENT_REFERENCE__RULE);
    createEReference(grammarElementReferenceEClass, GRAMMAR_ELEMENT_REFERENCE__KEYWORD);

    grammarElementLookupEClass = createEClass(GRAMMAR_ELEMENT_LOOKUP);
    createEReference(grammarElementLookupEClass, GRAMMAR_ELEMENT_LOOKUP__RULE);
    createEAttribute(grammarElementLookupEClass, GRAMMAR_ELEMENT_LOOKUP__KEYWORD);

    contextFreeDirectiveEClass = createEClass(CONTEXT_FREE_DIRECTIVE);
    createEReference(contextFreeDirectiveEClass, CONTEXT_FREE_DIRECTIVE__GRAMMAR_ELEMENTS);
    createEReference(contextFreeDirectiveEClass, CONTEXT_FREE_DIRECTIVE__MATCHER_LIST);

    specificDirectiveEClass = createEClass(SPECIFIC_DIRECTIVE);
    createEReference(specificDirectiveEClass, SPECIFIC_DIRECTIVE__GRAMMAR_ELEMENTS);
    createEReference(specificDirectiveEClass, SPECIFIC_DIRECTIVE__MATCHER_LIST);

    matcherListEClass = createEClass(MATCHER_LIST);
    createEReference(matcherListEClass, MATCHER_LIST__MATCHERS);

    groupBlockEClass = createEClass(GROUP_BLOCK);
    createEReference(groupBlockEClass, GROUP_BLOCK__GRAMMAR_ELEMENT);
    createEReference(groupBlockEClass, GROUP_BLOCK__MATCHER_LIST);
    createEReference(groupBlockEClass, GROUP_BLOCK__SUB_GROUP);
    createEReference(groupBlockEClass, GROUP_BLOCK__DIRECTIVES);

    keywordPairEClass = createEClass(KEYWORD_PAIR);
    createEAttribute(keywordPairEClass, KEYWORD_PAIR__LEFT);
    createEAttribute(keywordPairEClass, KEYWORD_PAIR__RIGHT);
    createEReference(keywordPairEClass, KEYWORD_PAIR__LEFT_MATCHERS);
    createEReference(keywordPairEClass, KEYWORD_PAIR__RIGHT_MATCHERS);

    matcherEClass = createEClass(MATCHER);
    createEReference(matcherEClass, MATCHER__LOCATOR);
    createEAttribute(matcherEClass, MATCHER__TYPE);
    createEReference(matcherEClass, MATCHER__CONDITION);

    locatorEClass = createEClass(LOCATOR);

    noFormatLocatorEClass = createEClass(NO_FORMAT_LOCATOR);

    spaceLocatorEClass = createEClass(SPACE_LOCATOR);
    createEReference(spaceLocatorEClass, SPACE_LOCATOR__VALUE);
    createEAttribute(spaceLocatorEClass, SPACE_LOCATOR__NO_SPACE);

    rightPaddingLocatorEClass = createEClass(RIGHT_PADDING_LOCATOR);
    createEReference(rightPaddingLocatorEClass, RIGHT_PADDING_LOCATOR__VALUE);

    linewrapLocatorEClass = createEClass(LINEWRAP_LOCATOR);
    createEReference(linewrapLocatorEClass, LINEWRAP_LOCATOR__VALUE);
    createEReference(linewrapLocatorEClass, LINEWRAP_LOCATOR__MINIMUM);
    createEReference(linewrapLocatorEClass, LINEWRAP_LOCATOR__DEFAULT);
    createEReference(linewrapLocatorEClass, LINEWRAP_LOCATOR__MAXIMUM);
    createEAttribute(linewrapLocatorEClass, LINEWRAP_LOCATOR__NO_LINEWRAP);

    columnLocatorEClass = createEClass(COLUMN_LOCATOR);
    createEAttribute(columnLocatorEClass, COLUMN_LOCATOR__FIXED);
    createEReference(columnLocatorEClass, COLUMN_LOCATOR__VALUE);
    createEReference(columnLocatorEClass, COLUMN_LOCATOR__PARAMETER);
    createEAttribute(columnLocatorEClass, COLUMN_LOCATOR__RELATIVE);
    createEAttribute(columnLocatorEClass, COLUMN_LOCATOR__NOBREAK);

    offsetLocatorEClass = createEClass(OFFSET_LOCATOR);
    createEAttribute(offsetLocatorEClass, OFFSET_LOCATOR__FIXED);
    createEReference(offsetLocatorEClass, OFFSET_LOCATOR__VALUE);
    createEAttribute(offsetLocatorEClass, OFFSET_LOCATOR__NOBREAK);

    indentLocatorEClass = createEClass(INDENT_LOCATOR);
    createEAttribute(indentLocatorEClass, INDENT_LOCATOR__INCREMENT);
    createEReference(indentLocatorEClass, INDENT_LOCATOR__VALUE);
    createEReference(indentLocatorEClass, INDENT_LOCATOR__PARAMETER);

    // Create enums
    matcherTypeEEnum = createEEnum(MATCHER_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XtextPackage theXtextPackage = (XtextPackage)EPackage.Registry.INSTANCE.getEPackage(XtextPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    grammarRuleEClass.getESuperTypes().add(this.getRule());
    wildcardRuleEClass.getESuperTypes().add(this.getRule());
    contextFreeDirectiveEClass.getESuperTypes().add(this.getGrammarRuleDirective());
    contextFreeDirectiveEClass.getESuperTypes().add(this.getWildcardRuleDirective());
    specificDirectiveEClass.getESuperTypes().add(this.getGrammarRuleDirective());
    keywordPairEClass.getESuperTypes().add(this.getGrammarRuleDirective());
    keywordPairEClass.getESuperTypes().add(this.getWildcardRuleDirective());
    noFormatLocatorEClass.getESuperTypes().add(this.getLocator());
    spaceLocatorEClass.getESuperTypes().add(this.getLocator());
    rightPaddingLocatorEClass.getESuperTypes().add(this.getLocator());
    linewrapLocatorEClass.getESuperTypes().add(this.getLocator());
    columnLocatorEClass.getESuperTypes().add(this.getLocator());
    offsetLocatorEClass.getESuperTypes().add(this.getLocator());
    indentLocatorEClass.getESuperTypes().add(this.getLocator());

    // Initialize classes and features; add operations and parameters
    initEClass(formatConfigurationEClass, FormatConfiguration.class, "FormatConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormatConfiguration_TargetGrammar(), theXtextPackage.getGrammar(), null, "targetGrammar", null, 0, 1, FormatConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormatConfiguration_ExtendedFormatConfiguration(), this.getFormatConfiguration(), null, "extendedFormatConfiguration", null, 0, 1, FormatConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormatConfiguration_FormatterBaseClass(), theTypesPackage.getJvmDeclaredType(), null, "formatterBaseClass", null, 0, 1, FormatConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormatConfiguration_Constants(), this.getConstant(), null, "constants", null, 0, -1, FormatConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormatConfiguration_Rules(), this.getRule(), null, "rules", null, 0, -1, FormatConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_IntType(), theEcorePackage.getEBoolean(), "intType", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_StringType(), theEcorePackage.getEBoolean(), "stringType", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_IntValue(), theEcorePackage.getEIntegerObject(), "intValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_StringValue(), theEcorePackage.getEString(), "stringValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Literal(), theEcorePackage.getEIntegerObject(), "literal", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntValue_Reference(), this.getConstant(), null, "reference", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Literal(), theEcorePackage.getEString(), "literal", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringValue_Reference(), this.getConstant(), null, "reference", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Override(), theEcorePackage.getEBoolean(), "override", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grammarRuleEClass, GrammarRule.class, "GrammarRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrammarRule_TargetRule(), theXtextPackage.getAbstractRule(), null, "targetRule", null, 0, 1, GrammarRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrammarRule_Directives(), theEcorePackage.getEObject(), null, "directives", null, 0, -1, GrammarRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardRuleEClass, WildcardRule.class, "WildcardRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardRule_Directives(), this.getWildcardRuleDirective(), null, "directives", null, 0, -1, WildcardRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grammarRuleDirectiveEClass, GrammarRuleDirective.class, "GrammarRuleDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardRuleDirectiveEClass, WildcardRuleDirective.class, "WildcardRuleDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grammarElementReferenceEClass, GrammarElementReference.class, "GrammarElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrammarElementReference_Assignment(), theXtextPackage.getAssignment(), null, "assignment", null, 0, 1, GrammarElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrammarElementReference_RuleCall(), theXtextPackage.getRuleCall(), null, "ruleCall", null, 0, 1, GrammarElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrammarElementReference_Self(), theXtextPackage.getAbstractRule(), null, "self", null, 0, 1, GrammarElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrammarElementReference_Rule(), theXtextPackage.getAbstractRule(), null, "rule", null, 0, 1, GrammarElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrammarElementReference_Keyword(), theXtextPackage.getKeyword(), null, "keyword", null, 0, 1, GrammarElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grammarElementLookupEClass, GrammarElementLookup.class, "GrammarElementLookup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrammarElementLookup_Rule(), theXtextPackage.getAbstractRule(), null, "rule", null, 0, 1, GrammarElementLookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGrammarElementLookup_Keyword(), theEcorePackage.getEString(), "keyword", null, 0, 1, GrammarElementLookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextFreeDirectiveEClass, ContextFreeDirective.class, "ContextFreeDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextFreeDirective_GrammarElements(), this.getGrammarElementLookup(), null, "grammarElements", null, 0, -1, ContextFreeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContextFreeDirective_MatcherList(), this.getMatcherList(), null, "matcherList", null, 0, 1, ContextFreeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specificDirectiveEClass, SpecificDirective.class, "SpecificDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecificDirective_GrammarElements(), this.getGrammarElementReference(), null, "grammarElements", null, 0, -1, SpecificDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificDirective_MatcherList(), this.getMatcherList(), null, "matcherList", null, 0, 1, SpecificDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matcherListEClass, MatcherList.class, "MatcherList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatcherList_Matchers(), this.getMatcher(), null, "matchers", null, 0, -1, MatcherList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupBlockEClass, GroupBlock.class, "GroupBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupBlock_GrammarElement(), theXtextPackage.getCompoundElement(), null, "grammarElement", null, 0, 1, GroupBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupBlock_MatcherList(), this.getMatcherList(), null, "matcherList", null, 0, 1, GroupBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupBlock_SubGroup(), this.getGroupBlock(), null, "subGroup", null, 0, 1, GroupBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupBlock_Directives(), this.getGrammarRuleDirective(), null, "directives", null, 0, -1, GroupBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keywordPairEClass, KeywordPair.class, "KeywordPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeywordPair_Left(), theEcorePackage.getEString(), "left", null, 0, 1, KeywordPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeywordPair_Right(), theEcorePackage.getEString(), "right", null, 0, 1, KeywordPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeywordPair_LeftMatchers(), this.getMatcher(), null, "leftMatchers", null, 0, -1, KeywordPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeywordPair_RightMatchers(), this.getMatcher(), null, "rightMatchers", null, 0, -1, KeywordPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matcherEClass, Matcher.class, "Matcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatcher_Locator(), this.getLocator(), null, "locator", null, 0, 1, Matcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatcher_Type(), this.getMatcherType(), "type", null, 0, 1, Matcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatcher_Condition(), theXbasePackage.getXExpression(), null, "condition", null, 0, 1, Matcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locatorEClass, Locator.class, "Locator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noFormatLocatorEClass, NoFormatLocator.class, "NoFormatLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(spaceLocatorEClass, SpaceLocator.class, "SpaceLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpaceLocator_Value(), this.getStringValue(), null, "value", null, 0, 1, SpaceLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpaceLocator_NoSpace(), theEcorePackage.getEBoolean(), "noSpace", null, 0, 1, SpaceLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rightPaddingLocatorEClass, RightPaddingLocator.class, "RightPaddingLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRightPaddingLocator_Value(), this.getIntValue(), null, "value", null, 0, 1, RightPaddingLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linewrapLocatorEClass, LinewrapLocator.class, "LinewrapLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinewrapLocator_Value(), this.getIntValue(), null, "value", null, 0, 1, LinewrapLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinewrapLocator_Minimum(), this.getIntValue(), null, "minimum", null, 0, 1, LinewrapLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinewrapLocator_Default(), this.getIntValue(), null, "default", null, 0, 1, LinewrapLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinewrapLocator_Maximum(), this.getIntValue(), null, "maximum", null, 0, 1, LinewrapLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinewrapLocator_NoLinewrap(), theEcorePackage.getEBoolean(), "noLinewrap", null, 0, 1, LinewrapLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnLocatorEClass, ColumnLocator.class, "ColumnLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnLocator_Fixed(), theEcorePackage.getEBoolean(), "fixed", null, 0, 1, ColumnLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnLocator_Value(), this.getIntValue(), null, "value", null, 0, 1, ColumnLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnLocator_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, 1, ColumnLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnLocator_Relative(), theEcorePackage.getEBoolean(), "relative", null, 0, 1, ColumnLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnLocator_Nobreak(), theEcorePackage.getEBoolean(), "nobreak", null, 0, 1, ColumnLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(offsetLocatorEClass, OffsetLocator.class, "OffsetLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOffsetLocator_Fixed(), theEcorePackage.getEBoolean(), "fixed", null, 0, 1, OffsetLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOffsetLocator_Value(), this.getIntValue(), null, "value", null, 0, 1, OffsetLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOffsetLocator_Nobreak(), theEcorePackage.getEBoolean(), "nobreak", null, 0, 1, OffsetLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indentLocatorEClass, IndentLocator.class, "IndentLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndentLocator_Increment(), theEcorePackage.getEBoolean(), "increment", null, 0, 1, IndentLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndentLocator_Value(), this.getIntValue(), null, "value", null, 0, 1, IndentLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndentLocator_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, 1, IndentLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(matcherTypeEEnum, MatcherType.class, "MatcherType");
    addEEnumLiteral(matcherTypeEEnum, MatcherType.BEFORE);
    addEEnumLiteral(matcherTypeEEnum, MatcherType.AFTER);
    addEEnumLiteral(matcherTypeEEnum, MatcherType.AROUND);
    addEEnumLiteral(matcherTypeEEnum, MatcherType.BETWEEN);
    addEEnumLiteral(matcherTypeEEnum, MatcherType.RANGE);

    // Create resource
    createResource(eNS_URI);
  }

} //FormatPackageImpl