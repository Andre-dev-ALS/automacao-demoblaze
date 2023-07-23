package com.demoblaze.compra;

import static com.demoblaze.utilities.Context.getWebActions;

import org.junit.Assert;

import com.demoblaze.utilities.WebActions;

public class CompraLogic {
	private WebActions acaoWeb;
	private CompraPage compraPage;
	private CompraModel compraModel;

	public CompraLogic() {
		acaoWeb = getWebActions();
		compraPage = new CompraPage();
		compraModel = new CompraModel();
	}

	public void preencherCampoNome() {
		acaoWeb.write(compraPage.getTxtNome(), compraModel.getNome());
	}

	public void preencherCampoCountry() {
		acaoWeb.write(compraPage.getTxtCountry(), compraModel.getCountry());
	}

	public void preencherCampoCidade() {
		acaoWeb.write(compraPage.getTxtCidade(), compraModel.getCidade());
	}

	public void preencherCampoCartao() {
		acaoWeb.write(compraPage.getTxtCartao(), compraModel.getCartao().replaceAll("[\"]", ""));
	}

	public void preencherCampoMes() {
		acaoWeb.write(compraPage.getTxtMes(), compraModel.getMes().replaceAll("[\"]", ""));
	}

	public void preencherCampoAno() {
		acaoWeb.write(compraPage.getTxtAno(), compraModel.getAno().replaceAll("[\"]", ""));
	}

	public void clicarBotaoComprar() {
		acaoWeb.clickButton(compraPage.getBtmComprar());
	}

	public void validarMensagemCompraConcluída() {
		Assert.assertTrue(compraPage.getLblCompraConcluída().isDisplayed());
	}
}
