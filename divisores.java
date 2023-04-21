package NUMEROS;

import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Escribir un programa para averiguar todos los divisores de un número digitado por el usuario
		
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero positivo: ");
	        int num = scanner.nextInt();

	        System.out.print("Los divisores de " + num + " son: ");

	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	            }
		
		
	        }

	}

}
