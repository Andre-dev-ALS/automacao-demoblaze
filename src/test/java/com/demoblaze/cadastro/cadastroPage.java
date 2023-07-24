package com.demoblaze.cadastro;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cadastroPage {

	@FindBy(id = "signin2")
	private WebElement lblLinkCadastro;

	@FindBy(id = "sign-username")
	private WebElement txtNome;

	@FindBy(id = "sign-password")
	private WebElement txtSenha;

	@FindBy(xpath = "//button[contains(text(), 'Sign up')]")
	private WebElement btmCadastrar;

	private String lblCadastroBemSucedido;

	private String lblUsuarioExistente;

	public cadastroPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
		lblCadastroBemSucedido = "Sign up successful.";
		lblUsuarioExistente = "This user already exist.";
	}

	public WebElement getLblLinkCadastro() {
		return lblLinkCadastro;
	}

	public WebElement getTxtNome() {
		return txtNome;
	}

	public WebElement getTxtSenha() {
		return txtSenha;
	}

	public WebElement getBtmCadastrar() {
		return btmCadastrar;
	}

	public String getLblCadastroBemSucedido() {
		return lblCadastroBemSucedido;
	}

	public String getLblUsuarioExistente() {
		return lblUsuarioExistente;
	}

}
