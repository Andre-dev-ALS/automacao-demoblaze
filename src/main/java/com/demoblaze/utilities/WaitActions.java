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
	public static final int STANDARD_TIME = 15;
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

	public void waitForElementToBeVisible(WebElement webElement, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.visibilityOf(webElement));
		} catch (TimeoutException e) {
			throw new TimeoutException("search timeout passed, and the element was not found", e);
		}
	}

	public void waitForElementToBeVisible(By by, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (TimeoutException e) {
			throw new TimeoutException("past the search timeout, and the element was not found", e);
		}
	}

	public void waitButtonBeClickable(WebElement element, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException e) {
			throw new TimeoutException("timeout passed, and the element could not be  clicked", e);
		}
	}

	public void waitButtonBeClickable(By by, int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.elementToBeClickable(by));
		} catch (TimeoutException e) {
			throw new TimeoutException("timeout passed, and the element could not be  clicked");
		}

	}

	public void waitTheAlertAppear(int waitingTime) {
		try {
			setWait(waitingTime);
			getWait().until(ExpectedConditions.alertIsPresent());
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException("timeout passed, and no alert is present", e);
		}
	}

}