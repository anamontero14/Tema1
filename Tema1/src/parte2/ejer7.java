package parte2;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		/*Empresa q gestiona parque acuatico
		 * Calcular importe a cobrar por entradas
		 Entradas se piden al usuario*/
		
			//establezco las constantes q no se modificaran
		
				//constante para establecer el valor de las entradas infantiles
				final double INFANTILES = 15.50;
				
				//constante para establecer el valor de las entradas de adulto
				final double ADULTO = 20;
				
				//variable para recoger el numero de entradas de adulto
				double entradasAdulto;
				
				//variable para registrar las entradas infantiles
				double entradasInfantiles = 0;
				
				//variable para la suma de las entradas
				double suma;
				
			
			//inicializo el escaner
			Scanner leer = new Scanner(System.in);
			
		//le pido la cantidad de entradas al usuario
		System.out.println("Introduzca la cantidad de entradas de adulto:");
		
			//activo la entrada de datos
			entradasAdulto = leer.nextDouble();
		
		//le pregunto al usuario cuantas entradas son infantiles
		System.out.println("¿Cuántas entradas son infantiles?");
		
			//activo la entrada de datos para que me diga el usuario cuantas entradas infantiles tiene
			entradasInfantiles = leer.nextDouble();
		
			//multiplico el numero de entradas de adulto por el valor de la constante ADULTO q es lo q cuestan ese tipo de entradas
			entradasAdulto = entradasAdulto * ADULTO;
			
			entradasInfantiles = entradasInfantiles * INFANTILES;
			
			//realizo las suma
			suma = entradasAdulto + entradasInfantiles;	
			
		//Si el importe es mayor a 100€ se le descuenta un 5%
		suma = suma > 100 ? (suma * 5) / 100 : suma * 1 ;
		
		//mostrar el resultado
		System.out.println("Debe pagar " + suma + " euros");
		
				//cierro el escaner
				leer.close();
		
	}

}
