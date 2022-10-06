import java.util.Scanner;

// 1. Programa per llegir l'al�ada de N persones i calcular l'al�ada mitjana. Calcular quantes persones tenen una al�ada superior a la mitjana 
// i quantes tenen una al�ada inferior a la mitjana. 
//    
//    
//     El valor de N es demana per teclat i ha de ser enter positiu.
//    
//    
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime cuantas personas: ");
		int numPersonas = teclado.nextInt();
		
		// Creo la array con la variable que indica cantidad
		int [] arrayAlturas = new int [numPersonas];
		
		// Pido alturas
		for (int i = 0; i < arrayAlturas.length; i++) {
			System.out.println("Altura persona numero " + (i+1));
			arrayAlturas[i] = teclado.nextInt();
		}
		
		// Calculo media de alturas
		double media = 0;
		for (int i = 0; i < arrayAlturas.length; i++) {
			media += arrayAlturas[i];
		}
		media = media / arrayAlturas.length;
		System.out.println(media);
		
		// Calcular si estan por debajo o por encima de la media
		for (int i = 0; i < arrayAlturas.length; i++) {
			if (i < media) {
				System.out.println(arrayAlturas[i] +" est� por debajo de la media");
			} else if (i == media) {
				System.out.println(arrayAlturas[i] + " est� justo en la media");
			} else {
				System.out.println(arrayAlturas[i] + " est� por encima de la media");
			}
		}

	}

}
