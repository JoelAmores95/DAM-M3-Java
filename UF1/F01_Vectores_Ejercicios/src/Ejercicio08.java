import java.util.Scanner;

// Donat un vector de N posicions i un nombre, comprovar si aquest nombre apareix al vector o no. 
// Al final del programa s'ha de dir si apareix o no apareix.

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir longitud ARRAY
		System.out.println("¿Cuántos números va a tener el vector?");
		int longitudArray = teclado.nextInt();
		// Crear ARRAY
		int[] arrayNumeros = new int[longitudArray];
		// Llenar array
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Numero " + (i+1));
			arrayNumeros[i] = teclado.nextInt();
		}
		// Buscar número
		System.out.println("Número a buscar: ");
		int numeroBuscado = teclado.nextInt();
		
		// Recorro la ARRAY
		int contador=0;
		int existe = 0;
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i]==numeroBuscado) {
				existe ++;
			}
		}
		// Muestro mensaje de aparece o no
		if (existe>=1) {
			System.out.println("Aparece");
		} else {
			System.out.println("No aparece");
		}
		// Modo PRO
//		System.out.println("El numero " + numeroBuscado + (existe? " existe" : " no existe"));
		
	}

}
