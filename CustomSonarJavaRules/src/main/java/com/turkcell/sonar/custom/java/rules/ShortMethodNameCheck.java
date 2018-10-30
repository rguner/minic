/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package com.turkcell.sonar.custom.java.rules;

import org.sonar.api.rule.RuleKey;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.MethodTree;

/**
 * This class is an example of how to implement your own rules.
 * The (stupid) rule raises a minor issue each time a method is encountered.
 * The @Rule annotation allows to specify the rule key, name, description and default severity.
 */
@Rule(key = ShortMethodNameCheck.KEY, priority = Priority.MINOR, name = "Avoid using short method name", description = "The rule to avoid using short method names.")
/**
 * The class extends BaseTreeVisitor: the visitor for the Java AST.
 * The logic of the rule is implemented by overriding its methods.
 * It also implements the JavaFileScanner interface to be injected with the JavaFileScannerContext to attach issues to this context.
 */
public class ShortMethodNameCheck extends BaseTreeVisitor implements JavaFileScanner {

  public static final String KEY = "shortmethodname";
  private final RuleKey RULE_KEY = RuleKey.of(JavaExtensionRulesRepository.REPOSITORY_KEY, KEY);

  /**
   * Private field to store the context: this is the object used to create issues.
   */
  private JavaFileScannerContext context;

  /**
   * Implementation of the method of the JavaFileScanner interface.
   * @param context Object used to attach issues to source file.
   */
  @Override
  public void scanFile(JavaFileScannerContext context) {
    this.context = context;
    
    // The call to the scan method on the root of the tree triggers the visit of the AST by this visitor
    scan(context.getTree());
    
    // For debugging purpose, you can print out the entire AST of the analyzed file
    //System.out.println("... "+ PrinterVisitor.print(context.getTree()));

  }


  /**
   * Overriding the visitor method to implement the logic of the rule.
   * @param tree AST of the visited method.
   */
  @Override
  public void visitMethod(MethodTree tree) {
    
	// All the code located before the call to the overridden method is executed before visiting the node

    // Adds an issue by attaching it with the tree and the rule
	if (tree.simpleName()!=null && tree.simpleName().name().length()<3)
		context.addIssue(tree, RULE_KEY, "Avoid using short method name issue raised on method.");
    
    // The call to the super implementation allows to continue the visit of the AST.
    // Be careful to always call this method to visit every node of the tree.
    super.visitMethod(tree);

    // All the code located after the call to the overridden method is executed when leaving the node
  }

}
