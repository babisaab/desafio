package br.com.mystore.page;

public class IndexPage extends BasePage {

	private String BARRA_DE_PESQUISA = "//*[@id='search_query_top']";
	private String BOTAO_DE_PESQUISA = "//*[@id='searchbox']/button";
	
	private String QUICK_VIEW = "//a[@class='quick-view']";
	
	private String BOTAO_DETALHES = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span";
	private String IMAGEM_PRODUTO = "//*[@id='center_column']/ul/li/div/div[2]/h5/a";
	
	private String NOME_PRODUTO = "//*[@id='center_column']/div/div/div[3]/h1";
	
	private String BOTAO_ADICIONAR_AO_CARRINHO = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span";
	private String BOTAO_CHECKOUT = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span";

	

	public void pesquisarProduto() {
		getDSL().inserirCampo(BARRA_DE_PESQUISA, "Faded Short Sleeve");
		getDSL().clicarBotao(BOTAO_DE_PESQUISA);
	}
	
	public void escolherProduto() {
		getDSL().scrollAteImagem(IMAGEM_PRODUTO);
		getDSL().hover(IMAGEM_PRODUTO);
		getDSL().clicarBotao(BOTAO_DETALHES);
	}
	
	public String verficaNomeDoProduto() {
		return getDSL().getTexto(NOME_PRODUTO);
	}
}
