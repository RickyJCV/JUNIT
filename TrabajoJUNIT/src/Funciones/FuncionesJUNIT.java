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
		String a = "";
		char pos;
		result = cadena1+cadena2+cadena3;
		for(int i = 0;i<result.length();i++) {
			pos = result.charAt(i);
			if(!(pos>64 && pos<91) && !(pos == 'a'||pos =='e'||
					pos =='i'||pos =='o'||pos =='u')) {
				a = a +pos;
			}
		}
		return a;
	}
	
	public static int NumeroCadena(String cadena) {
		int num = 0;
		for(int i = 0; i < cadena.length();i++) {
			if(cadena.charAt(i)>=48 && cadena.charAt(i)<=57) {
				num += Integer.parseInt(cadena);
				System.out.println(num);
			}
		}
		return num;
	}
	
}
