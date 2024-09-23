package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		//activo la variable que hará referencia al año actual
		int añoActual;
		
		//activo la variable que hará referencia al año de nacimiento
		int añoNacimiento;
		
		//activo la variable que hará referencia al año actual
		int edad;
		
		//activo el escáner
		Scanner leer = new Scanner(System.in);
		
		//1º Pedirle al usuario que introduzca el año actual
		System.out.println("Introduzca el año actual:");
		
		//El usuario introduce el año actual
		añoActual = leer.nextInt();
		
		//2º Pedirle al usuario que introduzca su año de nacimiento
		System.out.println("Introduzca su año de nacimiento:");
		
		//El usuario introduce su año de nacimiento
		añoNacimiento = leer.nextInt();
		
		//cierro el escáner
		leer.close();
		
		//3º Calcular su edad actual
		edad = añoActual - añoNacimiento;
		
		//le muestro el resultado
		System.out.println("Su edad actual es " + edad);
		
	}

}
