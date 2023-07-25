package com.demoblaze.utilities;

import static com.demoblaze.utilities.Context.getWebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;

public class ScreenshotUtility {

	public String getCurrentDateAndTime() {
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss"));
		return date;
	}

	public void takeScreenshot(Scenario scenario) {
		File imagens = ((TakesScreenshot) getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
		String mensagem;
		if (scenario.isFailed()) {
			mensagem = "FALHOU_";
		} else {
			mensagem = "PASSOU_";
		}
		try {
			String pastaImagens = "";

			if (scenario.isFailed()) {
				pastaImagens = new File("").getAbsolutePath() + "/evidencia/falhou/";
			} else {
				pastaImagens = new File("").getAbsolutePath() + "/evidencia/passou/";
			}

			FileUtils.copyFile(imagens,
					new File(pastaImagens + Context.getId() + "_ " + mensagem + getCurrentDateAndTime() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
