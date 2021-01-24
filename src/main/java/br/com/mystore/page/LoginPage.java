package br.com.mystore.page;

public class LoginPage extends BasePage{

	
	private String CAMPO_EMAIL = "//*[@id='email']";
	private String CAMPO_SENHA = "//*[@id='passwd']";
	
	public void logar(String email, String senha) {
		getDSL().digitar(CAMPO_EMAIL, email);
		getDSL().digitar(CAMPO_SENHA, senha);
	}
}
