package com.demoblaze.compra;

import com.demoblaze.carrinho.CarrinhoLogic;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CompraStep {
	private CarrinhoLogic carrinhoLogic;
	private CompraLogic compraLogic;

	public CompraStep() {
		carrinhoLogic = new CarrinhoLogic();
		compraLogic = new CompraLogic();
	}

	@Quando("clico no botão Place Order")
	public void clicoNoBotãoPlaceOrder() {
		carrinhoLogic.clicarBotãoComprar();
	}

	@Quando("preencho o campo Name:")
	public void preenchoOCampoName() {
		compraLogic.preencherCampoNome();
	}

	@Quando("preencho o campo Country:")
	public void preenchoOCampoCountry() {

		compraLogic.preencherCampoCountry();
	}

	@Quando("preencho o campo City:")
	public void preenchoOCampoCity() {
		compraLogic.preencherCampoCidade();
	}

	@Quando("preencho o campo Credit card:")
	public void preenchoOCampoCreditCard() {
		compraLogic.preencherCampoCartao();
	}

	@Quando("preencho o campo Month:")
	public void preenchoOCampoMonth() {
		compraLogic.preencherCampoMes();
	}

	@Quando("preencho o campo Year:")
	public void preenchoOCampoYear() {
		compraLogic.preencherCampoAno();
	}

	@Quando("clico no botão Purchase")
	public void clicoNoBotãoPurchase() {
		compraLogic.clicarBotaoComprar();
	}

	@Então("é mostrada uma mensagem de agradecimento pela compra")
	public void éMostradaUmaMensagemDeAgradecimentoPelaCompra() {
		compraLogic.validarMensagemCompraConcluída();
	}

}
