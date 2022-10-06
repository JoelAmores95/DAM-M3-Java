// Calcula la suma de dos números introducidos por teclado y su producto y muestra el resultado en pantalla

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Activar teclado
		Scanner teclado = new Scanner(System.in);
		
		// Pido el primer entero y lo guardo en la variable primerEntero
		System.out.println("Saludos, necesito que introduzcas un número entero: ");
		int primerEntero = teclado.nextInt();
		
		// Pido el segundo entero y lo guardo en la variable segundoEntero
		System.out.println("Genial, ahora necesito un segundo número entero: ");
		int segundoEntero = teclado.nextInt();
		
		// Sumo sus valores
		int resultadoSuma = primerEntero + segundoEntero;
		
		// Multiplico los valores introducidos
		int resultadoProducto = primerEntero * segundoEntero;
		
		// Muestro en pantalla el resultado de la suma y la multiplicación respectivamente
		System.out.println("En base a los números introducidos, el resultado de su suma es "+resultadoSuma+" y el de su multiplicación es "+ resultadoProducto);
		
		// Una forma alternativa es
		// System.out.println("La suma es "+(primerEntero+segundoEntero)+" y la multiplicación es "+primerEntero*segundoEntero);
		
		//Extra: DIVIDE
		double division = primerEntero / segundoEntero;
		System.out.println("Como extra la división: "+division); //Da error, necesitamos arregarlo
		//Lo arreglamos usando el CAST -> Cambia el tipo de datos de forma TEMPORAL.
		//Ejemplo: un "int"->"double" en ESA operación, luego vuelve a ser "int"
		
		//SINTAXIS: (tipo de datos al que queremos convertir)variable
		//Ejemplo: (double)primerEntero
		System.out.println("Y ahora arreglado:"+(double)primerEntero/segundoEntero);
		
	}

}
