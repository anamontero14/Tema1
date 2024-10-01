package parte2;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		
				//se mide en metros
				//el ranking solo tiene en cuenta la distancia en cm SIN DECIMALES
				//Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm
		
		//variable q registra la longitud en m
		double longitudM;
		
		//variable para registrar la longitud en metros PERO convertida a CENTIMETROS
		double longitudCM;
		
		//iniciar el escaner
		Scanner leer = new Scanner(System.in);
		
				//solicitar longitud en metros y que muestre solo la parte entera y en cm
		System.out.println("Introduzca la longitud en metros:");
		
			//inicio la entrada de datos para que me diga la longitud y lo q introduzca se asignara a la variable longitudM
			longitudM = leer.nextDouble();
		
		longitudCM = (int)longitudM * 100;
			
		//cierro el escaner
		leer.close();
		

	}

}
