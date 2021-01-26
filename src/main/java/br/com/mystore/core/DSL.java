package br.com.mystore.core;

import static br.com.mystore.core.DriverFactory.closeWebDriver;
import static br.com.mystore.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.mystore.core.DriverFactory;

public class DSL {
     
	private Integer ESPERA_PADRAO = 10;

	public DSL() {

	}

	public DSL visitarPagina(String url) {
		getDriver().get(url);
		return this;
	}
	
	public DSL inserirCampo(String xpath, String valor) {
		WebElement campo = encontrar(xpath);
		campo.sendKeys(valor);
		return this;
	}
	
	public void esperaAteExistente(String xpath) {
		WebDriverWait espera = new WebDriverWait(DriverFactory.getDriver(), ESPERA_PADRAO);
		espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	private WebElement getElemento(String xpath) {
		esperaAteExistente(xpath);
		return getDriver().findElement(By.xpath(xpath));
	}

	private Object executarJavascript(String codigo, Object... parametros) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(codigo, parametros);
	}

	private DSL scrollAteElemento(WebElement elemento) {
		executarJavascript("arguments[0].scrollIntoView(true);", elemento);
		return this;
	}

	private WebElement clicarElemento(String xpath) {
		WebElement elemento = null;
		try {
			scrollAteElemento(getElemento(xpath));
			elemento = (new WebDriverWait(getDriver(), ESPERA_PADRAO))
					.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			elemento.click();
		} catch (WebDriverException e) {
			scrollAteElemento(getElemento(xpath));
			elemento = (new WebDriverWait(getDriver(), ESPERA_PADRAO))
					.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			try {
				elemento.click();
			} catch (ElementClickInterceptedException cl) {
				elemento = (new WebDriverWait(getDriver(), ESPERA_PADRAO))
						.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xpath))));
				elemento.click();
			}

		}
		return elemento;
	}

	public DSL clicar(String xpath) {
		this.clicarElemento(xpath);
		return this;
	}

	public String getTexto(String xpath) {
		WebElement textField = getElemento(xpath);
		String texto;
		try {
			texto = textField.getText().trim();
		} catch (WebDriverException e) {
			textField = getElemento(xpath);
			texto = textField.getText().trim();
		}
		return texto;
	}

	public void fecharNavegador() throws InterruptedException {
		closeWebDriver();
	}
	
	public void clicarBotao(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}
	
	public DSL esperarAteClicavel(String xpath) {
		(new WebDriverWait(getDriver(), ESPERA_PADRAO))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		return this;
	}
	
	public DSL esperarAteExistente(String xPath) {
		WebDriverWait espera = new WebDriverWait(DriverFactory.getDriver(), ESPERA_PADRAO);
		espera.until(ExpectedConditions.presenceOfElementLocated((By.xpath(xPath))));
		return this;
	}
	
	public DSL esperarAteExistente(String xPath, Integer tempo) {
		WebDriverWait espera = new WebDriverWait(DriverFactory.getDriver(), tempo);
		espera.until(ExpectedConditions.presenceOfElementLocated((By.xpath(xPath))));
		return this;
	}
	
	private WebElement encontrar(String campo) {
		esperarAteExistente(campo);
		return getDriver().findElement(By.xpath(campo));
	}
	
	
	public DSL scrollAteTopo() {
		executarJavascript("window.scrollTo(0, 0)");
		return this;
	}	
	
	public DSL scrollDowm(String xpath) {
		executarJavascript("scrollBy(0,250);", xpath);
		return this;
	}
	
	public DSL hover(String xpath) {
		Actions actions = new Actions(DriverFactory.getDriver());
		actions.moveToElement(getDriver().findElement(By.xpath(xpath))).build().perform();
		return this;
	}
}
