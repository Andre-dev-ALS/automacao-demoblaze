package com.demoblaze.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitActions {
	public static final int STANDARD_TIME = 30;
	private WebDriver driver;
	private WebDriverWait wait;

	public WaitActions(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	private void setWait(int waitingTime) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
	}

	public boolean waitForElementToBeVisible(WebElement webElement, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.visibilityOf(webElement));
			return true;
		} catch (TimeoutException e) {
			throw new TimeoutException("search timeout passed, and the element was not found", e);
		}
	}

	public boolean waitForElementToBeVisible(WebElement webElement) {
		return waitForElementToBeVisible(webElement, STANDARD_TIME);
	}

	public boolean waitForElementToBeVisible(By by, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
			return true;
		} catch (TimeoutException e) {
			throw new TimeoutException("past the search timeout, and the element was not found", e);
		}
	}

	public boolean waitForElementToBeVisible(By by) {
		return waitForElementToBeVisible(by, STANDARD_TIME);
	}

	public boolean waitButtonBeClickable(WebElement element, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (TimeoutException e) {
			throw new TimeoutException("timeout passed, and the element could not be  clicked", e);
		}
	}

	public boolean waitButtonBeClickable(WebElement element) {
		return waitButtonBeClickable(element, STANDARD_TIME);
	}

	public boolean waitButtonBeClickable(By by, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (TimeoutException e) {
			throw new TimeoutException("timeout passed, and the element could not be  clicked");
		}
	}

	public boolean waitButtonBeClickable(By by) {
		return waitButtonBeClickable(by, STANDARD_TIME);
	}

	public boolean waitTheAlertAppear(int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException("timeout passed, and no alert is present", e);
		}
	}

	public boolean waitTheAlertAppear() {
		return waitTheAlertAppear(STANDARD_TIME);
	}
}