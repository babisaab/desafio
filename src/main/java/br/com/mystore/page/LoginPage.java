package br.com.mystore.page;

public class LoginPage extends BasePage{

	
	private String CAMPO_EMAIL = "//*[@id='email']";
	private String CAMPO_SENHA = "//*[@id='passwd']";
	private String BOTAO_LOGIN = "//*[@id='SubmitLogin']";
	
	public void logar(String email, String senha) {
		getDSL().inserirCampo(CAMPO_EMAIL, email);
		getDSL().inserirCampo(CAMPO_SENHA, senha);
		getDSL().clicar(BOTAO_LOGIN);
	}
}
