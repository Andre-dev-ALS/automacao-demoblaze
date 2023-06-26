package com.demoblaze.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(

		tags = "",

		features = { "" },

		glue = { "" },

		plugin = { "pretty", "summary", },

		snippets = SnippetType.CAMELCASE,

		monochrome = true,

		dryRun = false,

		strict = true)

@RunWith(Cucumber.class

)

public class RunnerTest {

}