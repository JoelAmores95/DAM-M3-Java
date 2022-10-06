import java.util.Scanner;

// 8. Nombres primers: Demanar a l'usuari un número "n" i mostrar per pantalla tots els nombres primers anteriors a "n".
// 
// Fer una funció que donat un nombre retorni si és primer o no, i una altra funció que donada una "n" imprimeixi els nombres primers anteriors.
//
//

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = teclado.nextInt();
		if(esNumeroPrimo(num)) {
			System.out.println(num + " es un número primo.");
			System.out.println("Los números primos anteriores son: ");
			numPrimosAnteriores(num);
		} else {
			System.out.println(num + " NO es un número primo");
		}
		teclado.close();
	}
	
	// Funcion calcular si es número primo
	/**
	 * Función que entrado un número muestra si es primo o no
	 * @param num
	 * @return
	 */
	public static boolean esNumeroPrimo(int num) {

		for (int i = 2; i < num; i++) {
			// Si es divisible entre algun número de esos, no es primo
			if (num % i == 0) {
				return false;
			} 
		}
		// Si no se puede dividir por ninguno, es primo
		return true;
	}

	// Funcion calcular numeros primos anteriores
	public static void numPrimosAnteriores(int num) {
		
		// Bucle que vaya restando uno al número introducido

		for(int i = (num-1); i >= 1; i--) {
			
			// Compruebo si ese número es primo
			if(esNumeroPrimo(i)) {
				System.out.println(i);
			}
		}
		
	}

}

