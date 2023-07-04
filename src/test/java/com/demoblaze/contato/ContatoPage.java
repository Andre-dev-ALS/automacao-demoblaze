package com.demoblaze.contato;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContatoPage {
	@FindBy(xpath = "//a[contains(text(), 'Contact')]")
	private WebElement lblLinkContato;

	@FindBy(id = "recipient-email")
	private WebElement txtEmail;

	@FindBy(id = "recipient-name")
	private WebElement txtNome;

	@FindBy(id = "message-text")
	private WebElement txtMensagem;

	@FindBy(xpath = "//button[contains(text(), 'Send message')]")
	private WebElement btmEnviar;

	public ContatoPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
	}

	public WebElement getLblLinkContato() {
		return lblLinkContato;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtNome() {
		return txtNome;
	}

	public WebElement getTxtMensagem() {
		return txtMensagem;
	}

	public WebElement getBtmEnviar() {
		return btmEnviar;
	}

}
