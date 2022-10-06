import java.util.Scanner;

// Programa que digui si el nombre inserit és o no palíndrom. 

public class Ejercicio09 {

	public static void main(String[] args) {

		// Pedir numero
		System.out.println("Dime un numero y te diré si es capicúa");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		// necezito saber la lognitud del numero introducido para poder saber la longitud de la array
		String longitud = Integer.toString(numero);
		int[] arrayNumero = new int[longitud.length()];

		// Voy llenando la array
		int iNumero = numero; // Copia del numero
		int numeroReducido = numero; // Copia 2 del numero para restar
		int residuo = 0; // El numero que busco

		for (int i = 0; i < arrayNumero.length; i++) {
			iNumero = iNumero / 10;
			residuo = Math.abs(numeroReducido-(iNumero*10));
			numeroReducido = numeroReducido/10;
			
			//Guardo el numero en la posicion correcta de la array
			arrayNumero[i] = residuo; 
		}

		
		// Declaro fuera para que me sean universales
		boolean esCapicua = true;
		int iDescendente = (arrayNumero.length-1);
		
		// Solo hace falta mirar hasta la mitad, el resto ya se ha mirado
		for (int i = 0; i < arrayNumero.length/2; i++) {
			
			// Es capicua si la array leida ascendentemente es igual que descendiente
			if (arrayNumero[i] != arrayNumero[iDescendente]) {
				esCapicua = false;
			}
			iDescendente--;
		}
		if (esCapicua) {
			System.out.println("¡¡Es capicua!!");
		} else {
			System.out.println("No es capicua");
		}

	}

}
