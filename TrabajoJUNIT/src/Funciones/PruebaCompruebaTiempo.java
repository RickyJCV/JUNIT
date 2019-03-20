package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaCompruebaTiempo {

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
		String matriz[][]= new String [3][4];
		matriz [0][0] = "Ricardo";
		matriz [0][1] = "200";
		matriz [0][2] = "100";
		matriz [0][3] = "50";
		
		matriz [1][0] = "Jose Andres";
		matriz [1][1] = "150";
		matriz [1][2] = "200";
		matriz [1][3] = "50";
		
		matriz [2][0] = "Daniel";
		matriz [2][1] = "300";
		matriz [2][2] = "1";
		matriz [2][3] = "0";
		assertTrue(o.CompruebaTiempo(matriz));

	}
	@DisplayName("Prueba de flujo de datos 2")
	@Test
	void resultadoEsperado2() {
		String matriz[][]= new String [3][4];
		matriz [0][0] = "Ricardo";
		matriz [0][1] = "0";
		matriz [0][2] = "0";
		matriz [0][3] = "0";
		
		matriz [1][0] = "Jose Andres";
		matriz [1][1] = "0";
		matriz [1][2] = "0";
		matriz [1][3] = "0";
		
		matriz [2][0] = "Daniel";
		matriz [2][1] = "0";
		matriz [2][2] = "0";
		matriz [2][3] = "0";
		assertFalse(o.CompruebaTiempo(matriz));

	}
	@DisplayName("Prueba de flujo de datos 3")
	@Test
	void resultadoEsperado3() {
		String matriz[][]= new String [3][4];
		matriz [0][0] = "Ricardo";
		matriz [0][1] = "150";
		matriz [0][2] = "150";
		matriz [0][3] = "1";
		
		matriz [1][0] = "Jose Andres";
		matriz [1][1] = "350";
		matriz [1][2] = "0";
		matriz [1][3] = "0";
		
		matriz [2][0] = "Daniel";
		matriz [2][1] = "0";
		matriz [2][2] = "0";
		matriz [2][3] = "0";
		assertFalse(o.CompruebaTiempo(matriz));

	}
	@DisplayName("Prueba de flujo de datos 4")
	@Test
	void resultadoEsperado4() {
		String matriz[][]= new String [3][4];
		matriz [0][0] = "Ricardo";
		matriz [0][1] = "-150";
		matriz [0][2] = "-150";
		matriz [0][3] = "-1";
		
		matriz [1][0] = "Jose Andres";
		matriz [1][1] = "-350";
		matriz [1][2] = "0";
		matriz [1][3] = "0";
		
		matriz [2][0] = "Daniel";
		matriz [2][1] = "-400";
		matriz [2][2] = "0";
		matriz [2][3] = "0";
		assertFalse(o.CompruebaTiempo(matriz));

	}
	@DisplayName("Prueba de flujo de datos 5")
	@Test
	void resultadoEsperado5() {
		String matriz[][]= new String [3][4];
		matriz [0][0] = "Ricardo";
		matriz [0][1] = "-50";
		matriz [0][2] = "200";
		matriz [0][3] = "151";
		
		matriz [1][0] = "Jose Andres";
		matriz [1][1] = "-100";
		matriz [1][2] = "400";
		matriz [1][3] = "1";
		
		matriz [2][0] = "Daniel";
		matriz [2][1] = "-400";
		matriz [2][2] = "400";
		matriz [2][3] = "301";
		assertTrue(o.CompruebaTiempo(matriz));

	}

}