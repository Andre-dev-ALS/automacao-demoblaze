package com.demoblaze.carrinho;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.demoblaze.filtrar_produto.FiltrarProdutoLogic;
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
		String nomeProduto = FiltrarProdutoLogic.getNomeProduto();
		Assert.assertTrue(espera.waitForElementToBeVisible(
				By.xpath("//tbody[@id='tbodyid']/tr/td[contains(text(), '" + nomeProduto + "' )]")));
	}

	public void clicarLinkHome() {
		acaoWeb.clickOnLink(carrinhoPage.getLblLinkHome());
	}

	public void validarPrecoTotal() {
		int precoTotal = 0;
		for (int i = 0; i < FiltrarProdutoLogic.getPrecoProdutos().size(); i++) {
			String precoFormatado = FiltrarProdutoLogic.getPrecoProdutos().get(i).replace("$", "");
			precoTotal = precoTotal += Integer.parseInt(precoFormatado);
		}
		espera.waitForElementToBeVisible(carrinhoPage.getLblPrecoTotalCarrinho());
		assertTrue(Integer.toString(precoTotal).equals(carrinhoPage.getLblPrecoTotalCarrinho().getText()));
	}

	public void clicarLinkDelete() {
		acaoWeb.clickOnLink(carrinhoPage.getLblDelete());
	}

	public void validarCarrinhoVazio() {
		espera.getWait().until(ExpectedConditions.invisibilityOf(carrinhoPage.getLblPrecoTotalCarrinho()));
		List<WebElement> linhas = carrinhoPage.getLblTabela().findElements(By.tagName("tr"));
		assertTrue(linhas.size() == 0);
	}
}