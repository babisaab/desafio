#  language:pt

Funcionalidade: Carrinho de compras
  Deve realizar a pesquisa e o fluxo de compra completo no website My Store
  
Contexto:  Deve realizar a pesquisa de um produto
Dado que pesquiso por um "<produto>"
Quando clico no botao mais do primeiro produto exibido

Cenario: Pesquisa e visualizacao dos detalhes de um produto
Entao devo ser redirecionado para a tela de detalhes do produto pesquisado

Cenario: Fluxo completo de compra
Dado adiciono o produto ao carrinho
Quando decido prosseguir com o checkout
E realizo o login informando "<email>" e "<senha>" corretos
E escolho o endereco para entrega
E concordo com os termos do servico de frete
E escolho pagar por transferencia bancaria
E confirmo a minha compra
Entao deve ser exibida a mensagem "Your order on My Store is complete."