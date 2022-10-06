import java.util.Scanner;

// En un casino de jocs, es vol mostrar un missatge un cop tirats tres daus:
//    
//    Els tres daus són 6 → Excel·lent.
//    Dos daus són 6 → Molt bé.
//    Un dau és 6 → Regular.
//    Cap dau és 6 → Malament.

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dado1:");
		int dado1 = teclado.nextInt();
		System.out.println("Dado2:");
		int dado2 = teclado.nextInt();
		System.out.println("Dado3:");
		int dado3 = teclado.nextInt();
		
		// Los 3 dados son 6
		if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
			System.out.println("Excelente");
			// Ningún dado es 6
		} else if (dado1 != 6 && dado2 != 6 && dado3 != 6) {
			System.out.println("Mal");
			// Al menos 2 son 6
		} else if (dado1 == 6 && dado2 == 6
				|| dado1 == 6 && dado3 == 6 
				|| dado2 == 6 && dado3 == 6) {
			System.out.println("Muy bien");
		} else {
			System.out.println("Regular");
		}

	}

}
