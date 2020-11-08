package anotacoes;

import exemplos.BeforeAll;
import exemplos.BeforeEach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AnotacaoBefore {
	
	/*
	 * Os métodos anotados com a anotação @BeforeAll são executados antes da inicialização dos testes
	 */
	@BeforeAll
	static void exemploBeforeAll() {
		// Abre o navegador antes dos métodos de testes das class's
		System.setProperty("webdriver.chrome.driver", "Users/exemplo/drivers/chromedriver");
		WebDriver driver = new ChomeDriver();
		driver.manage().timeouts().ImplicitlyWait(5, TimeUnit.SECONDS);
		// Informa o navegador a URL de acesso
		driver.get("www.google.com");
	}
	
	
	/*
	 * Os métodos anotados com a anotação @BeforeEach são executados antes de cada teste
	 */
	@BeforeEach
	void exemploBeforeEach() {
		// É comum o login ser criado dentro de uma anotação BeforeEach para que os testes seja independentes
		driver.findElement(By.id("usuario")).sendKeys("Teste");
		driver.findElement(By.cssSelector(".senha")).sendKeys("Teste");
		driver.findElement(By.xpath("Logar"))..click();
	}
}
