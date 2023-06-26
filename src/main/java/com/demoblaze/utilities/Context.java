package com.demoblaze.utilities;

import java.util.ArrayList;

import com.demoblaze.data_provider.ConfigFileReader;
import com.demoblaze.web_driver_manager.DriverFactory;

import io.cucumber.core.api.Scenario;

public class Context {
	private static String id;
	private static ConfigFileReader configFileReader;
	private static DriverFactory webDriverManager;
	private static WaitActions wait;
	private static WebActions webActions;

	public static String getId() {
		return id;
	}

	private static void setId(Scenario scenario) {
		String formattedId = "";
		ArrayList<String> ids = (ArrayList<String>) scenario.getSourceTagNames();
		for (int i = 0; i < ids.size(); i++) {
			formattedId = StringFormatter.formatString(ids.get(i), "@", "");
			id = formattedId;
		}
	}

	public static void clearId() {
		id = "";
	}

	public static ConfigFileReader getConfigFileReader() {
		return configFileReader;
	}

	private static void setConfigFileReader() {
		configFileReader = new ConfigFileReader();
	}

	public static DriverFactory getWebDriverManager() {
		return webDriverManager;
	}

	private static void setWebDriverManager() {
		webDriverManager = new DriverFactory();
	}

	public static WaitActions getWait() {
		return wait;
	}

	private static void setWait() {
		wait = new WaitActions(webDriverManager.getDriver());
	}

	public static WebActions getWebActions() {
		return webActions;
	}

	private static void setWebActions() {
		webActions = new WebActions(webDriverManager.getDriver(), getWait());
	}

	public static void start(Scenario cenario) {
		setConfigFileReader();
		setWebDriverManager();
		setId(cenario);
		setWait();
		setWebActions();
	}
}
