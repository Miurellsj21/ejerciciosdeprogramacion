package SUMA;

import java.util.Scanner;

public class SUMADENUMERO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

	      int numero, suma = 0, digito;

	      System.out.print("Ingrese un número entero positivo: ");
	      numero = input.nextInt();

	      while(numero > 0) {
	         digito = numero % 10;
	         suma += digito;
	         numero /= 10;
	      }

	      System.out.println("La suma de los dígitos del número ingresado es: " + suma);
	}

}
