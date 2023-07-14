package com.demoblaze.utilities;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebActions {
	private WebDriver driver;
	private WaitActions wait;

	public WebActions(WebDriver driver, WaitActions wait) {
		this.driver = driver;
		this.wait = wait;
	}

	/********* TextField e TextArea ************/

	public void write(WebElement element, String texto, int waitingTime) {
		wait.waitForElementToBeVisible(element, waitingTime);
		element.clear();
		element.sendKeys(texto);
	}

	public void write(WebElement element, String text) {
		write(element, text, WaitActions.STANDARD_TIME);
	}

	public void write(By by, String text, int waitingTime) {
		wait.waitForElementToBeVisible(by, waitingTime);
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(text);
	}

	public void write(By by, String text) {
		write(by, text, WaitActions.STANDARD_TIME);
	}

	/********* Radio e Check ************/

	public void clickRadioButton(WebElement element, int waitingTime) {
		wait.waitButtonBeClickable(element, waitingTime);
		element.click();
	}

	public void clickRadioButton(WebElement element) {
		clickRadioButton(element, WaitActions.STANDARD_TIME);
	}

	public void clickRadioButton(By by, int waitingTime) {
		wait.waitButtonBeClickable(by, waitingTime);
		driver.findElement(by).click();
	}

	public void clickRadioButton(By by) {
		clickRadioButton(by, WaitActions.STANDARD_TIME);
	}

	public void clickCheckButton(WebElement element, int waitingTime) {
		wait.waitButtonBeClickable(element, waitingTime);
		element.click();
	}

	public void clickCheckButton(WebElement element) {
		clickCheckButton(element, WaitActions.STANDARD_TIME);
	}

	public void clickCheckButton(By by, int waitingTime) {
		wait.waitButtonBeClickable(by, waitingTime);
		driver.findElement(by).click();
	}

	public void clicarCheck(By by) {
		clickCheckButton(by, WaitActions.STANDARD_TIME);
	}

// selection box

	public void select(WebElement element, String value, int tempoDeEspera) {
		wait.waitForElementToBeVisible(element, tempoDeEspera);
		Select selection = new Select(element);
		selection.selectByVisibleText(value);
	}

	public void select(WebElement element, String value) {
		select(element, value, WaitActions.STANDARD_TIME);
	}

	public void select(By by, String value, int waitingTime) {
		wait.waitForElementToBeVisible(by, waitingTime);
		WebElement element = driver.findElement(by);
		Select selection = new Select(element);
		selection.selectByVisibleText(value);
	}

	public void select(By by, String value) {
		select(by, value, WaitActions.STANDARD_TIME);
	}

	/********* Combo ************/

	public void selectCombo(WebElement element, String value, int waitingTime) {
		wait.waitForElementToBeVisible(element, waitingTime);
		Select combo = new Select(element);
		combo.selectByVisibleText(value);
	}

	public void selectCombo(WebElement element, String value) {
		selectCombo(element, value, WaitActions.STANDARD_TIME);
	}

	public void selectCombo(By by, String value, int waitingTime) {
		wait.waitForElementToBeVisible(by, waitingTime);
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(value);
	}

	public void selectCombo(By by, String value) {
		selectCombo(by, value, WaitActions.STANDARD_TIME);
	}

	public void deselectCombo(WebElement element, String value, int waitingTime) {
		wait.waitForElementToBeVisible(element, waitingTime);
		Select combo = new Select(element);
		combo.deselectByVisibleText(value);
	}

	public void deselectCombo(WebElement element, String value) {
		deselectCombo(element, value, WaitActions.STANDARD_TIME);
	}

	public void deselectCombo(By by, String value, int waitingTime) {
		wait.waitForElementToBeVisible(by, waitingTime);
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.deselectByVisibleText(value);
	}

	public void deselectCombo(By by, String value) {
		deselectCombo(by, value, WaitActions.STANDARD_TIME);
	}

	public String getComboValue(WebElement element, int waitingTime) {
		wait.waitForElementToBeVisible(element, waitingTime);
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String getComboValue(WebElement element) {
		return getComboValue(element, WaitActions.STANDARD_TIME);
	}

	public String getComboValue(By by, int waitingTime) {
		wait.waitForElementToBeVisible(by, waitingTime);
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String getComboValue(By by) {
		return getComboValue(by, WaitActions.STANDARD_TIME);
	}

	/********* Botao ************/

	public void clickButton(WebElement element, int waitingTime) {
		wait.waitButtonBeClickable(element, waitingTime);
		element.click();
	}

	public void clickButton(WebElement element) {
		clickButton(element, WaitActions.STANDARD_TIME);
	}

	public void clickButton(By by, int waitingTime) {
		wait.waitButtonBeClickable(by, waitingTime);
		WebElement element = driver.findElement(by);
		element.click();
	}

	public void clickButton(By by) {
		clickButton(by, WaitActions.STANDARD_TIME);
	}

	public String getElementValue(WebElement element, int waitingTime) {
		wait.waitButtonBeClickable(element, waitingTime);
		return element.getAttribute("value");
	}

	public String getElementValue(WebElement element) {
		return getElementValue(element, WaitActions.STANDARD_TIME);
	}

	public String getElementValue(By by, int waitingTime) {
		wait.waitButtonBeClickable(by, waitingTime);
		WebElement element = driver.findElement(by);
		return element.getAttribute("value");
	}

	public String getElementValue(By by) {
		return getElementValue(by, WaitActions.STANDARD_TIME);
	}

	/********* Link ************/

	public void clickOnLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	public void clickOnLink(WebElement element, int waitingTime) {
		wait.waitForElementToBeVisible(element, waitingTime);
		element.click();
	}

	public void clickOnLink(WebElement element) {
		clickOnLink(element, WaitActions.STANDARD_TIME);
	}

	public void clickOnLink(By by, int waitingTime) {
		WebElement element = driver.findElement(by);
		wait.waitForElementToBeVisible(by, waitingTime);
		element.click();
	}

	public void clickOnLink(By by) {

		clickOnLink(by, WaitActions.STANDARD_TIME);
	}

	/********* Alerts ************/

	public String getAlertText(int waitingTime) {
		wait.waitTheAlertAppear(waitingTime);
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public String getAlertText() {
		return getAlertText(WaitActions.STANDARD_TIME);
	}

	public String getTextAndAcceptAlert(int waitingTime) {
		wait.waitTheAlertAppear(waitingTime);
		Alert alert = driver.switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;
	}

	public String getTextAndAcceptAlert() {
		return getTextAndAcceptAlert(WaitActions.STANDARD_TIME);
	}

	public String getTextAndDenyAlert(int waitingTime) {
		wait.waitTheAlertAppear(waitingTime);
		Alert alert = driver.switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;
	}

	public String getTextAndDenyAlert() {
		return getTextAndDenyAlert(WaitActions.STANDARD_TIME);
	}

	public void writeNoAlert(String text, int waitingTime) {
		wait.waitTheAlertAppear(waitingTime);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}

	public void writeNoAlert(String text) {
		writeNoAlert(text, WaitActions.STANDARD_TIME);
	}
//window

	public void switchWindow(int numberWindow) {
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[numberWindow]);
	}

	// frame

	public void enterFrame(By by) {
		WebElement element = driver.findElement(by);
		driver.switchTo().frame(element);
	}

	public void exitFrame() {
		driver.switchTo().defaultContent();
	}

	/************** JS *********************/

	public Object executeJs(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}

	// table

	public WebElement getCell(String column, String value, By by) {
		WebElement table = driver.findElement(by);
		int indexColumn = getIndexColumn(column, table);

		getIndexRow(value, table, indexColumn);

		WebElement cell = table.findElement(By.xpath(".//tr['" + 2 + "']/td['" + indexColumn + "']"));
		return cell;
	}

	private int getIndexRow(String value, WebElement table, int column) {
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr/td['" + column + "']"));
		int row = -1;
		for (int i = 0; i < rows.size(); i++) {
			if (rows.get(i).getText().equals(value)) {
				row = i + 1;
				break;
			}
		}
		return row;
	}

	private int getIndexColumn(String column, WebElement table) {
		List<WebElement> columns = table.findElements(By.xpath(".//th"));
		int idColumn = 0;
		for (int i = 0; i < columns.size(); i++) {
			if (columns.get(i).getText().equals(column)) {
				idColumn = i + 1;
				break;
			}
		}
		return idColumn;
	}
}
