package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
			
		/*
		Escribir un programa que pida un número 
		al usuario e indique mediante un literal booleano (true o false) si el número es par
		*/
		
		int num;
		int cuenta;
		boolean par;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		
		num = leer.nextInt();
		
		cuenta = num % 2;
		
		par = cuenta == 0;
		
		System.out.println(par);
		
	}

}
