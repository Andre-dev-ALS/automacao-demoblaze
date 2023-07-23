package com.demoblaze.compra;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {
	@FindBy(id = "name")
	private WebElement txtNome;

	@FindBy(id = "country")
	private WebElement txtCountry;

	@FindBy(id = "city")
	private WebElement txtCidade;

	@FindBy(id = "card")
	private WebElement txtCartao;

	@FindBy(id = "month")
	private WebElement txtMes;

	@FindBy(id = "year")
	private WebElement txtAno;

	@FindBy(xpath = "//button[contains(text(), 'Purchase')]")
	private WebElement btmComprar;

	@FindBy(xpath = "//h2[contains(text(), 'Thank you for your purchase!')]")
	private WebElement lblCompraConcluída;

	public CompraPage() {
		PageFactory.initElements(getWebDriverManager().getDriver(), this);

	}

	public WebElement getTxtNome() {
		return txtNome;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtCidade() {
		return txtCidade;
	}

	public WebElement getTxtCartao() {
		return txtCartao;
	}

	public WebElement getTxtMes() {
		return txtMes;
	}

	public WebElement getTxtAno() {
		return txtAno;
	}

	public WebElement getBtmComprar() {
		return btmComprar;
	}

	public WebElement getLblCompraConcluída() {
		return lblCompraConcluída;
	}

}
