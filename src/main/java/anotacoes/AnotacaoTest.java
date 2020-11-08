package anotacoes;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AnotacaoTest {

	/**
	 * A anotação @Test é usado para o método virar um método de teste
	 */
	@Test
	void exemploTest() {
	}
	
	/*
	 * Enquanto a anotação @Deisabled estiver presente no teste, o teste não irá rodar
	 */
	@Test
	@Disabled("demostração")
	void exemploDesativado() {
	    // Teste não executado
	}
	
	
}
