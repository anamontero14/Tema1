package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		/*Escribe un programa que pida al usuario su nombre y su edad y 
		 * muestre por pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”.*/
		
		String nombre;
		int edad;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre y a continuación su edad:");
		
		nombre = leer.nextLine();
		
		edad = leer.nextInt();
		
		System.out.println("Hola " + nombre + "tienes ");
	}

}
