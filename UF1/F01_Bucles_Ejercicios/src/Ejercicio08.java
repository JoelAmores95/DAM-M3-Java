// Donat un nombre enter, calcula el nombre de xifres que té.

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir el numero
		// Creo que hago trampas :P
		
//		int numero = teclado.nextInt();
//		String numeroEnString = Integer.toString(numero);
//		
//		// Como es String puedo hacer uso del .length()
//		System.out.println(numeroEnString.length());
		System.out.println("Introduce un número y te digo cuantas cifras tiene: ");
		int numero = teclado.nextInt();
		
		// Para no cambiar el número original
		int iNumero = numero;
		int cantidadCifras = 0;
		
		// Mientras se pueda dividir entre 10, tendrá una cifra más
		while (iNumero > 0) {
			iNumero = iNumero / 10;
			cantidadCifras++;
		}
		System.out.println(numero + " tiene " + cantidadCifras +" cifras.");
	}

}
