package ejercicio52;

import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
			int positivo = 0;
			int negativo = 0;
			int cero = 0;

			for (int i = 0; i < 20; i++) {
			    System.out.print("Ingrese un número: ");
			    int number = sc.nextInt();
			    
			    if (number > 0) {
			        positivo++;
			    } else if (number < 0) {
			        negativo++;
			    } else {
			        cero++;
			    }
			}
			
  
			System.out.println("Cantidad de números positivos: " + positivo);
			System.out.println("Cantidad de números negativos: " + negativo);
			System.out.println("Cantidad de ceros: " + cero);
		
		 
 
		        
		    }
		}

