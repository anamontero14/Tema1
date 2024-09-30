package parte2;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		//dado este polinomio: y=ax2+bx+c
		/*Crea un programa que pida los coeficientes a, b y c,
		así como el valor de x, y calcula el valor correspondiente de y.*/
		
			//pedir variables
		int a;
		int b;
		int c;
		int x;
		int y;
			
			//escaner
			Scanner leer = new Scanner(System.in);
			
		//pedirlos
		System.out.println("Introduzca los valores de a, b, c y x respectivamente:");
		
			//entrada
			a = leer.nextInt();
			b = leer.nextInt();
			c = leer.nextInt();
			x = leer.nextInt();
		
		//y=ax2+bx+c
		y = a * (x * x) + b * x  + c;
		
		System.out.println(y);
		
			//cerrar escaner
			leer.close();

	}

}
