package com.demoblaze.contato;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.demoblaze.login.LoginModel;
import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class ContatoLogic {
	private WebDriver driver;
	private WaitActions espera;
	private WebActions acaoWeb;
	private LoginModel dadosPessoais;
	private ContatoPage contatoPage;

	public ContatoLogic() {
		driver = getWebDriverManager().getDriver();
		espera = getWait();
		acaoWeb = new WebActions(driver, espera);
		dadosPessoais = new LoginModel();
		contatoPage = new ContatoPage();
	}

	public void clicarLinkContato() {
		driver.navigate().refresh();
		acaoWeb.clickOnLink(contatoPage.getLblLinkContato(), 20);
	}

	public void preencherCampoEmail() {
		acaoWeb.write(contatoPage.getTxtEmail(), dadosPessoais.getEmail());
	}

	public void preencherCampoNome() {
		acaoWeb.write(contatoPage.getTxtNome(), dadosPessoais.getNomeDoUsuário());
	}

	public void preencherCampoMenssagem() {
		acaoWeb.write(contatoPage.getTxtMensagem(), "Esta é uma mensagem automatizada.");
	}

	public void clicarBotaoEnviar() {
		acaoWeb.clickButton(contatoPage.getBtmEnviar());
	}

	public void validarAlertaMenssagemEnviada() {
		Assert.assertEquals("Thanks for the message!!", acaoWeb.getTextAndAcceptAlert());
	}
}
