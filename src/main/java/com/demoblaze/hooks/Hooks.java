package com.demoblaze.hooks;

import static com.demoblaze.utilities.Context.clearId;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import com.demoblaze.utilities.Context;
import com.demoblaze.utilities.ScreenshotUtility;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	ScreenshotUtility screamShot;

	public Hooks() {
		screamShot = new ScreenshotUtility();
	}

	@Before
	public void inicializar(Scenario cenario) {
		Context.start(cenario);
	}

	@After
	public void finalizar(Scenario scenario) {
		screamShot.takeScreenshot(scenario);
		clearId();
		getWebDriverManager().closeDriver();
	}
}