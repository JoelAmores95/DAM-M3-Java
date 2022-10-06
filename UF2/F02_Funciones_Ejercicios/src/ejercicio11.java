import java.util.Scanner;

// 1. **Àrea:** Demanar a l'usuari la base i l'altura d'un triangle en cm. 
// 		Calcular l'àrea del triangle.
//    
//     Area = Base × Height / 2
//    

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la base del triangulo: ");
		int base = teclado.nextInt();
		System.out.println("Dime la altura del triangulo: ");
		int altura = teclado.nextInt();
		calcularAreaTriangulo(base, altura);
	}

	// Función calcular area triángulo
	public static void calcularAreaTriangulo(int base, int altura) {
		System.out.println(((double)base * altura)/2);
	}
}
