package com.demoblaze.filtrar_produto;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.demoblaze.login.LoginPage;
import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class FiltrarProdutoLogic {

	private WaitActions espera;
	private WebActions acaoWeb;
	private FiltrarProdutoPage filtrarProdutoPage;
	private LoginPage loginPage;
	private static String nomeProduto;
	private static List<String> precoProdutos;

	public FiltrarProdutoLogic() {
		espera = getWait();
		acaoWeb = getWebActions();
		filtrarProdutoPage = new FiltrarProdutoPage();
		loginPage = new LoginPage();
		precoProdutos = new ArrayList<>();
	}

	public void clicarCategoriaLaptops() {
		espera.waitForElementToBeVisible(loginPage.getLblMensagemBemVindo());
		getWebDriverManager().getDriver().navigate().refresh();
		acaoWeb.clickOnLink(filtrarProdutoPage.getLblCategoriaLaptops());
	}

	public void clicarCategoriaMonitores() {
		espera.waitForElementToBeVisible(loginPage.getLblMensagemBemVindo());
		getWebDriverManager().getDriver().navigate().refresh();
		acaoWeb.clickOnLink(filtrarProdutoPage.getLblCategoriaMonitores());
	}

	public void clicarCategoriaTelefones() {
		espera.waitForElementToBeVisible(loginPage.getLblMensagemBemVindo());
		getWebDriverManager().getDriver().navigate().refresh();
		acaoWeb.clickOnLink(filtrarProdutoPage.getLblCategoriaTelefones());
	}

	public void validarApresentaçãoDoProdutoDell() {
		Assert.assertTrue(espera.waitForElementToBeVisible(filtrarProdutoPage.getLblProdutoDell()));
	}

	public void selecionarProduto() {
		espera.waitForElementToBeVisible(filtrarProdutoPage.getLblProdutoSelecionado());
		nomeProduto = filtrarProdutoPage.getLblProdutoSelecionado().getText();
		espera.waitForElementToBeVisible(filtrarProdutoPage.getLblPrecoProduto());
		precoProdutos.add(filtrarProdutoPage.getLblPrecoProduto().getText());

		acaoWeb.clickOnLink(filtrarProdutoPage.getLblProdutoSelecionado());
	}

	public static String getNomeProduto() {
		return nomeProduto;
	}

	public static List<String> getPrecoProdutos() {
		return precoProdutos;
	}

}