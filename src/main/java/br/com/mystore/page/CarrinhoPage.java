package br.com.mystore.page;

public class CarrinhoPage extends BasePage {

	private String BOTAO_CHECKOUT_CARRINHO = "//*[@id='center_column']/p[2]/a[1]/span";
	private String BOTAO_CHECKOUT_ENDERECO = "//*[@id='center_column']/form/p/button/span";
	
	private String CHECK_TERMOS_DE_SERVICO = "//*[@id='uniform-cgv']";
	private String BOTAO_CHECKOUT_FRETE = "//*[@name='processCarrier']";
	
	private String LINK_TRANSFERENCIA_BANCARIA = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a";
    private String BOTAO_CONFIRMAR_COMPRA = "//*[@id='cart_navigation']/button/span";
    
    private String MENSAGEM_DE_SUCESSO = "//*[@id='center_column']/div/p/strong";
    
    public void prosseguirCheckout() {
    	getDSL().clicarBotao(BOTAO_CHECKOUT_CARRINHO);
    }
    
    public void confirmarEndereco() {
    	getDSL().clicarBotao(BOTAO_CHECKOUT_ENDERECO);

    }
    
    public void aceitarTermosServico() {
    	getDSL().clicar(CHECK_TERMOS_DE_SERVICO);
    	getDSL().clicar(BOTAO_CHECKOUT_FRETE);
    }
    
    public void selecionarPagamentoTransfereciaBancaria() {
    	getDSL().clicar(LINK_TRANSFERENCIA_BANCARIA);
    }
    
    public void confirmarCompra() {
    	getDSL().clicarBotao(BOTAO_CONFIRMAR_COMPRA);
    }
	
    public String verificarMensagemSucesso () {
    	return getDSL().getTexto(MENSAGEM_DE_SUCESSO);
    }
}
