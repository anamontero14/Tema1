package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
			
		/*Escribir un programa que le pida dos números al usuario. 
		 * A continuación, debe mostrar la suma, la resta, la multiplicación y la división
		 * de ambos números. Debe mostrarse el resultado de cada operación en una línea distinta.*/
		
		
			//inicializo las variables
		
		double num1;
		
		double num2;
		
		double suma;
		
		double resta;
		
		double multi;
		
		double div;
		
		Scanner leer = new Scanner(System.in);
		
		//1º Pedir número al usuario
		System.out.println("Introduzca un número:");
		
		num1 = leer.nextDouble();
		
		//2º Pedir otro número al usuario
		System.out.println("Introduzca otro número:");
		
		num2 = leer.nextDouble();
		
		//3º Suma, resta, multi, divi de los números
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
	
		//4º Resultado en diferente línea
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La resta de los números es: " + resta);
		System.out.println("La multiplicación de los números es: " + multi);
		System.out.println("La división de los números es: " + div);
		
		//cierro el escáner
		leer.close();
	}

}
