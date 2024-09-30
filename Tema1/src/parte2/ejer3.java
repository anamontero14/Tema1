package parte2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		//pedir número entero
				int num;
				int diferencia;
				int redondeo;
				
					//escaner
					Scanner leer = new Scanner(System.in);
				
					//que el usuario introduzca un numero
					System.out.println("Introduzca un número entero:");
					
					//entrada
					num = leer.nextInt();
					
				//indicar la cantidad que hay que sumarle para que sea multiplo de 7 (usar %)
				diferencia = 2 - (num%2);
				redondeo = diferencia == 2 ? 0 : diferencia;
				
					//mostrarlo
					System.out.println(redondeo);
				
					//cerrar escáner
					leer.close();

	}

}
