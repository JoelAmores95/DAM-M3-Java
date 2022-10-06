import java.util.Scanner;

// Donats el primer número, la diferència i el nombre de números d'una progressió aritmètica, escriu els seus elements, la seva suma i el seu producte. 
// En una progressió aritmètica cada número és igual a l'anterior més la diferència

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir tres números	
		// Primer número
		System.out.println("Dime el primer número de la secuencia: ");
		int primerNumero = teclado.nextInt();
		
		// Diferencia

		System.out.println("Dime la diferencia de un número a otro: ");
		int diferencia = teclado.nextInt();
		
		// Total de números de la secuencia aritmetica

		System.out.println("Dime cuántos números tiene la secuencia: ");
		int totalNumeros = teclado.nextInt();
		
		// Mostrar los números de la progresion aritmetica
		// Contador de ciclos
		int contadorCiclo = 1;
		//Controla el número actual de la progresion, para no borrar el valor original del primer numero.
		int numeroSecuencia = primerNumero;
		
		System.out.println("Los números de la progresion aritmetica son: \n" + primerNumero);
		while (contadorCiclo < totalNumeros) {
			System.out.println((numeroSecuencia += diferencia));
			contadorCiclo ++;
		}
		
		// Calcular suma de todos los números
		
		int sumaTotal = primerNumero; // Le asigno ya el primer número de la sucesión
		contadorCiclo = 1; // Ya tiene el primer número
		numeroSecuencia = primerNumero;
		while (contadorCiclo < totalNumeros) {
			sumaTotal += (numeroSecuencia += diferencia);
			contadorCiclo++;
		}
		System.out.println("La suma total es: " + sumaTotal);
		
		// Calcular producto de todos los números
		// empiezo por el primero que es primerNumero
		
		int resultadoMultiplicacion = primerNumero;
		contadorCiclo = 1; // Ya tiene asignado el primer valor
		numeroSecuencia = primerNumero;
		while(contadorCiclo < totalNumeros) {
			
			// La progresion seria: primer numero * segundo * tercero...
			resultadoMultiplicacion =  resultadoMultiplicacion * (numeroSecuencia + diferencia);
			numeroSecuencia += diferencia;
			contadorCiclo++;
		}
		System.out.println("El resultado de multiplicar entre si sus números es: " + resultadoMultiplicacion);
		
		// EXTRA Calcular media aritmética
		// La media es la suma de todos sus numeros dividido entre el total de números
		double mediaAritmetica = (double)sumaTotal / totalNumeros;
		System.out.println("La media aritmetica es: " + mediaAritmetica);
		
	}

}
