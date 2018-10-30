/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package com.turkcell.sonar.custom.java.rules;

import org.apache.commons.lang.StringUtils;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.Tree;

import javax.annotation.Nullable;
import java.util.List;

public class PrinterVisitor extends BaseTreeVisitor {

  private static final int INDENT_SPACES = 2;

  private final StringBuilder sb;
  private int indentLevel;

  public PrinterVisitor() {
    sb = new StringBuilder();
    indentLevel = 0;
  }

  public static String print(Tree tree) {
    PrinterVisitor pv = new PrinterVisitor();
    pv.scan(tree);
    return pv.sb.toString();
  }

  public static String print(List<? extends Tree> trees) {
    StringBuilder result = new StringBuilder();
    for (Tree tree : trees) {
      result.append(print(tree));
    }
    return result.toString();
  }

  private StringBuilder indent() {
    return sb.append(StringUtils.leftPad("", INDENT_SPACES * indentLevel));
  }

  @Override
  protected void scan(List<? extends Tree> trees) {
    if (!trees.isEmpty()) {
      sb.deleteCharAt(sb.length() - 1);
      sb.append(" : [\n");
      super.scan(trees);
      indent().append("]\n");
    }
  }

  @Override
  protected void scan(@Nullable Tree tree) {
    if (tree != null) {
      String nodeName = tree.getClass().getInterfaces()[0].getSimpleName();
      indent().append(nodeName).append("\n");
    }
    indentLevel++;
    super.scan(tree);
    indentLevel--;
  }
}
