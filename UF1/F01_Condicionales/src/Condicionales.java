import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

		//	CONDICIONAL SIMPLE : 
		//	Si se cumple una condicion, se ejecuta, si no no.

		// SINTAXIS
		// if (Condición) {
		// 		(instrucciones a ejecutar si se cumple la condición)
		// 	}

		// OPERADORES RELACIONALES
		// Compara entre dos valores
		// > - Mayor que
		// > - Menor que
		// >= - Mayor o igual que
		// >= - Menor o igual que
		// == - Igual que
		// != - Diferente que

		// SIEMPRE dan resultado VERDADERO o FALSO (variables BOOLEANAS)

		// EJEMPLO:
		// Pide el sueldo de una persona. 
		// Si supera los 3000, muestra un mensaje que informa que debe pagar

		// Pedir sueldo
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sueldo: ");
		double sueldo = teclado.nextDouble();

		// Si es superior a 3000, mostrar mensaje de pagar impuestos
		if (sueldo > 3000) {
			System.out.println("Debes pagar.");
		}

		// CONDICIONAL COMPUESTO (v.1)

		// Si no se cumple la condición se ejecutan otras instrucciones

		// SINTAXIS

		// if (condicion) {
		// 		instrucciones a ejecutar si se cumple la condicion
		// } else {
		//		instrucciones si no se cumplen
		// }

		// EJEMPLO: Mostrar si un alumno aprueba o suspende

		// Pedir nota
		System.out.println("Nota: "); //usar syso + CRTL + espacio para autocompletar 
		double nota = teclado.nextDouble();

		// Mostrar si se aprueba o no
		if (nota > 5) {
			System.out.println("¡¡HAS APROBADOOOO!! - v.1");
		} else {
			System.out.println("Hay que mejorar - v.1");
		}

		// CONDICIONALES ANIDADOS (v.2)

		// Dentro de cualquier rama de condicion, pueden aparecer nuevas condiciones

		// EJEMPLO: Mostrar si aprueba y si tiene notable o no

		// Miramos si aprueba
		if (nota>5) {

			//Miramos si tiene 7 o más

			if (nota>=7) {
				System.out.println("¡¡¡Has aprobado con un notable o más!!! - v.2");
				// Si no llega al 7
			} else {
				System.out.println("¡¡Has aprobado!!- v.2");
			}
		} else {
			System.out.println("Pos no llegas al 5 - v2");
		}

		// CONDICIONAL ANIDADO "MEJORADO" if-else if-else

		// SINTAXIS

		// if (condicion 1) {
		// 		instrucciones a ejecutar si se cumple la condicion 1
		// } else if (condicion 2){
		//		instrucciones si NO se cumple la condicion 1
		// } else {
		// 		instrucciones si NO se cumple NINGUNA condicion
		// }

		// EJEMPLO: Saber si suspende, apruba con suficiente, notable o excelente

		if (nota <0) {
			System.out.println("¡¡ERROR!!");
		} else if (nota < 5) {
			System.out.println("No llegas al 5...");
		} else if(nota < 6) {
			System.out.println("Has aprobado con un suficiente");
		} else if (nota < 7) {
			System.out.println("Has aprobado con un bien");
		} else if (nota < 9) {
			System.out.println("¡Notable!");
		} else if (nota < 10) {
			System.out.println("¡¡EXCELENTE!!");
		} else if (nota == 10){
			System.out.println("¡¡¡MATRICULA DE HONOR!!!");
		} else {
			System.out.println("¡¡ERROR!!");
		}
	}
}
