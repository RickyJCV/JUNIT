package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import javax.print.attribute.IntegerSyntax;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaIntervalo {

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
		assertEquals(true, o.Intervalo(200));

	}
	
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		assertNotEquals(false, o.Intervalo(100));

	}
	
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		assertNotEquals(true, o.Intervalo(300));

	}
	@DisplayName("Analisis de Valores Limites 1")
	@Test
	void valorMaximo() {
		int valorMaximo = Integer.MAX_VALUE;

		assertNotEquals(true, o.Intervalo(valorMaximo));

	}
	@DisplayName("Analisis de Valores Limites 2")
	@Test
	void valorMaximo2() {
		int valorMaximo = Integer.MAX_VALUE;

		assertEquals(false, o.Intervalo(valorMaximo+1));

	}
	@DisplayName("Analisis de Valores Limites 3")
	@Test
	void valorMaximo3() {
		int valorMinimo = Integer.MIN_VALUE;

		assertNotEquals(true, o.Intervalo(valorMinimo));

	}
	@DisplayName("Analisis de Valores Limites 4")
	@Test
	void valorMaximo4() {
		int valorMinimo = Integer.MIN_VALUE;

		assertEquals(false, o.Intervalo(valorMinimo+1));

	}
	
}
