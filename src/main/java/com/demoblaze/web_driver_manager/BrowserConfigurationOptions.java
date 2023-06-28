package com.demoblaze.web_driver_manager;

import java.util.Collections;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfigurationOptions {
	private ChromeOptions chromeOptions;

	public BrowserConfigurationOptions() {
		setChromeOptions();
	}

	public ChromeOptions getChromeOptions() {
		return chromeOptions;
	}

	private void setChromeOptions() {
		chromeOptions = new ChromeOptions();

		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		chromeOptions.addArguments("--disable-notifications", "--no-sandbox", "--single-process", "--incognito",
				"--disable-blink-features=AutomationControlled", "--remote-allow-origins=*");

	}

}