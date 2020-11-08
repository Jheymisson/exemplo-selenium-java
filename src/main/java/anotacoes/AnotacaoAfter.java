package anotacoes;

import exemplos.AfterAll;
import exemplos.AfterEach;

public class AnotacaoAfter {

	/*
	 * Os métodos anotados com a anotação @AfterEach tem a finalidade de realizar uma ação a cada finalização do teste
	 */
	@AfterEach
	void exemploAfterEach() {
		// O exemplo a seguir é que ao teste ser finalizado, seja realizado um retorno para a página inicial da aplicação
		driver.findElement(By.id("BtnBack")).click();
		assertEquals("Seja bem-vindo Jonas", "Seja bem-vindo Jonas");
	}
	
	/*
	 * Os métodos anotados com a anotação @AfterAll tem a finalidade de realizar uma ação após a finalização da suíte de teste
	 */
	@AfterAll
	static void exemploAfterAll() {
		// Exemplo comum
		driver.quit();
		// ou
		driver.close();
	}
	
	
}
