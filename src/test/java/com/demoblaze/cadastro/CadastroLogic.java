package com.demoblaze.cadastro;

import static com.demoblaze.utilities.Context.getWebActions;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import java.util.Random;

import org.junit.Assert;

import com.demoblaze.utilities.WebActions;

public class CadastroLogic {
	private WebActions acaoWeb;
	private cadastroPage cadastroPage;
	private Random aleatorio;
	private CadastroModel dadosCadastro;

	public CadastroLogic() {
		getWebDriverManager().getDriver();
		acaoWeb = getWebActions();
		cadastroPage = new cadastroPage();
		aleatorio = new Random();
		dadosCadastro = new CadastroModel();
	}

	public void clicarLinkCadastrar() {
		acaoWeb.clickOnLink(cadastroPage.getLblLinkCadastro());
	}

	public void preencherCampoNomeDadoAleatorio() {
		String nome = "nomeAleatório" + Integer.toString(aleatorio.nextInt(999999999));
		acaoWeb.write(cadastroPage.getTxtNome(), nome);
	}

	public void preencherCampoSenhaDadoAleatorio() {
		String senha = "senhaAleatório" + Integer.toString(aleatorio.nextInt(999999999));
		acaoWeb.write(cadastroPage.getTxtSenha(), senha);
	}

	public void clicarBotaoCadastrar() {
		acaoWeb.clickButton(cadastroPage.getBtmCadastrar());
	}

	public void validarMensagemCadastroBemSucedido() {
		Assert.assertEquals("Sign up successful.", acaoWeb.getTextAndAcceptAlert());
	}

	public void preencherCampoNome() {
		acaoWeb.write(cadastroPage.getTxtNome(), dadosCadastro.getNomeDoUsuário());
	}

	public void preencherCampoSenha() {
		acaoWeb.write(cadastroPage.getTxtSenha(), dadosCadastro.getSenha());
	}

	public void validarMensagemDeUsuarioJaExistente() {
		Assert.assertEquals("This user already exist.", acaoWeb.getTextAndAcceptAlert());
	}
}
