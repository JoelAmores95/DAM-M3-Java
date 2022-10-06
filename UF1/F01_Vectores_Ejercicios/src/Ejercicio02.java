import java.util.Scanner;

// 1. Programa Java que llegeixi 10 nombres enters per teclat i els guardi en un array. 
// Calcula i mostra la mitjana dels nombres que estiguin en les posicions parells del array. 
//    
//    
//    💡 Considera la primera posició de l'array (posició 0) com a parell.
//    
//    
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] arrayNumeros = new int[10];
		int cantidadParesEn10Num = 6;
		
		// Pedir 10 numeros y guardarlos
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce el numero " + (i+1));
			arrayNumeros[i]= teclado.nextInt();
		}
		double media = 0;
		
		// Calcular media de los valores guardados
		for (int i = 0; i < arrayNumeros.length; i += 2) {
			
			media += arrayNumeros[i];
		}
		media = media / cantidadParesEn10Num;
		System.out.println(media);
	}

}
