package com.demoblaze.login;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginStep {
	private LoginLogic loginLogic;

	public LoginStep() {
		loginLogic = new LoginLogic();
	}

	@Dado("que estou na página inicial")
	public void queEstouNaPáginaInicial() {
		loginLogic.navegarParaPaginaInicial();
	}

	@Quando("clico  no link Log in")
	public void clicoNoLinkLogIn() {
		loginLogic.clicarLinkFazerLogin();
	}

	@Quando("preencho o campo Username")
	public void preenchoOCampoUsername() {
		loginLogic.preencherCampoNome();
	}

	@Quando("preencho o campo Password")
	public void preenchoOCampoPassword() {
		loginLogic.preencherCampoSenha();
	}

	@Quando("clico no botão Log in")
	public void clicoNoBotãoLogIn() {
		loginLogic.clicarBotaoEntrar();
	}

	@Então("na página é mostrada uma mensagem de bem vindo ao usuário")
	public void naPáginaÉMostradaUmaMensagemDeBemVindoAoUsuário() {
		loginLogic.validarMensagemBemVindo();
	}

	@Quando("clico no link log out")
	public void clicoNoLinkLogOut() {
		loginLogic.clicarLinkSair();
	}

	@Então("é mostrado o link para fazer o login novamente")
	public void éMostradoOLinkParaFazerOLoginNovamente() {
		loginLogic.validarLogout();
	}

}