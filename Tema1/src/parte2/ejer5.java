package parte2;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		
		//introducir una cantidad de segundos
		
			//variables
			int numSeg;
			int horas;
			int minutos;
			int minFinales;
			int seg;
			
			//escaner
			Scanner leer = new Scanner(System.in);
		
			//preguntar por valores
			System.out.println("Introduzca un número de segundos:");
			
			//entrada
			numSeg = leer.nextInt();
			
		//mostrar cuantas horas, minutos y segundos hay en el número de segundos introducidos por el usuario
		minutos = numSeg / 60;
		minFinales = minutos % 60;
		seg = numSeg % 60;
		horas = minutos / 60;
		
		//SOLUCION
		System.out.println("En " + seg + " segundos hay " + minFinales + " minutos y " + horas + " horas");
		
			//cerrar escaner
			leer.close();

	}

}
