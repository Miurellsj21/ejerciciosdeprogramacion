package NUMEROPRIMO;

import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);

	      int numero;

	      System.out.print("Ingrese un número entero positivo: ");
	      numero = input.nextInt();

	      // Verificar si el número es primo
	      boolean esPrimo = true;
	      for(int i = 2; i < numero; i++) {
	         if(numero % i == 0) {
	            esPrimo = false;
	            break;
	         }
	      }

	      if(esPrimo) {
	         System.out.println(numero + " es un número primo.");
	      } else {
	         System.out.println(numero + " no es un número primo.");
	      }
		
		
		
		
		
		
		
	}

}
