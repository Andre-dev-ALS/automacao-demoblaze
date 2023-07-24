package com.demoblaze.cadastro;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroStep {
	private CadastroLogic cadastroLogic;

	public CadastroStep() {
		cadastroLogic = new CadastroLogic();
	}

	@Quando("clico no link Sign up")
	public void clicoNoLinkSignUp() {
		cadastroLogic.clicarLinkCadastrar();
	}

	@Quando("preencho o campo Username: {string}")
	public void preenchoOCampoUsername(String string) {
		if (string.equals("novo")) {
			cadastroLogic.preencherCampoNomeDadoAleatorio();
		} else {
			cadastroLogic.preencherCampoNome();
		}
	}

	@Quando("preencho o campo Password: {string}")
	public void preenchoOCampoPassword(String tipo) {
		if (tipo.equals("novo")) {
			cadastroLogic.preencherCampoSenhaDadoAleatorio();
		} else {
			cadastroLogic.preencherCampoSenha();
		}
	}

	@Quando("clico no botão Sign up")
	public void clicoNoBotãoSignUp() {
		cadastroLogic.clicarBotaoCadastrar();
	}

	@Então("é mostrada uma mensagem de usuário cadastrado com sucesso")
	public void éMostradaUmaMensagemDeUsuárioCadastradoComSucesso() {
		cadastroLogic.validarMensagemCadastroBemSucedido();
	}

	@Então("é mostrada uma mensagem de usuário já cadastrado")
	public void éMostradaUmaMensagemDeUsuárioJáCadastrado() {
		cadastroLogic.validarMensagemDeUsuarioJaExistente();
	}
}
