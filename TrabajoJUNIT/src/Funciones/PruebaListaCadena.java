package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaListaCadena {

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
		String nombres[]= {"Danielito","Ricardito","JoselitoAndresito"};
		String resultado[]= {"nie","car","sel"};
		assertArrayEquals(resultado, o.listaCadena(nombres));

	}
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		String nombres[]= {"13101996","28111989","05021996"};
		String resultado[]= {"101","111","021"};
		assertArrayEquals(resultado, o.listaCadena(nombres));

	}
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		String nombres[]= {"#&%**","#&%**","#&%**"};
		String resultado[]= {"101","111","021"};
		assertArrayEquals(resultado, o.listaCadena(nombres));

	}

}
