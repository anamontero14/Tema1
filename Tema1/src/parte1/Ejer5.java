package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		//Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
		//Para ello, el usuario debe introducir el radio, que puede contener decimales.
		//Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)
		
		double radio;
		
		double pi = Math.PI;
		
		double longitud;
		
		double diam;
		
		double area;
		
		Scanner leer = new Scanner(System.in);

		//1º Introducir el radio
		System.out.println("Introduzca el valor del radio:");
		
		radio = leer.nextDouble();
		
		//2º Longitud
		
		diam = 2 * radio;
		
		longitud = diam * pi;
		
		System.out.println("La longitud de la circunferencia es de " + longitud);
		
		//3º Área
		
		area = pi * (radio * radio);
		
		System.out.println("El área de la circunferencia es de " + area);
		
	}

}
