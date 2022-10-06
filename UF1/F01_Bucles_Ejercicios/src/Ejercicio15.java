// Donats dos nombres enters n1 i n2 amb n1 < n2 i un nombre enter x, 
// escriu x nombres enters aleatoris dins l�interval [n1 , n2]. 
// Math.random()

import java.util.Scanner;
import java.util.function.Function;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce primer numero");
		int n1 = teclado.nextInt();
		System.out.println("Introduce un segundo numero mas grande que el anterior: ");
		int n2 = teclado.nextInt();
		System.out.println("Ahora un numero entero: ");
		int x = teclado.nextInt();

		
		for (int i = 1; i <= x; i++) {
			System.out.println(Math.floor(Math.random()*(n2-n1+1)+n1)); 
			
			// expresi�n Math.random():
			
//			En primer lugar, miramos cu�ntos valores queremos. 
			
//			En nuestro caso del dado son 6 valores, del 1 al 6 ambos incluido. Debemos entonces multiplicar Math.random() por 6. 
//			Si quisieramos valores entre dos n�meros cualquiera ambos inclu�dos, por ejemplo, 5 y 10, la cuenta ser�a (maximo-minimimo)+1, es decir, (10-5)+1 = 6, 
//			tambi�n multiplicar�amos por 6.
			
//			Math.random()*6   // Esto da valores de 0.0 a 6.0, excluido el 6.0
			
//			Como nuestro primer valor es 1, le sumamos 1 al resultado. En el caso de que quisieramos entre 5 y 10, habr�a que sumar 5, es decir, el valor m�nimo.
//			Math.random()*6 + 1   // Esto da valores entre 1.0 y 7.0 excluido el 7.0
//			Finalmente, para conseguir un entero, quitamos los decimales usando la clase Math.floor()
//
//			 int valorDado = Math.floor(Math.random()*6+1);
//			En general, para conseguir un n�mero entero entre M y N con M menor que N y ambos inclu�dos, debemos usar esta f�rmula
//
//			  int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
//			Si no queremos un valor entero sino double, la f�rmula es sin el +1
//
//			  double valorAleatorio = Math.random()*(N-M)+M;
//			eso s�, recuerda que el valor N queda excluido y no saldr� nunca.
		}
	}

}
