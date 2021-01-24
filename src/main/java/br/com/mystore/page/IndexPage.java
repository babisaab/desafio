package br.com.mystore.page;

public class IndexPage extends BasePage {

	private String BARRA_DE_PESQUISA = "//*[@id='search_query_top']";
	private String BOTAO_DE_PESQUISA = "//*[@id='searchbox']/button";
	
	private String QUICK_VIEW = "//a[@class='quick-view']";
	
	private String BOTAO_DETALHES = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span";
	private String IMAGEM_PRODUTO = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]";
	
	public void pesquisarProduto() {
		getDSL().inserirCampo(BARRA_DE_PESQUISA, "Faded Short Sleeve");
		getDSL().clicarBotao(BOTAO_DE_PESQUISA);
	}
	
	public void escolherProduto() {
		getDSL().scrollAteImagem(IMAGEM_PRODUTO);
		getDSL().hover(IMAGEM_PRODUTO);
		getDSL().clicarBotao(BOTAO_DETALHES);
	}
}
