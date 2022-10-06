import java.util.Scanner;

// Donats el primer n�mero, la difer�ncia i el nombre de n�meros d'una progressi� aritm�tica, escriu els seus elements, la seva suma i el seu producte. 
// En una progressi� aritm�tica cada n�mero �s igual a l'anterior m�s la difer�ncia

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir tres n�meros	
		// Primer n�mero
		System.out.println("Dime el primer n�mero de la secuencia: ");
		int primerNumero = teclado.nextInt();
		
		// Diferencia

		System.out.println("Dime la diferencia de un n�mero a otro: ");
		int diferencia = teclado.nextInt();
		
		// Total de n�meros de la secuencia aritmetica

		System.out.println("Dime cu�ntos n�meros tiene la secuencia: ");
		int totalNumeros = teclado.nextInt();
		
		// Mostrar los n�meros de la progresion aritmetica
		// Contador de ciclos
		int contadorCiclo = 1;
		//Controla el n�mero actual de la progresion, para no borrar el valor original del primer numero.
		int numeroSecuencia = primerNumero;
		
		System.out.println("Los n�meros de la progresion aritmetica son: \n" + primerNumero);
		while (contadorCiclo < totalNumeros) {
			System.out.println((numeroSecuencia += diferencia));
			contadorCiclo ++;
		}
		
		// Calcular suma de todos los n�meros
		
		int sumaTotal = primerNumero; // Le asigno ya el primer n�mero de la sucesi�n
		contadorCiclo = 1; // Ya tiene el primer n�mero
		numeroSecuencia = primerNumero;
		while (contadorCiclo < totalNumeros) {
			sumaTotal += (numeroSecuencia += diferencia);
			contadorCiclo++;
		}
		System.out.println("La suma total es: " + sumaTotal);
		
		// Calcular producto de todos los n�meros
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
		System.out.println("El resultado de multiplicar entre si sus n�meros es: " + resultadoMultiplicacion);
		
		// EXTRA Calcular media aritm�tica
		// La media es la suma de todos sus numeros dividido entre el total de n�meros
		double mediaAritmetica = (double)sumaTotal / totalNumeros;
		System.out.println("La media aritmetica es: " + mediaAritmetica);
		
	}

}
