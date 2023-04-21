package DIMENCIONDE5;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	      int[] numeros = new int[20];

	      // Pedir al usuario que ingrese los 20 números
	      for(int i = 0; i < 20; i++) {
	         System.out.print("Ingrese el número " + (i+1) + ": ");
	         numeros[i] = input.nextInt();
	      }

	      System.out.print("Los números múltiplos de cinco son: ");
	      // Recorrer el arreglo y mostrar los números múltiplos de cinco
	      for(int i = 0; i < 20; i++) {
	         if(numeros[i] % 5 == 0) {
	            System.out.print(numeros[i] + " ");
	            
	         }
	}
	}
}
