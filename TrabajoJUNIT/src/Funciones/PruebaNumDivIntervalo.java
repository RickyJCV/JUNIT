package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaNumDivIntervalo {

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
		assertEquals(0, o.NumDivIntervalo(3, 300));

	}
	
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		assertEquals(0, o.NumDivIntervalo(4, 150));

	}
	
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		assertEquals(50, o.NumDivIntervalo(3, 150));

	}
	
	@DisplayName("Prueba de flujo de datos 4")
	@Test
	void resultadoEsperado4() {
		assertNotEquals(51, o.NumDivIntervalo(3, 150));

	}
	
	@DisplayName("Prueba de flujo de datos 5")
	@Test
	void resultadoEsperado5() {
		assertEquals(-50, o.NumDivIntervalo(-3, 150));

	}
	
	@DisplayName("Analisis de Valores Limites 1")
	@Test
	void conValorMaximo() {
		int valorMaximo = Integer.MAX_VALUE;

		assertEquals(0, o.NumDivIntervalo(3,valorMaximo-1));
	}
	
	@DisplayName("Analisis de Valores Limites 2")
	@Test
	void conValorMinimo() {
		int valorMinimo = Integer.MIN_VALUE;

		assertEquals(0, o.NumDivIntervalo(valorMinimo,150));
	}
	
	


}
