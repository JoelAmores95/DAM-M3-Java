import java.util.Scanner;

// Escriu un programa que demani dia, mes i any, i digui si la data �s correcta. 
// S'ha de tenir en compte els dies de cada mes i si l'any �s de trasp�s.

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir dia, mes y a�o
		System.out.println("Dime el dia: (1-31)");
		int dia = teclado.nextInt();
		System.out.println("Dime el mes: (1-12)");
		int mes = teclado.nextInt();
		System.out.println("Dime el a�o: ");
		int anyo = teclado.nextInt();

		// Comprobar si el dia es correcto
		System.out.println("La fecha introducida es: " + dia + " / " + mes + " / "+ anyo);

		// Si es febrero:
		if (mes == 2) {
			if (dia == 29) {
				// Miro si el a�o es divisible por 4
				if (anyo % 4 == 0) {
					// Es divisible por 4
					if (anyo % 100 == 0) {
						// Es divisible por 4 y por 100
						if (anyo % 400 == 0){
							// Es divisible por 4, por 100 y por 400
							System.out.println("Es un a�o bisiesto, la fecha es correcta.");
						} else {
							// Es divisible por 4, por 100 pero no por 400
							System.out.println("No es un a�o bisiesto, la fecha  no es correcta.");
						}
						// Es divisible por 4 pero no por 100
					} else {
						System.out.println("Es un a�o bisiesto, la fecha es correcta.");
					}
					// No es divisible por 4
				} else {
					System.out.println("No es un a�o bisiesto, la fecha no es correcta.");
				}	

				// Febrero tiene m�s de 29 dias
			} else if (dia > 29 || dia < 1) {
				System.out.println("No es correcto");
			} else {

				// Febrero esta dentro de los m�rgenes
				System.out.println("Es correcto");
			}
			// No es febrero, caso 1: meses con 31 dias
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

			// Est� fuera de l�mites
			if (dia > 31 || dia < 1) {
				System.out.println("No es correcto");
			} else {
				// Est� dentro de los l�mites
				System.out.println("Es correcto");
			}
			// Ultimo caso: Meses con 30 d�as
		} else {
			if (dia > 30 || dia < 1) {
				System.out.println("No es correcto");
			} else {
				System.out.println("Es correcto");
			}
		}
		teclado.close();
	}
}
