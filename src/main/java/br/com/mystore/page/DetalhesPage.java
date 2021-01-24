package br.com.mystore.page;

public class DetalhesPage extends BasePage {

    private String NOME_PRODUTO = "//*[@id='center_column']/div/div/div[3]/h1";
	
	private String BOTAO_ADICIONAR_AO_CARRINHO = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span";
	private String BOTAO_CHECKOUT = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span";

	
	public String verficaNomeDoProduto() {
		return getDSL().getTexto(NOME_PRODUTO);
	}
	
	public void adicionarAoCarrinho() {
		getDSL().clicar(BOTAO_ADICIONAR_AO_CARRINHO);
	}
	
	public void irParaCheckout() {
		getDSL().clicar(BOTAO_CHECKOUT);
	}
}
