package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaCadenasMayusVocal {

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
		assertEquals("crdndrsnl", o.CadenasMayusVocal("Ricardo", "Andres", "Daniel"));

	}
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		assertEquals("crdndrsnl", o.CadenasMayusVocal("RicardO", "AndrEs", "DaniEl"));

	}
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		assertEquals("", o.CadenasMayusVocal("RICARDO", "ANDRES", "DANIEL"));

	}
	@DisplayName("Prueba de flujo de datos 4")
	@Test
	void resultadoEsperado4() {
		assertEquals("1cr0nr3s4n13l", o.CadenasMayusVocal("R1carD0", "AnDr3s", "D4n13l"));

	}
	@DisplayName("Prueba de flujo de datos 5")
	@Test
	void resultadoEsperado5() {
		assertEquals("ríndréssé", o.CadenasMayusVocal("María", "Andrés", "José"));

	}
	@DisplayName("Prueba de flujo de datos 6")
	@Test
	void resultadoEsperado6() {
		assertEquals("n-4rí0sé/4nr3sly&4n4ls", o.CadenasMayusVocal("Ana-M4ría", "J0sé/4nDr3s", "Wily&C4n4les"));

	}
	
}
