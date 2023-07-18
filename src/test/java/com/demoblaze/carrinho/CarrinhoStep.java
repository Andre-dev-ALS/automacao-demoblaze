package com.demoblaze.carrinho;

import com.demoblaze.filtrar_produto.FiltrarProdutoLogic;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CarrinhoStep {
	private FiltrarProdutoLogic filtrarProdutoLogic;
	private CarrinhoLogic carrinhoLogic;

	public CarrinhoStep() {
		filtrarProdutoLogic = new FiltrarProdutoLogic();
		carrinhoLogic = new CarrinhoLogic();
	}

	@Quando("seleciono um dos produtos  da lista de resultados")
	public void selecionoUmDosProdutosDaListaDeResultados() {
		filtrarProdutoLogic.selecionarProduto();
	}

	@Quando("clico no link Add to cart")
	public void clicoNoLinkAddToCart() {
		carrinhoLogic.adicionarNoCarrinho();
	}

	@Quando("clico no link cart")
	public void clicoNoLinkCart() {
		carrinhoLogic.clicarCarrinho();
	}

	@Então("é validado se o produto foi adicionado")
	public void éValidadoSeOProdutoFoiAdicionado() {
		carrinhoLogic.validarProdutoNoCarrinho();
	}

	@Quando("clico no link Home")
	public void clicoNoLinkHome() {

		carrinhoLogic.clicarLinkHome();
	}

	@Então("é validado se a soma do preço dos produtos adicionados é correta")
	public void éValidadoSeASomaDoPreçoDosProdutosAdicionadosÉCorreta() {
		carrinhoLogic.validarPrecoTotal();
	}

}
