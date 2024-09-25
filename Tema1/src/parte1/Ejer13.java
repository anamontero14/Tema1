package parte1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		/*
			Diseñar un algoritmo que nos indique si podemos salir a la calle. 
		
		Existen aspectos que influirán en esta decisión: solo podremos salir a la 
		calle si no está lloviendo y hemos finalizado nuestras tareas. 
		
		Existe una opción en la que, indistintamente de lo anterior, podremos salir 
		a la calle: el hecho de tener que ir a la biblioteca.
		
		
		Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado 
		las tareas y si necesita ir a la biblioteca.
		
		
		El algoritmo debe mostrar mediante un booleano (true o false) si es posible 
		que se le otorgue permiso para salir a la calle.
		 */
		
			//inicializo las variables que voy a usar
		boolean lluvia;
		boolean deberes;
		boolean biblioteca;
		boolean puede;
		boolean puede2;
		
			//inicializo el escáner
		Scanner leer = new Scanner(System.in);
		
			//Está lloviendo?
		
		System.out.println("¿Está lloviendo? (true o false)");
		
			//se deja al usuario que escriba
		lluvia = leer.nextBoolean();

			//Has acabado los deberes?
		
			//le pregunto si ha acabado los deberes
		System.out.println("¿Has acabado los deberes? (true o false)");
		
			//entrada de consola
		deberes = leer.nextBoolean();
			
			//Vas a la biblioteca?
		System.out.println("¿Vas a ir a la biblioteca? (true false)");
		
			//entrada de consola
		biblioteca = leer.nextBoolean();

			//si está lloviendo no podrá salir a no ser de que vaya a la biblioteca
		puede = lluvia == false && deberes == true ? true : false;
		
		System.out.println(puede || biblioteca);
		
		leer.close();
	}

}
