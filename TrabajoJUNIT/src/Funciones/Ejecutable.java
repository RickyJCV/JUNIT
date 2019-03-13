package Funciones;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] lista = {2.0,3.0,4.0,5.0};
	/*
	 * 	String [] Nombres= {"Maximo","Antonio","Carlos","Ricardo","Francisco","Daniel","Javier",
	 * "Pablo","Lorena","Alfredo","Carlos","Juan","Carlos","Maria","Pablo","Ramon","Manu",
		"Alvaro","Luis","Daria","Jose"};
		int [][] TiempoTarea = {{100,100,100},{99,101,100},{0,0,300},{0,0,300},{0,0,300},{0,0,300}
		,{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,300},
		{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,300},{0,0,299}};
	 */
				
		System.out.println(FuncionesJUNIT.NumDiv(9));
		System.out.println(FuncionesJUNIT.Intervalo(150));
		System.out.println(FuncionesJUNIT.NumDivIntervalo(4, 150));
		System.out.println(FuncionesJUNIT.CadenasMayusVocal("Andres", "Ricardo", "Dani"));
		System.out.println(FuncionesJUNIT.NumeroCadena("1-23-fs"));
		FuncionesJUNIT.listaDoble(lista);
		//FuncionesJUNIT.CompruebaTiempo(Nombres,TiempoTarea);
			
		
		
		
	}
}
