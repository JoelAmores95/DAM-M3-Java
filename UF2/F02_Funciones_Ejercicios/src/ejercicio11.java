import java.util.Scanner;

// 1. **�rea:**�Demanar a l'usuari la base i l'altura d'un triangle en cm. 
// 		Calcular l'�rea del triangle.
//    
//     Area = Base � Height / 2
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

	// Funci�n calcular area tri�ngulo
	public static void calcularAreaTriangulo(int base, int altura) {
		System.out.println(((double)base * altura)/2);
	}
}
