package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features",glue ={"Stepdefinition","Hooks"},
tags = "@TC101",plugin = "json:target\\report\\Adactin.json",
dryRun = false,monochrome = true)

public class Runner {

}/*
	 * {"html:target\\report\\Adactin_report.html",
	 * "json:target\\report\\Adactin_JReport.json",
	 * "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	 */