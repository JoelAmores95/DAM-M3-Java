import java.util.Scanner;

// Escriviu un programa que mostri un men� amb diverses opcions: 
// - Calcular l'�rea d�un rectangle.
// - Calcular l��rea d�un triangle.
// - Calcular l��rea d�un cercle.
//
// Depenent del cas que es tri� s�hauran de demanar les dades corresponents a l�usuari i fer les operacions adequades. Ha de mostrar per pantalla el resultat.

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Mostrar men�
		System.out.println("Bienvenido, escoje una opci�n: \n"
				+ "1- Calcular area rectangulo\n"
				+ "2- Calcular area triangulo\n"
				+ "3- Calcular area circulo");
		int seleccion = teclado.nextInt();

		// Ver la opci�n escogida
		
		// Mensaje de error
		if (seleccion < 1 || seleccion > 3) {
			System.out.println("Esa opci�n no existe");
			
			// 1. Calcular area rectangulo (area = base * altura)
		} else if (seleccion == 1) {
			System.out.println("Has seleccionado calcular el area de un rectangulo. Dime el valor de la base: ");
			double base = teclado.nextDouble();
			System.out.println("Ahora la altura: ");
			double altura = teclado.nextDouble();
			
			// calculo de area
			double areaRectangulo = base * altura;
			System.out.println("El area del rectangulo es: "+ areaRectangulo);
			
			// Calcular area triangulo (area = (base * altura)/2)
		} else if (seleccion == 2) {
			System.out.println("Has seleccionado calcular el area de un triangulo. Dime el valor de la base: ");
			double base = teclado.nextDouble();
			System.out.println("Ahora la altura: ");
			double altura = teclado.nextDouble();
			
			// calculo de area
			double areaTriangulo = (base * altura) / 2;
			System.out.println("El area del triangulo es: "+ areaTriangulo);
			
			// Calcular area circulo (area = radio * radio * 3,14)
		} else {
			System.out.println("Has seleccionado calcular el area de un c�rculo. Dime el valor del radio: ");
			double radio = teclado.nextDouble();

			// calculo de area
			double areaCirculo = (radio * radio * 3.14);
			System.out.println("El area del circulo es: "+ areaCirculo);
		}
	}
}
