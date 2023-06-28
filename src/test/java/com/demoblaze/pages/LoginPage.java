package com.demoblaze.pages;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "login2")
	private WebElement lblLinkLogin;

	@FindBy(id = "loginusername")
	private WebElement txtNome;

	@FindBy(id = "loginpassword")
	private WebElement txtSenha;

	@FindBy(xpath = "//button[contains(text(), 'Log in')]")
	private WebElement btmEntrar;

	@FindBy(id = "nameofuser")
	private WebElement lblMensagemBemVindo;

	public LoginPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
	}

	public WebElement getLblLinkLogin() {
		return lblLinkLogin;
	}

	public WebElement getTxtNome() {
		return txtNome;
	}

	public WebElement getTxtSenha() {
		return txtSenha;
	}

	public WebElement getBtmEntrar() {
		return btmEntrar;
	}

	public WebElement getLblMensagemBemVindo() {
		return lblMensagemBemVindo;
	}

}
