import java.util.Scanner;

// 		Calcular per n alumnes la nota final de M3 (caldrà demanar a l'usuari quants alumnes). A cada alumne se li pregunta la nota de cada UF. 
//		Nota final = (notaUF1 * 0,4) + (notaUF2 * 0,35) + (notaUF3 * 0,25)
//		A més cal indicar quants alumnes han superat alguna UF amb nota més gran que 8 i quants amb nota més gran que 5 i més petita que 6 (5-6).

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir alumnos
		System.out.println("¿Cuántos alumnos?");
		int numAlumnos = teclado.nextInt();
		
		int contadorAlumnos = 0;
		double notaUF1;
		double notaUF2;
		double notaUF3;
		double notaFinal;
		int notaMayorA8 = 0;
		int notaEntre5y6 = 0;
		
		// Inicio bucle
		while (contadorAlumnos < numAlumnos&& numAlumnos!=0) {
			contadorAlumnos++;
			
			// Pedir nota UF1
			System.out.println("Introduce la nota de la UF1 del alumno " + contadorAlumnos);
			notaUF1= teclado.nextDouble();
			// Pedir nota UF2
			System.out.println("Introduce la nota de la UF2 del alumno " + contadorAlumnos);
			notaUF2= teclado.nextDouble();
			// Pedir nota UF3
			System.out.println("Introduce la nota de la UF3 del alumno " + contadorAlumnos);
			notaUF3= teclado.nextDouble();
			
			notaFinal = (notaUF1 * 0.4) + (notaUF2 * 0.35) + (notaUF3 * 0.25);
			// Comprobar si la nota es mayor a 8
			if (notaFinal > 8) {
				notaMayorA8++;
				// Comprobar si la nota esta entre 5 y 6
			} else if(notaFinal > 5 && notaFinal < 6) {
				notaEntre5y6++;
			}
			System.out.println("Nota final del alumno " + contadorAlumnos + ": " + notaFinal +"\n");
		}
		System.out.println("Aprobados con nota mayor a 8: " + notaMayorA8);
		System.out.println("Aprobados con nota entre 5 y 6: " + notaEntre5y6);
		
	}

}
