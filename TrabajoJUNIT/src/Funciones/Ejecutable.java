package Funciones;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] lista = {2.0,3.0,4.0,5.0};

		String nombres[]= {"Danielito","Ricardito","JoselitoAndresito"};
	 
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
		
				
		System.out.println(FuncionesJUNIT.NumDiv(9));
		
		System.out.println(FuncionesJUNIT.Intervalo(150));
		
		System.out.println(FuncionesJUNIT.NumDivIntervalo(4, 150));
		
		System.out.println(FuncionesJUNIT.CadenasMayusVocal("Andres", "Ricardo", "Dani"));
		
		System.out.println(FuncionesJUNIT.NumeroCadena("1-23-fs"));
		
		FuncionesJUNIT.listaDoble(lista);
		
		FuncionesJUNIT.listaCadena(nombres);
		
		System.out.println(FuncionesJUNIT.CompruebaTiempo(matriz));
		
		
		
	}
}
