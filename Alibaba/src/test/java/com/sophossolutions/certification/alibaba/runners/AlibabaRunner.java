package com.sophossolutions.certification.alibaba.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
/*
 * Project Runner
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/Alibaba.feature",
		glue = "com.sophossolutions.certification.alibaba.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class AlibabaRunner {

}
