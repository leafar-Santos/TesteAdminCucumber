package DSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}


	public void escreveById(String nomeCampo, String texto) {
		driver.findElement(By.id(nomeCampo)).sendKeys(texto);
	}

	
	/*
	// M�todos que escrevem
	public void escreveByName(String nomeCampo, String texto) {
		driver.findElement(By.name(nomeCampo)).sendKeys(texto);
	}
*/
	
	
	// M�todos que clicam em botões
	public void clicaByName(String nomeBotao) {
		driver.findElement(By.className(nomeBotao)).click();
	}



	public void clicaByid(String idBotao) {
		driver.findElement(By.id(idBotao)).click();
	}
	
/*

	public void clicaByLink(String nomeLink) {
		driver.findElement(By.linkText(nomeLink)).click();
	}


*/
	public void clicaByCssSeletor(String nomeCss) {
		driver.findElement(By.cssSelector(nomeCss)).click();
		;
	}

	/*
	// Asserts Textos
	public String obterValorCampoByname(String nomeCampo) {
		return driver.findElement(By.name(nomeCampo)).getAttribute("value");
	}

	// Asserts Sele��es
	public Boolean selecionadoByName(String nomeCampo) {
		return driver.findElement(By.name(nomeCampo)).isSelected();
	}

	// M�todos muda de p�gina
	public void mudaPagina(int posicao) {
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[posicao]);
	}
*/
}
