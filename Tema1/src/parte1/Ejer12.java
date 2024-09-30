package parte1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		
		//con constantes
		
		//Solicitar ventas en kg
		
		//Inicializar las variables
		double ventasM;
		double ventasP;
		
		//Inicializar el escáner
		Scanner leer = new Scanner(System.in);
		
		//Pedirle valores al usuario
		System.out.println("Introduzca el número de ventas de las peras y de las manzanas\n"
				+ "respectivamente:");
		
		//Se activa el escáner para escribir
		ventasM = leer.nextDouble();
		ventasP = leer.nextDouble();
		
		//Mostrará el importe total. Precio kg manzanas 2,35€
		
		ventasM = ventasM * 2.35;
		
		// kg de peras 1,95€
		
		ventasP = ventasP * 1.95;
		
		//Resultado para el usuario
		System.out.println("Sus ventas de manzanas son "+ ventasM + " y sus ventas de peras\n"
				+ "son de " + ventasP );
		
		leer.close();
		
	}

}
