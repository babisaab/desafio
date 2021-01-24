package br.com.mystore.steps;

import org.junit.Assert;

import br.com.mystore.page.CarrinhoPage;
import br.com.mystore.page.DetalhesPage;
import br.com.mystore.page.IndexPage;
import br.com.mystore.page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class MyStoreSteps {
       
	private IndexPage indexPage = new IndexPage();
	private DetalhesPage detalhesPage = new DetalhesPage();
	private LoginPage loginPage = new LoginPage();
	private CarrinhoPage carrinhoaPage = new CarrinhoPage();
	
    @After()
	public void fecharNavegador() throws InterruptedException {
		indexPage.closeBrowser();
	}
	
	@Dado("que pesquiso por um {string}")
	public void que_pesquiso_por_um(String string) {
                indexPage.acessarIndexPage();
                indexPage.pesquisarProduto();
	}

	@Quando("clico no botao mais do primeiro produto exibido")
	public void clico_no_botao_mais_do_primeiro_produto_exibido() {
        indexPage.escolherProduto();        
	}

	@Entao("devo ser redirecionado para a tela de detalhes do produto pesquisado")
	public void devo_ser_redirecionado_para_a_tela_de_detalhes_do_produto_pesquisado() {
		Assert.assertEquals(detalhesPage.verficaNomeDoProduto(), "Faded Short Sleeve T-shirts");
              
	}

	@Dado("adiciono o produto ao carrinho")
	public void adiciono_o_produto_ao_carrinho() {
	    indexPage.acessarIndexPage();
	    indexPage.pesquisarProduto();
	    indexPage.escolherProduto();
	}

	@Quando("decido prosseguir com o checkout")
	public void decido_prosseguir_com_o_checkout() {
		detalhesPage.adicionarAoCarrinho();
		detalhesPage.irParaCheckout();
	}

	@Quando("realizo o login informando {string} e {string} corretos")
	public void realizo_o_login_informando_e_corretos(String email, String senha) {
                //loginPage.logar("teste@gmail.com", "123456");
	}

	@Quando("escolho o endereco para entrega")
	public void escolho_o_endereco_para_entrega() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("concordo com os termos do servico de frete")
	public void concordo_com_os_termos_do_servico_de_frete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("escolho pagar por transferencia bancaria")
	public void escolho_pagar_por_transferencia_bancaria() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("confirmo a minha compra")
	public void confirmo_a_minha_compra() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Entao("deve ser exibida a mensagem {string}")
	public void deve_ser_exibida_a_mensagem(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
}
