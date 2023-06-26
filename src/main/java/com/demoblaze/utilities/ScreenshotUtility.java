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
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss"));
		return date;
	}

	public void takeScreenshot(Scenario scenario) {
		File imagens = ((TakesScreenshot) getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
		String mensagem;
		if (scenario.isFailed()) {
			mensagem = "Falhou";
		} else {
			mensagem = "Passou";
		}
		try {
			String pastaImagens = new File("").getAbsolutePath() + "/evidencia/";
			FileUtils.copyFile(imagens, new File(pastaImagens + Context.getId() + scenario.getName() + "-"
					+ getCurrentDateAndTime() + "-" + mensagem + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
