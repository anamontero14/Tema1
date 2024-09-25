package parte1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		
		/*Poner como constante el IVA de valor 21 
		 pedirle al usuario un precio y multiplicarlo*/
		
		
			//establezco las constantes
		final double iva = 21;
		double precioSI;
		double precioCI;
		
			//inicializo el escáner
		Scanner leer = new Scanner(System.in);
		
			//le pido al usuario un precio (pudiendo este contener decimales)
		System.out.println("Introduzca a continuación el precio a añadir el IVA:");
		
			//Activo el escáner
		precioSI = leer.nextDouble();
		
			//calculo el precio del IVA y se lo asigno a otra constante
		precioCI = precioSI * (1 + iva / 100);
		
			//muestro el resultado por pantalla al usuario
		System.out.println("El precio introducido más el IVA es " + precioCI);
		
			//cierro el escáner
		leer.close();
		
	}

}
