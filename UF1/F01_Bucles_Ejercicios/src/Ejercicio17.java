import java.util.Scanner;

//1. Fer un programa que triï a l'atzar un número entre 0 i 100 
//    
//    
//    💡 Podeu buscar a Google, com obtenir un nombre aleatori en Java.
//    
//   
//    
//    Un cop el tingui anirà demanant valors a l'usuari i li donarà pistes si el número és major o menor, fins que l'usuari encerti el número o es cansi, 
//	  per això li preguntarem si vol seguir concursant cada vegada que falli.


public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double numeroCreado = Math.random()*100;
		System.out.println("Vamos a jugar a un juego, elijo un número del 0 al 100 y tienes que adivinarlo.\n¿Te animas?\nDime un numero: ");
		int miNumero = teclado.nextInt();
		// Recoloco el cursor al inicio
		teclado.nextLine();
		boolean continuar = true;
		// Guardo aqui si quiere continuar o no
		String sino;

		// Mientras el número no sea el mismo y quiera continuar

		while (miNumero != (int)numeroCreado && continuar) {

			System.out.println("Ese no es, quieres probar otra vez? (S/N)");
			sino = teclado.nextLine();
			if (sino.equalsIgnoreCase("s")){
				
				System.out.println("Introduce un numero: ");
				miNumero = teclado.nextInt();
				teclado.nextLine();
			} else {
				
				continuar = false;
			}
		}
		if (!continuar) {
			System.out.println("Te has rendido");
		} else {
			System.out.println("¡¡HAS ACERTADO!!");
		}
	}

}
