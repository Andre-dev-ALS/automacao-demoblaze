package com.demoblaze.login;

import static com.demoblaze.utilities.Context.getConfigFileReader;
import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class LoginLogic {
	private WebDriver driver;
	private WaitActions espera;
	private WebActions acaoWeb;
	private LoginPage loginPage;
	private LoginModel dadosAcesso;

	public LoginLogic() {
		driver = getWebDriverManager().getDriver();
		espera = getWait();
		acaoWeb = getWebActions();
		loginPage = new LoginPage();
		dadosAcesso = new LoginModel();
	}

	public void navegarParaPaginaInicial() {
		driver.get(getConfigFileReader().getApplicationUrl());
	}

	public void clicarLinkFazerLogin() {
		acaoWeb.clickOnLink(loginPage.getLblLinkLogin(), 5);
	}

	public void preencherCampoNome() {
		acaoWeb.write(loginPage.getTxtNome(), dadosAcesso.getNomeDoUsuário());
	}

	public void preencherCampoSenha() {
		acaoWeb.write(loginPage.getTxtSenha(), dadosAcesso.getSenha());
	}

	public void clicarBotaoEntrar() {
		acaoWeb.clickButton(loginPage.getBtmEntrar());
	}

	public void validarMensagemBemVindo() {
		Assert.assertTrue(espera.waitForElementToBeVisible(loginPage.getLblMensagemBemVindo()));
	}

	public void clicarLinkSair() {
		acaoWeb.clickOnLink(loginPage.getLblLinkLogout());
	}

	public void validarLogout() {
		Assert.assertTrue(espera.waitForElementToBeVisible(loginPage.getLblLinkLogin()));
	}

}
