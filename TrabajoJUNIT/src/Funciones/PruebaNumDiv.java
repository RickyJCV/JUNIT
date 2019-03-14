package Funciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaNumDiv {
	static int cont = 0;
	static FuncionesJUNIT o = null;

	@BeforeAll
	public static void crearObjeto() {
		o = new FuncionesJUNIT();
	}

	@AfterEach
	public void imprimirPrueba() {
		cont++;
		System.out.println("Prueba numero " + cont + " realizada");
	}

	@AfterAll
	public static void vaciarObjeto() {
		o = null;
	}

	@DisplayName("Prueba de flujo de datos 1")
	@Test
	void resultadoEsperado() {
		assertEquals(true, o.NumDiv(3));

	}

	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoInesperado() {
		assertNotEquals(false, o.NumDiv(3));
	}

	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperadoNegativo() {
		assertEquals(true, o.NumDiv(-3));
	}

	@DisplayName("Prueba de flujo de datos 4")
	@Test
	void resultadoInesperadoNegativo() {
		assertNotEquals(false, o.NumDiv(-3));
	}

	@DisplayName("Analisis de Valores Limites 1")
	@Test
	void conValorMaximo() {
		int valorMaximo = Integer.MAX_VALUE;

		assertEquals(true, o.NumDiv(valorMaximo - 1));
	}

	@DisplayName("Analisis de Valores Limites 2")
	@Test
	void conValorMaximo2() {
		int valorMaximo = Integer.MAX_VALUE;

		assertNotEquals(true, o.NumDiv(valorMaximo));

	}

}
