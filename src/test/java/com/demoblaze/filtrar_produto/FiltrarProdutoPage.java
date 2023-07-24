package com.demoblaze.filtrar_produto;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltrarProdutoPage {

	@FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Laptops')]")
	private WebElement lblCategoriaLaptops;

	@FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Monitors')]")
	private WebElement lblCategoriaMonitores;

	@FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Phones')]")
	private WebElement lblCategoriaTelefones;

	@FindBy(xpath = "//div[@class='card-block' and contains(*, 'Dell')]/h4")
	private WebElement lblProdutoDell;

	@FindBy(xpath = "(//h4[@class='card-title']/a)[1]")
	private WebElement lblProdutoSelecionado;

	@FindBy(xpath = "//div[@class='card-block']/h5")
	private WebElement lblPrecoProduto;

	public FiltrarProdutoPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
	}

	public WebElement getLblCategoriaLaptops() {
		return lblCategoriaLaptops;
	}

	public WebElement getLblCategoriaMonitores() {
		return lblCategoriaMonitores;
	}

	public WebElement getLblCategoriaTelefones() {
		return lblCategoriaTelefones;
	}

	public WebElement getLblProdutoDell() {
		return lblProdutoDell;
	}

	public WebElement getLblProdutoSelecionado() {
		return lblProdutoSelecionado;
	}

	public WebElement getLblPrecoProduto() {
		return lblPrecoProduto;
	}

}
