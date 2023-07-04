package com.demoblaze.contato;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ContatoStep {
	private ContatoLogic contatoLogic;

	public ContatoStep() {
		contatoLogic = new ContatoLogic();
	}

	@Quando("clico no link Contact em home")
	public void clicoNoLinkContactEmHome() {
		contatoLogic.clicarLinkContato();
	}

	@Quando("preencho o campo Contact Email: em contato")
	public void preenchoOCampoContactEmailEmContato() {
		contatoLogic.preencherCampoEmail();
	}

	@Quando("preencho o campo Contact Name: em contato")
	public void preenchoOCampoContactNameEmContato() {
		contatoLogic.preencherCampoNome();
	}

	@Quando("preencho o campo Message: em contato")
	public void preenchoOCampoMessageEmContato() {
		contatoLogic.preencherCampoMenssagem();
	}

	@Quando("clico no botão    Send message em contato")
	public void clicoNoBotãoSendMessageEmContato() {
		contatoLogic.clicarBotaoEnviar();
	}

	@Então("recebo um alerta de       mensagem enviada com sucesso em contato")
	public void receboUmAlertaDeMensagemEnviadaComSucessoEmContato() {
		contatoLogic.validarAlertaMenssagemEnviada();
	}
}