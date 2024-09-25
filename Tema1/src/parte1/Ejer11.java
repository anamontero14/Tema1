package parte1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		/* Realiza un conversor de pesetas a euros. Para ello, pídele al usuario
		 * que te introduzca el valor en pesetas y, a posteriori, debes mostrarle
		 * el resultado de la conversión.(1€ = 166 ptas) */
	
		int pesetas;
		int conversion;
		
		Scanner leer = new Scanner(System.in);
		
		
			//1º Pedir al usuario el número de pesetas a convertir
		
		System.out.println("Introduzca el número de pesetas a convertir:");
		
		pesetas = leer.nextInt();
		
		conversion = (int) (pesetas / 166.386); 
		
			//2º Mostrarle el resultado de la conversión
		
		System.out.println(pesetas + " son " + conversion + " euros.");
			
		leer.close();

	}

}
