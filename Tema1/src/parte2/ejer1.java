package parte2;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		/*Realizar un programa que pida como entrada un número con decimales
		 * y lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())*/
		
		//crear las variables
		double num;
		double redondeo;
		
			//crear escáner
			Scanner leer = new Scanner(System.in);
		
		//pedirle el número al usuario
		System.out.println("Introduzca un número con decimales para redondear:");
		
			//entrada
			num = leer.nextDouble();
		
		//redondearlo al entero más próximo son Math.round()
		redondeo = num + 0.5;
		
		//mostrarlo
		System.out.println((int) redondeo);
		
			//cerrar escáner
			leer.close();
		
	}

}
