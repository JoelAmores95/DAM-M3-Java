import java.util.Scanner;

// 1. **Multiples:**�Demanar a l'usuari un nombre enter i determinar si �s m�ltiple de 2 o de 5

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero entero: ");
		int num = teclado.nextInt();
		esMultiple(num);
	}

	// Funci�n calcular si es multiple de 2 o de 5
	
	public static void esMultiple(int num) {
		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("��"+ num + " es m�ltiple de 2 y de 5!!!");
		} else if (num % 2 == 0) {
			System.out.println(num + " es m�ltiple de 2");
		} else if (num % 5 == 0) {
			System.out.println(num + " es m�ltiple de 5");
		} else {
			System.out.println(num + " NO es m�ltiple ni de 2 ni de 5...");
		}
		 
	}
}
