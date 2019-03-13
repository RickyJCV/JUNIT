package Funciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {
	static FuncionesJUNIT o = null;

	@Test
	void resultadoEsperado() {
		assertEquals(true, o.NumDiv(3));
	}

	@Test
	void resultadoInesperado() {
		assertNotEquals(false, o.NumDiv(3));
	}

	@Test
	void resultadoEsperadoNegativo() {
		assertEquals(true, o.NumDiv(-3));
	}

	@Test
	void resultadoInesperadoNegativo() {
		assertNotEquals(false, o.NumDiv(-3));
	}

	@Test
	void conValorMaximo() {
		int valorMaximo = Integer.MAX_VALUE;

		assertEquals(true, o.NumDiv(valorMaximo - 1));
	}

	/**Esta prueba de fallar y no lo hace
	 * @Test
	void conValorMaximo2() {
		int valorMaximo = Integer.MAX_VALUE;

		assertNotEquals(true, o.NumDiv(valorMaximo));

	}
*/
}
