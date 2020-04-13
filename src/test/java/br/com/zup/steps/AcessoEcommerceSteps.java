package br.com.zup.steps;

import br.com.zup.pageobjects.AcessoEcommercePage;
import br.com.zup.pageobjects.BasePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;




	public class AcessoEcommerceSteps extends BasePage{
		AcessoEcommercePage  ecommerce = new AcessoEcommercePage();
		
		@Dado("que o usuario esteja em um portal de comercio online")
		public void que_o_usuario_esteja_em_um_portal_de_comercio_online() {
		    ecommerce.toEcommerceWeb();
		}
		
		@Quando("o usuario realizar a busca por um produto")
		public void o_usuario_realizar_a_busca_por_um_produto() {
			ecommerce.realizaBuscaWeb();
		    
		}

		@Então("o usuario adicionara o produto no carrinho de compra")
		public void o_usuario_adicionara_o_produto_no_carrinho_de_compra() {
			ecommerce.validaCompra();
		}


}
