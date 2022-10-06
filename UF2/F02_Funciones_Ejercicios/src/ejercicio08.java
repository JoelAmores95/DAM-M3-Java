import java.util.Scanner;

// 8. Nombres primers:�Demanar a l'usuari un n�mero "n" i mostrar per pantalla tots els nombres primers anteriors a "n".
// 
// Fer una funci� que donat un nombre retorni si �s primer o no, i una altra funci� que donada una "n" imprimeixi els nombres primers anteriors.
//
//

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero:");
		int num = teclado.nextInt();
		if(esNumeroPrimo(num)) {
			System.out.println(num + " es un n�mero primo.");
			System.out.println("Los n�meros primos anteriores son: ");
			numPrimosAnteriores(num);
		} else {
			System.out.println(num + " NO es un n�mero primo");
		}
		teclado.close();
	}
	
	// Funcion calcular si es n�mero primo
	/**
	 * Funci�n que entrado un n�mero muestra si es primo o no
	 * @param num
	 * @return
	 */
	public static boolean esNumeroPrimo(int num) {

		for (int i = 2; i < num; i++) {
			// Si es divisible entre algun n�mero de esos, no es primo
			if (num % i == 0) {
				return false;
			} 
		}
		// Si no se puede dividir por ninguno, es primo
		return true;
	}

	// Funcion calcular numeros primos anteriores
	public static void numPrimosAnteriores(int num) {
		
		// Bucle que vaya restando uno al n�mero introducido

		for(int i = (num-1); i >= 1; i--) {
			
			// Compruebo si ese n�mero es primo
			if(esNumeroPrimo(i)) {
				System.out.println(i);
			}
		}
		
	}

}

