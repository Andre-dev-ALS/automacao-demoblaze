package com.demoblaze.carrinho;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPage {

	@FindBy(xpath = "//a[contains(text(), 'Add to cart')]")
	private WebElement lblAdicionarNoCarrinho;

	@FindBy(id = "cartur")
	private WebElement lblCarrinho;

	@FindBy(xpath = "//a[contains(text(), 'Home')]")
	private WebElement lblLinkHome;

	@FindBy(id = "totalp")
	private WebElement lblPrecoTotalCarrinho;

	public CarrinhoPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);
	}

	public WebElement getLblAdicionarNoCarrinho() {
		return lblAdicionarNoCarrinho;
	}

	public WebElement getLblCarrinho() {
		return lblCarrinho;
	}

	public WebElement getLblLinkHome() {
		return lblLinkHome;
	}

	public WebElement getLblPrecoTotalCarrinho() {
		return lblPrecoTotalCarrinho;
	}

}
