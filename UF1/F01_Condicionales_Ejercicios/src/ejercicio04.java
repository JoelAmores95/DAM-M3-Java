import java.util.Scanner;

// Escriu un programa que demani un número 
// i digui a quin dia de la setmana correspon (1-dilluns, 2-dimarts..).

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número (1-7):");
		int numero = teclado.nextInt();
		if (numero <= 0) {
			System.out.println("No me sirve ese numero, solo del 1 al 7.");
		} else {
			if (numero == 1) {
				System.out.println("Es lunes.");
			} else {
				if (numero == 2) {
					System.out.println("Es martes.");
				} else {
					if (numero == 3) {
						System.out.println("Es miércoles.");
					} else {
						if (numero == 4 ) {
							System.out.println("Es jueves.");
						} else {
							if (numero == 5) {
								System.out.println("Es viernes.");
							} else {
								if (numero == 6) {
									System.out.println("Es sábado.");
								} else {
									if (numero == 7) {
										System.out.println("Es domingo.");
									} else {
										if (numero > 7) {
											System.out.println("No me sirve, solo del 1 al 7.");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}