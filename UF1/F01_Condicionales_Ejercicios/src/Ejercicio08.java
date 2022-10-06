import java.util.Scanner;

// Escriu un programa que demani un import sense impostos, 
// i ens digui l'import aplicant els impostos, 
// si és major de 15000 se li aplicarà un 16% d’impostos, en cas contrari un 10%.

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pido el importe
		System.out.println("Introduce el importe sin impuestos:");
		double importe = teclado.nextDouble();
		
		//Miro si supera los 15000
		double importeFinal;
		if (importe > 15000) {
			importeFinal = importe + (importe * 0.16);
		} else {
			importeFinal = importe + (importe * 0.10);
		}
		// Muestro el resultado final
		System.out.println("El importe final es de: " + importeFinal);
	}
}
