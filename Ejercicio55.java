package ejercicio55;

import java.util.Scanner;

public class Ejercicio55 {

	public static void main(String[] args) {
		
		//Hacer un programa que registre 20 números en un array de una dimensión y muestre 
		//posteriormente los elementos que ocupan posiciones impares.
		
		        // Creamos un array vacío de tamaño 20
		  // Crear un array de una dimensión vacío
        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese 20 números y agregarlos al array
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los numeros que ocupan posiciones impares
        
        System.out.println("Numeros en posiciones impares:");
        for (int i = 1; i < 20; i++) {
        	if (i % 2 != 0) {
            System.out.println(numeros[i]);
        	}
        }
		  
        
		 

		
		
		
		
		
		
		
		
	}

}
