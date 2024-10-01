package parte2;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		
			//variable q representa los mm q introducira el usuario
			int mm;
			
			//variable q representa los cm q introducira el usuario
			int cm;
			
			//variable q representa los m q introducira el usuario
			int m;
			
			//variable q representa la suma de las variables
			int suma;
			
			//iniciar el escaner
			Scanner leer = new Scanner(System.in);
		
				//solicitar al usuario 3 distancias
				
					//la primera, medida en milimetros
					//la segunda, medida en centimetros
					//la ultima, medida en metros
				
					System.out.println("Introduzca un número de mm, cm y m respectivamente:");
			
				//recoge el dato introducido por la entrada y lo registra en la variable mm
				mm = leer.nextInt();
				
				//recoge el dato introducido por la entrada y lo registra en la variable cm
				cm = leer.nextInt();
				
				//recoge el dato introducido por la entrada y lo registra en la variable m
				m = leer.nextInt();
			
		//Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
				
				//paso el valor de la variable mm a cm
				mm = mm / 10;
				
				//paso el valor de la variable m a cm
				m = m * 100;
		
		//hago la suma
		suma = mm + cm + m;
		
		//lo muestro por pantalla
		System.out.println("La suma de los valores es de " + suma + " cm.");
		
			//cierro el escaner
			leer.close();

	}

}
