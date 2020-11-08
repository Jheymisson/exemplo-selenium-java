package Asserts;

import static org.junit.jupiter.api.Assertions.fail;

import anotacoes.Test;

public class AssertFail {

	/*
	 * Caso uma exceção seja lançada, o teste falhará automaticamente devido ao Fail
	 */
	@Test
	void exemploNegativo() {
	    fail("NullPointerException");
	}
	
}
