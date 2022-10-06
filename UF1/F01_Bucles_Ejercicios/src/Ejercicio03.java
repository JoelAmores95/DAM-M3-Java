import java.util.Scanner;

// 1. Donats dos nombres enters positius n1 i n2 amb n1 < n2, 
// escriu tots els nombres enters que són múltiples de n1 més petits o iguals a n2 en ordre creixent.

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce valor n1: ");
		int n1 = teclado.nextInt();
		System.out.println("Introduce valor n2: (mayor al de antes)");
		int n2 = teclado.nextInt();

		int multiplicador = 0 ;
		
		while (n1 * multiplicador <= n2) {
			if (n1 <= 0) {
				System.out.println("No es válido");
				break;
			}
			System.out.println(n1 * multiplicador);
			multiplicador++;
			
		}
	}

}
