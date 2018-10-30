/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package com.turkcell.sonar.custom.java.rules;

import java.util.List;

import org.sonar.api.SonarPlugin;

import com.google.common.collect.ImmutableList;

/**
 * Entry point of the plugin.
 * Declares one single extension point: a custom rules repository.
 */
public class JavaExtensionPlugin extends SonarPlugin {

  @Override
  public List getExtensions() {
    return ImmutableList.of(JavaExtensionRulesRepository.class);
  }

}
