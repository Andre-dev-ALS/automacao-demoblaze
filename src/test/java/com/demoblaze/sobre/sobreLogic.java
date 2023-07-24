package com.demoblaze.sobre;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebActions;

import org.junit.Assert;

import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class sobreLogic {

	private WaitActions espera;
	private WebActions acaoWeb;
	private SobrePage sobrePage;

	public sobreLogic() {
		espera = getWait();
		acaoWeb = getWebActions();
		sobrePage = new SobrePage();
	}

	public void clicarLinkSobre() {
		acaoWeb.clickOnLink(sobrePage.getLblLinkSobre());
	}

	public void validarApressentacaoVideo() {
		Assert.assertTrue(espera.waitForElementToBeVisible(sobrePage.getLblVideo()));
	}

}
