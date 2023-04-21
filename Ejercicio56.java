package ejercicio56;

import java.util.Scanner;

public class Ejercicio56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int[] numeros = new int[20];
	    
	    for (int i = 0; i < 20; i++) {
	      System.out.print("Ingrese un número: ");
	      numeros[i] = sc.nextInt();
	    }

	    System.out.print("Los números múltiplos de 3 son: ");

	    for (int i = 0; i < 20; i++) {
	      if (numeros[i] % 3 == 0) {
	        System.out.print(numeros[i] + " ");
	      }
	    }
	}

}
