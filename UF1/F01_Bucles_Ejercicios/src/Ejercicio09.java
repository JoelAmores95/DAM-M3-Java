//Donat un nombre enter positiu i un dígit, calcula quantes vegades el dígit apareix dins del nombre.
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		System.out.println("¿Qué numero quieres que cuente?");
		int digito = teclado.nextInt();

		// Creo contadores para no modificar el valor original de la variable
		int iNumero = numero;
		int numeroReducido = numero;
		int cantidadDigito = 0; // Cuantas veces sale el digito que busco
		int residuo = 0;

		// Sabiendo las cifras, divido para aislar el primer numero
		// La clave es el RESIDUO!!!

		while (iNumero > 0) {
			iNumero = iNumero / 10;
			residuo = numeroReducido-(iNumero*10);
			numeroReducido = numeroReducido/10;
			if (residuo == digito) {
				cantidadDigito++;
			}

		}
		System.out.println(cantidadDigito);
	}

}
