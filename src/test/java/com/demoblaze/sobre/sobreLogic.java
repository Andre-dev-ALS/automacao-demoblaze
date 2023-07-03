package com.demoblaze.sobre;

import static com.demoblaze.utilities.Context.getWait;
import static com.demoblaze.utilities.Context.getWebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.demoblaze.utilities.WaitActions;
import com.demoblaze.utilities.WebActions;

public class sobreLogic {

	private WebDriver driver;
	private WaitActions espera;
	private WebActions acaoWeb;
	private SobrePage sobrePage;

	public sobreLogic() {
		driver = getWebDriverManager().getDriver();
		espera = getWait();
		acaoWeb = new WebActions(driver, espera);
		sobrePage = new SobrePage();
	}

	public void clicarLinkSobre() {
		acaoWeb.clickOnLink(sobrePage.getLblLinkSobre());
	}

	public void validarApressentacaoVideo() {
		Assert.assertTrue(espera.waitForElementToBeVisible(sobrePage.getLblVideo()));
	}

}
