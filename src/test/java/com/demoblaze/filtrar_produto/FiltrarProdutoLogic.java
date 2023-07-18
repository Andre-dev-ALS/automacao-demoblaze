package com.demoblaze.filtrar_produto;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.demoblaze.login.LoginPage;
import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class FiltrarProdutoLogic {

	private WebDriver driver;
	private WaitActions espera;
	private WebActions acaoWeb;
	private FiltrarProdutoPage filtrarProdutoPage;
	private LoginPage loginPage;
	private static String nomeProduto;
	private static List<String> precoProdutos;

	public FiltrarProdutoLogic() {
		driver = getWebDriverManager().getDriver();
		espera = getWait();
		acaoWeb = getWebActions();
		filtrarProdutoPage = new FiltrarProdutoPage();
		loginPage = new LoginPage();
		precoProdutos = new ArrayList<>();

	}

	public void clicarCategoriaLaptop() {
		espera.waitForElementToBeVisible(loginPage.getLblMensagemBemVindo());
		driver.navigate().refresh();
		acaoWeb.clickOnLink(filtrarProdutoPage.getLblCategoriaLaptop());
	}

	public void validarApresentaçãoDoProdutoDell() {
		Assert.assertTrue(espera.waitForElementToBeVisible(filtrarProdutoPage.getLblProdutoDell()));
	}

	public void clicarCategoriaMonitors() {
		espera.waitForElementToBeVisible(loginPage.getLblMensagemBemVindo());
		driver.navigate().refresh();
		acaoWeb.clickOnLink(filtrarProdutoPage.getLblCategoriaMonitors());
	}

	public void selecionarProduto() {
		espera.waitForElementToBeVisible(filtrarProdutoPage.getLblProdutoSelecionado());
		nomeProduto = filtrarProdutoPage.getLblProdutoSelecionado().getText();
		espera.waitForElementToBeVisible(filtrarProdutoPage.getLblPrecoProduto());
		precoProdutos.add(filtrarProdutoPage.getLblPrecoProduto().getText().replaceAll("$", ""));

		acaoWeb.clickOnLink(filtrarProdutoPage.getLblProdutoSelecionado());
	}

	public static String getNomeProduto() {
		return nomeProduto;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WaitActions getEspera() {
		return espera;
	}

	public WebActions getAcaoWeb() {
		return acaoWeb;
	}

	public FiltrarProdutoPage getFiltrarProdutoPage() {
		return filtrarProdutoPage;
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}

	public static List<String> getPrecoProdutos() {
		return precoProdutos;
	}

}
