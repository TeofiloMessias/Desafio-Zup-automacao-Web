package br.com.zup.pageobjects;

import org.junit.Assert;


import org.openqa.selenium.By;

public class AcessoEcommercePage extends BasePage {

	private By buscaProduto = By.xpath("//input[@id='h_search-input']");
	private By botaoPesquisa = By.xpath("//button[@id='h_search-btn']");
	private By validaBusca = By.xpath("//h1[@class='h1 page-title'][contains(.,'Smart TV LED')]");
	private By escolheProduto = By.xpath("//span[contains(.,'R$ 849,00')]");
	private By addCarrinho = By.xpath("//div[@class='Wrapper-sc-1i9za0i-3 kmswup ViewUI-sc-1ijittn-6 iXIDWU'][contains(.,'comprar')]\"");
	private By comprar = By.xpath("//span[@class='TextUI-sc-1i9za0i-4 gulQE TextUI-sc-12tokcy-0 gYgvXd'][contains(.,'Continuar')]");					
	private By validaProdCarrinho = By.xpath("(//font[contains(.,'Minha cesta')])[2]");

	public void toEcommerceWeb() {
		getDriver().navigate().to("https://www.americanas.com.br/");
	}

	public void realizaBuscaWeb() {

		getDriver().findElement(buscaProduto).sendKeys("Smart TV LED");
		getDriver().findElement(botaoPesquisa).click();
		getDriver().findElement(escolheProduto).click();
		getDriver().findElement(addCarrinho).click();
		getDriver().findElement(comprar).click();

	}

	public void validaBuscaProd() {

		Assert.assertEquals("smart tv led", validaBusca);

	}

	public void validaCompra() {

		Assert.assertEquals("Minha cesta:", validaProdCarrinho);

	}

}
