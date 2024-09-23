package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		//activo el escáner
		Scanner sc = new Scanner(System.in);
		
		//inicio la variable
		int edad;
		
		//hago la variable del siguiente año
		int edadSiguiente;
		
		
		//le digo al usuario lo que tiene que hacer mostrándoselo por pantalla
		System.out.println("Introduzca a continuación su edad para saber cuántos "
				+ "años tendrá el año que viene");
		
		
		//el usuario introduce algo por la consola
		edad = sc.nextInt();
		
		//se cierra el escáner
		sc.close();
		
		/*a la variable edadSiguiente le he asignado el valor de la variable
		 edad + un 1 que sería la edad del siguiente año*/
		edadSiguiente = edad += 1;
		
		//le enseño al usuario el resultado
		System.out.println("La edad que usted tendrá el año que viene será " + edadSiguiente);
		
		
	}

}
