package Funciones;

import java.util.Scanner;

public class FuncionesJUNIT {

	public static boolean NumDiv(int numero) {
		boolean resultado = false;
		if (numero % 3 == 0) {
			resultado = true;
		}
		return resultado;
	}

	public static boolean Intervalo(int numero) {
		boolean resultado = false;
		if (numero <= 200 && numero >= 100) {
			resultado = true;
		}
		return resultado;
	}

	public static int NumDivIntervalo(int numero1, int numero2) {
		int resultado = 0;
		if (NumDiv(numero1) == true && Intervalo(numero2) == true) {
			resultado = numero2 / numero1;
		}
		return resultado;
	}

	public static String CadenasMayusVocal(String cadena1, String cadena2, String cadena3) {
		String result = null;
		String a = "";
		char pos;
		result = cadena1 + cadena2 + cadena3;
		for (int i = 0; i < result.length(); i++) {
			pos = result.charAt(i);
			if (!(pos > 64 && pos < 91) && !(pos == 'a' || pos == 'e' || pos == 'i' || pos == 'o' || pos == 'u')) {
				a = a + pos;
			}
		}
		return a;
	}

	public static int NumeroCadena(String cadena) {
		int valornum = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57) {
				int num = Character.getNumericValue(cadena.charAt(i));
				valornum = valornum + num;
			}
		}

		return valornum;
	}

	public static double[] listaDoble(double lista[]) {
		for (int i = 0; i < lista.length; i++) {
			if (i % 2 == 0) {
				lista[i] = lista[i] * 2;
			} else {
				lista[i] = (lista[i] * lista[i]) * lista[i];
			}
			System.out.println(lista[i]);
		}
		return lista;
	}

	public static String[] listaCadena(String cadena[]) {
		String devuelve []= new String [3];
		for (int i = 0; i < cadena.length; i++) {
				devuelve[i] = cadena[i].substring(2, 5);
				System.out.println(devuelve[i]);
		}
		return devuelve;
	}

	public static boolean CompruebaTiempo(String Alumnos[][]) {
		boolean resultado = true;
		boolean tiempoAlumno[] = new boolean[3];
		int notas[] = new int[3];
		for (int i = 0; i < Alumnos.length; i++) {
			for (int j = 1; j < Alumnos[i].length; j++) {
				notas[i] = notas[i] + Integer.parseInt(Alumnos[i][j]);
			}
		}
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] <= 300) {
				tiempoAlumno[i] = false;
			} else {
				tiempoAlumno[i] = true;
			}
		}

		for (int i = 0; i < tiempoAlumno.length; i++) {
			if (tiempoAlumno[i] == false) {
				resultado = false;
			}
		}
		return resultado;
	}

}
