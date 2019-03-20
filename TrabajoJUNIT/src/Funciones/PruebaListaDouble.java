package Funciones;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaListaDouble {

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
		double [] lista = {2.0,3.0,4.0,5.0};
		double [] resultado= {4.0,27.0,8.0,125.0};
		assertArrayEquals(resultado, o.listaDoble(lista));

	}
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		double [] lista = {};
		double [] resultado= {};
		assertArrayEquals(resultado, o.listaDoble(lista));

	}
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		double [] lista = {-2.0,-3.0,-4.0,-5.0};
		double [] resultado= {-4.0,-27.0,-8.0,-125.0};
		assertArrayEquals(resultado, o.listaDoble(lista));

	}
	
}
