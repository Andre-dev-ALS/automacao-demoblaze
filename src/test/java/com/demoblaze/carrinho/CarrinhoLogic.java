package com.demoblaze.carrinho;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class CarrinhoLogic {
	private WaitActions espera;
	private WebActions acaoWeb;
	private CarrinhoPage carrinhoPage;

	public CarrinhoLogic() {
		espera = getWait();
		acaoWeb = getWebActions();
		carrinhoPage = new CarrinhoPage();
	}

	public void adicionarNoCarrinho() {
		acaoWeb.clickOnLink(carrinhoPage.getLblAdicionarNoCarrinho());
		acaoWeb.getTextAndAcceptAlert(5);
	}

	public void clicarCarrinho() {
		acaoWeb.clickOnLink(carrinhoPage.getLblCarrinho());
	}

	public void validarProdutoNoCarrinho() {
		Assert.assertTrue(espera.waitForElementToBeVisible(
				By.xpath("//tbody[@id='tbodyid']/tr/td[contains(text(), 'Apple monitor 24')]")));
	}
}
