package com.demoblaze.steps;

import com.demoblaze.logic.LoginLogic;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginStep {
	private LoginLogic login;

	public LoginStep() {
		login = new LoginLogic();
	}

	@Dado("que estou na página inicial")
	public void queEstouNaPáginaInicial() {
		login.navegarParaPaginaInicial();
	}

	@Quando("clico  no link Log in em home")
	public void clicoNoLinkLogInEmHome() {
		login.clicarLinkFazerLogin();
	}

	@Quando("preencho o campo Username en login")
	public void preenchoOCampoUsernameEnLogin() {
		login.preencherCampoNome();
	}

	@Quando("preencho o campo Password en login")
	public void preenchoOCampoPasswordEnLogin() {
		login.preencherCampoSenha();
	}

	@Quando("clico no botão Log in em login")
	public void clicoNoBotãoLogInEmLogin() {
		login.clicarBotaoEntrar();
	}

	@Então("na página é mostrada uma mensagem de bem vindo ao usuário    em home")
	public void naPáginaÉMostradaUmaMensagemDeBemVindoAoUsuárioEmHome() {
		login.validarMensagemBemVindo();
	}

}