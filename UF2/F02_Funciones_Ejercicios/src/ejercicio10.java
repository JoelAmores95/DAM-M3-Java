import java.util.Scanner;

// 2. **Conversió:** Demanar a l'usuari una quantitat de diners i amb quina moneda (euros o dòlars). 
// Fer una funció per tal que el programa digui l'equivalent amb la moneda contrària

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Quieres poner euro? (S/N)");
		String moneda = teclado.nextLine();
		boolean esEuro = false;

		if(moneda.equalsIgnoreCase("S")) {
			esEuro = true;
		} 

		System.out.println("¿Qué valor quieres cambiar?");
		int valor = teclado.nextInt();

		System.out.print("El equivalente es ");
		cambioDivisa(esEuro, valor);

	}

	// 1. Función cambio divisa
	
	
	/**
	 * Función que introducida una variable de control de si es euro o no,
	 * da un equivalente en USD/€ según la moneda introducida.
	 * @param esEuro
	 * @param valor
	 */
	
	public static void cambioDivisa(boolean esEuro, int valor) {
		if(esEuro) {
			System.out.println((valor * 1.18));
		} else {
			System.out.println(valor / 1.18);
		}
	}
}
