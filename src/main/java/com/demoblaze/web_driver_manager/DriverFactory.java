package com.demoblaze.web_driver_manager;

import static com.demoblaze.utilities.Context.getConfigFileReader;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.demoblaze.enums.DriverType;
import com.demoblaze.enums.EnvironmentType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private WebDriver driver;
	private BrowserConfigurationOptions browserConfiguration;
	private static DriverType driverType;
	private static EnvironmentType environmentType;

	public DriverFactory() {
		browserConfiguration = new BrowserConfigurationOptions();
		driverType = getConfigFileReader().getBrowser();
		environmentType = getConfigFileReader().getEnvironment();
	}

	public WebDriver getDriver() {

		if (driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	private WebDriver createDriver() {
		switch (environmentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case REMOTE:
			driver = createRemoteDriver();
			break;
		}
		return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	private WebDriver createLocalDriver() {
		switch (driverType) {
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(browserConfiguration.getChromeOptions());
			break;
		case INTERNETEXPLORER:
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		}

		if (getConfigFileReader().getBrowserWindowSize()) {
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(getConfigFileReader().getImplicitlyWait()));
		return driver;
	}

	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}