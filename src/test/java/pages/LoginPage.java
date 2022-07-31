package pages;

import org.openqa.selenium.WebDriver;

import DSL.DSL;

public class LoginPage {

	private DSL dsl;
	public LoginPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	
	public void setUserName(String nome) {
		dsl.escreveById("email", nome);
	}
	
	public void setSenha(String senha) {
		dsl.escreveById("password", senha);
	}
	
	public void clicaBotao() {
		dsl.clicaByName("MuiButton-label");
	}
	
	public void clicaSair() {
		dsl.clicaByCssSeletor("MuiIconButton-label > #icon");
	}
	
	public void clicaBotaoSair() {
		dsl.clicaByid("profile-menu-item-logout");
	}
	
	public void clicaSair2() {
		dsl.clicaByid("icon");
	}
	
	public void clicaBotaoSair2() {
		dsl.clicaByid("profile-menu-item-logout");
	}
	
	
}
