package br.com.mystore.page;

import br.com.mystore.core.DSL;
import io.cucumber.java.Before;

public class BasePage {

	private DSL dsl;
	
	private String INDEX_URL = "http://automationpractice.com/index.php";

	protected DSL getDSL() {
		if (dsl == null) {
			dsl = new DSL();			
		}
		return dsl;
	}
	
	public void closeBrowser() throws InterruptedException {
		getDSL().fecharNavegador();
	}
	
	public void acessarIndexPage() {
		getDSL().visitarPagina(INDEX_URL);
	}
	
}
