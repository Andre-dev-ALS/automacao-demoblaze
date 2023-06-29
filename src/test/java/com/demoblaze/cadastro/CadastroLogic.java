package com.demoblaze.cadastro;

import static com.demoblaze.utilities.Context.getWebActions;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import java.util.Random;

import org.junit.Assert;

import com.demoblaze.utilities.WebActions;

public class CadastroLogic {
	private WebActions acaoWeb;
	private cadastroPage cadastro;
	private Random aleatorio;

	public CadastroLogic() {
		getWebDriverManager().getDriver();
		acaoWeb = getWebActions();
		cadastro = new cadastroPage();
		aleatorio = new Random();
	}

	public void clicarLinkCadastrar() {
		acaoWeb.clickOnLink(cadastro.getLblLinkCadastro());
	}

	public void preencherCampoNome() {
		String nome = "nomeAleatório" + Integer.toString(aleatorio.nextInt(999999999));
		acaoWeb.write(cadastro.getTxtNome(), nome);
	}

	public void preencherCampoSenha() {
		String senha = "senhaAleatório" + Integer.toString(aleatorio.nextInt(999999999));
		acaoWeb.write(cadastro.getTxtSenha(), senha);
	}

	public void clicarBotaoCadastrar() {
		acaoWeb.clickButton(cadastro.getBtmCadastrar());
	}

	public void validarMensagemCadastroBemSucedido() {
		Assert.assertEquals("Sign up successful.", acaoWeb.getTextAndAcceptAlert());
	}
}
