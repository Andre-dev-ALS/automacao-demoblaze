package com.demoblaze.sobre;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SobrePage {

	@FindBy(xpath = "//a[contains(text(), 'About us')]")
	private WebElement lblLinkSobre;

	@FindBy(id = "example-video")
	private WebElement lblVideo;

	public SobrePage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
	}

	public WebElement getLblLinkSobre() {
		return lblLinkSobre;
	}

	public WebElement getLblVideo() {
		return lblVideo;
	}

}
