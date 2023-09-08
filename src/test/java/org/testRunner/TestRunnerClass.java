package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Pradeep\\workspace\\Cucumber_Quience1\\src\\test\\resources\\Feature_Quience",
glue="org.stepDefinition")
public class TestRunnerClass {

}
