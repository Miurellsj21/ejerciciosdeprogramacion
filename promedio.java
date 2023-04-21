package NNUMEROS;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

	      int n, sum = 0;
	      double promedio;

	      System.out.print("Ingrese la cantidad de números que desea promediar: ");
	      n = input.nextInt();

	      int numeros[] = new int[n];

	      for(int i = 0; i < n; i++) {
	         System.out.print("Ingrese el número " + (i+1) + ": ");
	         numeros[i] = input.nextInt();
	         sum += numeros[i];
	      }

	      promedio = (double) sum / n;

	      System.out.println("El promedio de los " + n + " números ingresados es: " + promedio);
		
	}

}
