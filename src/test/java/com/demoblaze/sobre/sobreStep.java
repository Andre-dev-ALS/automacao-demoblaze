package com.demoblaze.sobre;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class sobreStep {
	private sobreLogic sobreLogic;

	public sobreStep() {
		sobreLogic = new sobreLogic();
	}

	@Quando("clico no link About us")
	public void clicoNoLinkAboutUs() {
		sobreLogic.clicarLinkSobre();
	}

	@Então("é  feita a validação da apresentação do video")
	public void éFeitaAValidaçãoDaApresentaçãoDoVideo() {
		sobreLogic.validarApressentacaoVideo();
	}
}