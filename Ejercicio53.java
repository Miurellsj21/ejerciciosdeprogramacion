package ejercicio53;

import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 // este programa lee 20 números desde el teclado y averigua la suma de los números pares e impares
		 int Sumpares = 0;
	        int Sumimpares = 0;

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Ingrese un número: ");
	            int number = sc.nextInt();
	            
	            if (number % 2 == 0) {
	                Sumpares += number;
	            } else {
	                Sumimpares += number;
	            }
	        }

	        System.out.println("La suma de los números pares es: " + Sumpares);
	        System.out.println("La suma de los números impares es: " + Sumimpares);

		
		
	}

}
