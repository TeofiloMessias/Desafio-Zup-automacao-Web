#language: pt
#Version: 1.0
#Author:Teofilo Messias Filho
@AcessoEcommerce
Funcionalidade: Ter acesso ao comercio online para compra de um produto

  @Ecommerce
  Cenario: Acessar um portal ecommerce e realizar uma busca por um produto
    Dado que o usuario esteja em um portal de comomercio online 
    Quando o usuario realizar a busca por um produto
    Então o usuario adicionara o produto no carrinho de compra