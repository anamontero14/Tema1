package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		//se puede introducir un número por el teclado
		Scanner sc = new Scanner(System.in);
		
		//declaramos la variable num
		int num;
		
		//le pido que introduzca un número
		System.out.println("Introduzca cualquier número a continuación: ");
		
		//se queda esperando a que introduzcamos algo por el teclado
		num = sc.nextInt();
		
		//se guarda el valor
		
		
		//ahora se muestra la cadena y con el + la uno con la variable num 
		System.out.println("El número introducido es " + num);
		
		//se cierra el escaner
		sc.close();

	}

}
