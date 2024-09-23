package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		//CREAR MEDIA ARITMÉTICA DE DOS NOTAS
		
		
		//activar la primera variable
		double nota1;
		
		//activar la segunda variable
		double nota2;
		
		double resultado;
		
		//activar el escáner
		Scanner leer = new Scanner(System.in);

		//1º Introducir una nota
		System.out.println("Introduzca una nota para la media");
		
		nota1 = leer.nextDouble();
		
		
		//2º Introducir otra nota
		System.out.println("Introduzca otra nota para la media");
		
		nota2 = leer.nextDouble();
		
		//se cierra el escáner
		leer.close();
		
		//3º Hacer la media
		resultado = (nota1 + nota2) / 2;
		
		//se muestra el resultado
		System.out.println("El resultado de la media es " + resultado);
		
	}

}
