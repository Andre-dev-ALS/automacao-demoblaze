package com.demoblaze.cadastro;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroStep {
	private CadastroLogic cadastroLogic;

	public CadastroStep() {
		cadastroLogic = new CadastroLogic();
	}

	@Quando("clico no link Sign up em home")
	public void clicoNoLinkSignUpEmHome() {
		cadastroLogic.clicarLinkCadastrar();
	}

	@Quando("preencho o campo Username: {string}  em Sign up")
	public void preenchoOCampoUsernameEmSignUp(String string) {
		if (string.equals("novo")) {
			cadastroLogic.preencherCampoNomeDadoAleatorio();
		} else {
			cadastroLogic.preencherCampoNome();
		}
	}

	@Quando("preencho o campo Password: {string} em Sign up")
	public void preenchoOCampoPasswordEmSignUp(String tipo) {
		if (tipo.equals("novo")) {
			cadastroLogic.preencherCampoSenhaDadoAleatorio();
		} else {
			cadastroLogic.preencherCampoSenha();
		}
	}

	@Quando("clico no botão    Sign up em Sign up")
	public void clicoNoBotãoSignUpEmSignUp() {
		cadastroLogic.clicarBotaoCadastrar();
	}

	@Então("é mostrada uma mensagem de usuário cadastrado com sucesso em Sign up")
	public void éMostradaUmaMensagemDeUsuárioCadastradoComSucessoEmSignUp() {
		cadastroLogic.validarMensagemCadastroBemSucedido();
	}

	@Então("é mostrada uma mensagem de usuário já cadastrado em Sign up")
	public void éMostradaUmaMensagemDeUsuárioJáCadastradoEmSignUp() {
		cadastroLogic.validarMensagemDeUsuarioJaExistente();
	}
}
