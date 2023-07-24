package com.demoblaze.filtrar_produto;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FiltrarProdutoStep {
	private FiltrarProdutoLogic filtrarProdutoLogic;

	public FiltrarProdutoStep() {
		filtrarProdutoLogic = new FiltrarProdutoLogic();
	}

	@Quando("clico na categoria {string}")
	public void clicoNaCategoria(String categoria) {
		if (categoria.equalsIgnoreCase("Laptops")) {
			filtrarProdutoLogic.clicarCategoriaLaptops();
		} else if (categoria.equalsIgnoreCase("monitors")) {
			filtrarProdutoLogic.clicarCategoriaMonitores();
		} else if (categoria.equalsIgnoreCase("Phones")) {
			filtrarProdutoLogic.clicarCategoriaTelefones();
		} else {
			throw new RuntimeException("erro no argumento passado");
		}
	}

	@Então("é feita a validação da aparição do produto")
	public void éFeitaAValidaçãoDaApariçãoDoProduto() {
		filtrarProdutoLogic.validarApresentaçãoDoProdutoDell();
	}

}
