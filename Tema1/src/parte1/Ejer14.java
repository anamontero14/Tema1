package parte1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		//Pedir notas del 1º, 2º y 3º trimestre ENTERAS
		//Mostrar la parte entera de la nota media
		//Mostrar con decimales la media
		
			//inicializo todas las variables que voy a utilizar
			
		double primer;
		double segun;
		double tercer;
		int boletin;
		double expediente;
		
		
			//inicializo el escáner
		Scanner leer = new Scanner(System.in);
		
			//le pido al usuario las notas
		System.out.println("Por favor, introduzca a continuación las notas que obtuvo en el 1º, 2º y 3º\n"
				+ "trimestre respectivamente:");
		
			//activo la entrada de consola para que el usuario pueda escribir
		primer = leer.nextDouble();
		segun = leer.nextDouble();
		tercer = leer.nextDouble();
		
			/*lo que hago ahora es asignarle un valor a la variable "boletin", como quiero que en el boletin
			 se muestre SOLO la parte entera y dependiendo de las notas que se introduzcan me puede salir un
			 número real pues pongo delante "(int)" para que el programa sepa que solo ha de coger la parte
			 entera de la media
			 */
		boletin = (int) (primer + segun + tercer) / 3;
		
			/*en cambio en el expediente sí se quiere que aparezcan las notas con decimales así que lo dejo
			 así*/
		expediente = (primer + segun + tercer) / 3;
		
			//por último le muestro al usuario por pantalla las notas
		System.out.println("Su nota en el boletín de notas es un " + boletin);
		
		System.out.println("Su nota en el expediente es un " + expediente);
		
			//cierro el escáner
		leer.close();
	}

}
