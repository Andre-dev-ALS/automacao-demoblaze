package com.demoblaze.filtrar_produto;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FiltrarProdutoStep {
	private FiltrarProdutoLogic filtrarProdutoLogic;

	public FiltrarProdutoStep() {
		filtrarProdutoLogic = new FiltrarProdutoLogic();
	}

	@Quando("clico no link Laptops")
	public void clicoNoLinkLaptops() {
		filtrarProdutoLogic.clicarCategoriaLaptop();
	}

	@Então("é feita a validação da aparição do produto")
	public void éFeitaAValidaçãoDaApariçãoDoProduto() {
	}
}
