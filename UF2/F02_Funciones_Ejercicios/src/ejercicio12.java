import java.util.Scanner;

// 1. **Multiples:** Demanar a l'usuari un nombre enter i determinar si és múltiple de 2 o de 5

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = teclado.nextInt();
		esMultiple(num);
	}

	// Función calcular si es multiple de 2 o de 5
	
	public static void esMultiple(int num) {
		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("¡¡"+ num + " es múltiple de 2 y de 5!!!");
		} else if (num % 2 == 0) {
			System.out.println(num + " es múltiple de 2");
		} else if (num % 5 == 0) {
			System.out.println(num + " es múltiple de 5");
		} else {
			System.out.println(num + " NO es múltiple ni de 2 ni de 5...");
		}
		 
	}
}
