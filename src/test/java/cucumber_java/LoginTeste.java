package cucumber_java;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import configurations.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;


public class LoginTeste {
	
	private LoginPage page;
	DriverFactory facDriver;
	
	
	@Before()
	public void inicia() {
		DriverFactory.getDriver();
		page = new LoginPage(DriverFactory.getDriver());
		System.out.println("Iniciando testes");
		
	}
	
	@After(order =0)
	public void finaliaza() {
		DriverFactory.killDriver();
		System.out.println("Fianlizando teste!");
	}
	
	@After(order = 1)
	public void screenShot(Scenario cenario) {
		File file =((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/login_screenshot/"+cenario.getName()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void waitPage(int tempo) {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(tempo));
		
	}
	
	@Given("que desejo fazer login no admim")
	public void que_desejo_fazer_login_no_admim() {
		
		DriverFactory.getDriver();
		page = new LoginPage(DriverFactory.getDriver());		
		System.out.println("Começando teste!");

	}

	@When("Adiciono o usuario {string}")
	public void adiciono_o_usuario(String string) {
		page.setUserName(string);
	}

	@When("eu adiciono a senha {string}")
	public void eu_adiciono_a_senha(String string) {
		page.setSenha(string);
		page.clicaBotao();

		
	}
	
	@Then("eu devo acessar a tela de pedidos")
	public void euDevoAcessarATelaDePedidos() {
		waitPage(5000);
		page.clicaSair2();
		page.clicaBotaoSair2();
	}


	@Then("devo receber a mensagem de erro na abaixo do campo e-mail {string}")
	public void devoReceberAMensagemDeErroNaAbaixoDoCampoEMail(String msgErro) {
		Assert.assertEquals(msgErro,"Insira um endereço de email válido" );

	}

	@Then("devo receber uma mensagem de erro")
	public void devoReceberUmaMensagemDeErro() {
	 
	}




	
	
	
	

}
