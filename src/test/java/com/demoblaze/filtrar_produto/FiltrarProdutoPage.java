package com.demoblaze.filtrar_produto;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltrarProdutoPage {

	@FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Laptops')]")
	private WebElement lblCategoriaLaptop;

	@FindBy(xpath = "//div[@class='card-block' and contains(*, 'Dell')]/h4")
	private WebElement lblProdutoDell;

	public FiltrarProdutoPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
	}

	public WebElement getLblCategoriaLaptop() {
		return lblCategoriaLaptop;
	}

	public WebElement getLblProdutoDell() {
		return lblProdutoDell;
	}

}
