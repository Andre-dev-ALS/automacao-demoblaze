package com.demoblaze.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(

		tags = { "@ID_0005" },

		features = {

				"src/test/resources/features" },

		glue = {

				"com.demoblaze.login",

				"com.demoblaze.cadastro",

				"com.demoblaze.sobre",

				"com.demoblaze.hooks" },

		plugin = { "pretty", "summary", },

		snippets = SnippetType.CAMELCASE,

		monochrome = true,

		dryRun = false,

		strict = false)

@RunWith(Cucumber.class

)

public class RunnerTest {
}
