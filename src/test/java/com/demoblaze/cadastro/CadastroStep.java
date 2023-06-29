package com.demoblaze.cadastro;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroStep {
	private CadastroLogic cadastro;

	public CadastroStep() {
		cadastro = new CadastroLogic();
	}

	@Quando("clico no link Sign up em home")
	public void clicoNoLinkSignUpEmHome() {
		cadastro.clicarLinkCadastrar();
	}

	@Quando("preencho o campo Username: em Sign up")
	public void preenchoOCampoUsernameEmSignUp() {
		cadastro.preencherCampoNome();
	}

	@Quando("preencho o campo Password: em Sign up")
	public void preenchoOCampoPasswordEmSignUp() {
		cadastro.preencherCampoSenha();
	}

	@Quando("clico no botão    Sign up em Sign up")
	public void clicoNoBotãoSignUpEmSignUp() {
		cadastro.clicarBotaoCadastrar();
	}

	@Então("é mostrada uma mensagem de usuário cadastrado com sucesso em Sign up")
	public void éMostradaUmaMensagemDeUsuárioCadastradoComSucessoEmSignUp() {
		cadastro.validarMensagemCadastroBemSucedido();
	}

}
