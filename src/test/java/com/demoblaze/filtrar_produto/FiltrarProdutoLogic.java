package com.demoblaze.filtrar_produto;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class FiltrarProdutoLogic {
	private WebDriver driver;
	private WaitActions espera;
	private WebActions acaoWeb;
	private FiltrarProdutoPage filtrarProdutoPage;

	public FiltrarProdutoLogic() {
		driver = getWebDriverManager().getDriver();
		espera = getWait();
		acaoWeb = getWebActions();
		filtrarProdutoPage = new FiltrarProdutoPage();
	}

	public void clicarCategoriaLaptop() {
		driver.navigate().refresh();
		acaoWeb.clickOnLink(filtrarProdutoPage.getLblCategoriaLaptop());
	}

	public void validarApresentaçãoDoProduto() {
		Assert.assertTrue(espera.waitForElementToBeVisible(filtrarProdutoPage.getLblProdutoDell()));
	}
}
