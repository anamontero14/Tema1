package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		//inicializo las variables
		String nombre;
		String direc;
		int tel;
		
		Scanner leer = new Scanner(System.in);
		
		//1º Pedir nombre
		System.out.println("Por favor, introduzca su nombre a continuación: ");
		
			//le indico que lo que el usuario introduzca será el nuevo valor de la variable
		nombre = leer.nextLine();
		
		//2º Pedir dirección
		System.out.println("Por favor, introduzca su dirección a continuación: ");
		
			//le indico que lo que el usuario introduzca a continuación será el valor de la variable
		direc = leer.nextLine();
		
		//3º Pedir número
		System.out.println("Por favor, introduzca su número de teléfono a continuación: ");
		
			//le indico que lo que el usuario introduzca a continuación será el valor de la variable
		tel = leer.nextInt();
		
		
		/*Mostrar los números así:
		 *	Nombre: Elena
			Dirección: Calle Inventada
			Teléfono: 987654321			*/
		
		System.out.println("Sus datos son:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direc);
		System.out.println("Teléfono: " + tel);
		
			//cierro el escáner
		leer.close();
		
	}

}
