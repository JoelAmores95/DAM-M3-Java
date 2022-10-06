import java.util.Scanner;

public class bucles {

	public static void main(String[] args) {
		// Una estructura iterativa nos permite repetir instrucciones MIENTRAS se cumpla una condición
		
		// SINTAXIS
		
		// while (condicion) {
		// 	instrucciones
		// }
		
		// Para que no haya un bucle infinito tiene que haber una instrucción que haga que se deje de cumplir la condición
		
		// Programa que cuenta hasta 10
//		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		// ...
		
		int n = 1;
		while (n <= 10) {
			System.out.println(n);
			n++; // Suma de uno en uno
		}
		
		// Escribir un programa que solicite ingresar 10 notas
		// de alumnos y nos informe cuantos son mayores o iguales
		// a 7 y cuantos menores.
		
		Scanner teclado = new Scanner(System.in);
		
		// Necesito contadores para saber cuántas notas llevo
		// y cuantas notas son mayores y menores a 7
		
		int alumnos = 10;
		int notasIntroducidas = 1;
		int notaMayorA7 = 0;
		int notaMenorA7 = 0;
		
		
		while (notasIntroducidas < alumnos ) {
			System.out.println("introduce la nota "+ notasIntroducidas);
			double notaN = teclado.nextInt();
			
			if (notaN >= 7) {
				notaMayorA7++;
			} else {	
				notaMenorA7++;
			}
			notasIntroducidas++;
		}
		System.out.println("Notas superiores o iguales a 7: " + notaMayorA7 + "\nNotas inferiores a 7: "+ notaMenorA7);
	}
	
	// Bucles FOR
	
	// Cuando sabemos previamente la cantidad de ciclos que hará
	
	// SINTAXIS
	//
	// for (int i = 0; i < 10; i++) {
	//		instrucciones
	// }
	
	// Contar hasta 10
	
	// INICIALIZACION
	// int i = 1;
	// CONDICION
	// while (i<=10) {
	// 		syso
	// CAMBIO
	// 		i++;
	
	// Con el FOR:
	// for (int i = 1; i<=10; i++) {
	// 		syso
	// }
	
	

}
