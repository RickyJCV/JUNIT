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
		String[] devuelve;
		for (int i = 0; i > cadena.length; i++) {
			for (int j = 2; j >= 5; j++) {
				devuelve[i] = cadena[i].charAt(j);
			}
		}
		return devuelve;
	}

	public static boolean CompruebaTiempo(String Nombres[], int TiempoTarea[][]) {
		boolean tiempo300 = false;
		int SumaTareas[] = new int[20];// suma de 21 alumnos, La matriz TiempoTarea podia ser de 20x2
		// para 21 alumnos y tres tareas...
		int contAlumnos = 0;

		// hacer la suma de las tareas de cada alumno
		for (int x = 0; x < TiempoTarea.length; x++) {
			for (int y = 0; y < TiempoTarea[x].length; y++) {
				++contAlumnos;
				SumaTareas[contAlumnos] = TiempoTarea[x][y];
			}
		}

//ahora recorro  arrays de alumnos y de suma de tareas
		for (int i = 0; i < Nombres.length; i++) {
			if (SumaTareas[i] >= 300) {
				tiempo300 = true;
				System.out.println(
						"El alumno " + Nombres[i] + " ha realizado las tareas en " + SumaTareas[i] + " minutos");

				return tiempo300;
			}
			if (SumaTareas[i] < 300) {
				tiempo300 = false;
				System.out.println(
						"El alumno " + Nombres[i] + " ha realizado las tareas en " + SumaTareas[i] + " minutos");

				return tiempo300;
			}

		}

		return tiempo300;// este return sobraria pero si lo quito falla todo.... que lo arregle nuestro
							// amigo Eliot
	}

}
