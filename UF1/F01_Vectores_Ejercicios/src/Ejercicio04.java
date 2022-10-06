import java.util.Scanner;

// 2. Programa que ompli un array amb 10 nombres enters que es llegeixen per teclat. 
// A continuació calcula i mostra la mitjana dels valors positius i la dels valors negatius de l'array.

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] arrayNumeros = new int[10];

		double mediaPositivos = 0 ;
		int contadorPositivos = 0;

		double mediaNegativos = 0;
		int contadorNegativos = 0;

		// Llenar array
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce el numero " + (i+1));
			arrayNumeros[i]= teclado.nextInt();
		}

		// Mirar valor positivo/negativo
		for (int i = 0; i < arrayNumeros.length; i++) {

			// Caso 1: es positivo
			if (arrayNumeros[i] >= 0) {
				mediaPositivos += arrayNumeros[i];
				contadorPositivos++;
			} else {
				// Caso 2: es negativo
				mediaNegativos += arrayNumeros[i];
				contadorNegativos++;
			}
		}
		// Calcular media
		if(contadorNegativos==0) {
			System.out.println("No hay negativos");
		} else {
			mediaNegativos = mediaNegativos/contadorNegativos;
		}
		if (contadorPositivos==0) {
			System.out.println("No hay positivos");
		} else {
			mediaPositivos =  mediaPositivos/contadorPositivos;
		}

		// Mostrar medias
		System.out.println("Media Positivos: " + mediaPositivos);
		System.out.println("Media negativos: " + mediaNegativos);
	}

}
