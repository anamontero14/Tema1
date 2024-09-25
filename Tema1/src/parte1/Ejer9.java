package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		
		//Inicializo las variables
		String nombre;
		int edad;
		boolean over18;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca a continuación su nombre y su edad:");
		
		nombre = leer.nextLine();
		
		edad = leer.nextInt();
		
		over18 = edad >= 18;
		
		System.out.println(over18);
		
	}

}
