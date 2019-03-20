package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaNumeroCadena {

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
		assertEquals(32, o.NumeroCadena("Ricardo05021996"));

	}
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		assertEquals(30, o.NumeroCadena("Daniel13101996"));

	}
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		assertEquals(39, o.NumeroCadena("Andres28111989"));

	}
	@DisplayName("Prueba de flujo de datos 4")
	@Test
	void resultadoEsperado4() {
		assertEquals(101, o.NumeroCadena("Ricardo05021996Daniel13101996Andres28111989"));

	}
	@DisplayName("Prueba de flujo de datos 5")
	@Test
	void resultadoEsperado5() {
		assertEquals(0, o.NumeroCadena("RicardoDanielAndres"));

	}
	@DisplayName("Prueba de flujo de datos 6")
	@Test
	void resultadoEsperado6() {
		assertEquals(0, o.NumeroCadena("/ :"));

	}


}
