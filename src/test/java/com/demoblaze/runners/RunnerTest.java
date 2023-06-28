package com.demoblaze.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(

		tags = "@ID_0001",

		features = { "src\\test\\resources\\features" },

		glue = {

				"com.demoblaze.steps",

				"com.demoblaze.hooks" },

		plugin = { "pretty", "summary", },

		snippets = SnippetType.CAMELCASE,

		monochrome = true,

		dryRun = false,

		strict = true)

@RunWith(Cucumber.class

)

public class RunnerTest {

}