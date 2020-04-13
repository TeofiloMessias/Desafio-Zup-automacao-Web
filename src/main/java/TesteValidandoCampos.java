import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TesteValidandoCampos {

	@Test
	public void preencher() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\drives\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1- Entre em um grande portal de comércio online (Exemplo: Americanas, Submarino, Magazine Luiza)
		
		driver.navigate().to("https://americanas.com.br/");		
		driver.manage().window().maximize();
		
		// 2- Faça uma busca por um produto 
		
		driver.findElement(By.xpath("//input[@id='h_search-input']")).sendKeys("Smart TV LED");
		
		//botão Pesquisar
		driver.findElement(By.xpath("//button[@id='h_search-btn']")).click();		
		
		//3- Valide o retorno da busca
		
		String validarProduto = driver.findElement(By.xpath("//h1[@class='h1 page-title'][contains(.,'Smart TV LED')]")).getText();
		//Assert.assertEquals("Você quis dizer:", validarProduto);
		
		// 4- Escolha um produto na lista
		driver.findElement(By.xpath("//span[contains(.,'R$ 849,00')]")).click();
				
		
		// 5- Adicione o carrinho
			//botão comprar
		//driver.findElement(By.linkText("comprar")).click();
		driver.findElement(By.id("btn-buy")).click();
		
			//botão continuar
		
		driver.findElement(By.linkText("Continuar")).click();
	
		
		
		// 6- Valide o produto no carrinho	
		
		String cestaProduto = driver.findElement(By.xpath("(//font[contains(.,'Minha cesta')])[2]")).getText();
	   Assert.assertEquals("Minha cesta:", cestaProduto);
		
		
		
	}
		
}
