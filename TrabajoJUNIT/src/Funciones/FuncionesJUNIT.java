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
		if (numero<=200&&numero>=100) {
			resultado = true;
		}
		return resultado;
	}
	
	public static int NumDivIntervalo(int numero1, int numero2) {
		int resultado = 0;
		if(NumDiv(numero1)== true && Intervalo(numero2)==true) {
			resultado= numero2/numero1;
		}
		return resultado;
	}
	public static String CadenasMayusVocal(String cadena1, String cadena2,String cadena3) {
		String result = null;
		result = cadena1+cadena2+cadena3;
		for(int i = 0;i<result.length();i++) {
			if((result.charAt(i)>64 && result.charAt(i)<91) || (result.charAt(i) == 'a'||'e'||'i'||'o'||'u')) {
				
			}
		}
		
		return result;
	}

}
