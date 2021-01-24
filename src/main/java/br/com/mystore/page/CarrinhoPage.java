package br.com.mystore.page;

public class CarrinhoPage extends BasePage {

	private String BOTAO_CHECKOUT_CARRINHO = "//*[@id='center_column']/p[2]/a[1]/span";
	private String BOTAO_CHECKOUT_ENDERECO = "//*[@id=1center_column']/form/p/button/span";
	
	private String CHECK_TERMOS_DE_SERVICO = "//*[@id='cgv']";
	private String BOTAO_CHECKOUT_FRETE = "//*[@id='form']/p/button/span";
	
	private String LINK_TRANSFERENCIA_BANCARIA = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a";
    private String BOTAO_CONFIRMAR_COMPRA = "//*[@id='cart_navigation']/button/span";
    
    private String MENSAGEM_DE_SUCESSO = "//*[@id='center_column']/div/p/strong";
	
}
