import java.util.Scanner;

// 11. Escriu un programa que demani preu (sense IVA) i quantitat de 3 productes. 
// El programa ha de mostrar per pantalla:

// a) El preu total per producte, tenint en compte l'IVA i la quantitat.
// b) El preu total de la comanda, sense IVA i amb IVA.

public class ejer11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		//Pido precio sin IVA y cantidad
		System.out.println("Introduce el precio sin IVA del primer producto: ");
		double precioIncial1 = teclado.nextDouble();
		System.out.println("Introduce la cantidad");
		int cantidad = teclado.nextInt();

		System.out.println("Introduce el precio sin IVA del segundo producto: ");
		double precioIncial2 = teclado.nextDouble();
		System.out.println("Introduce la cantidad");
		int cantidad2 = teclado.nextInt();

		System.out.println("Introduce el precio sin IVA del tercer producto: ");
		double precioIncial3 = teclado.nextDouble();
		System.out.println("Introduce la cantidad");
		int cantidad3 = teclado.nextInt();

		//Muestro el precio total por producto
		System.out.println("El precio por ud. con IVA del primer producto es de "
				+(precioIncial1 + precioIncial1 * 0.21) + " €");

		System.out.println("El precio por ud. con IVA del segundo producto es de "
				+(precioIncial2 + precioIncial2 * 0.21) + " €");

		System.out.println("El precio por ud. con IVA del tercer producto es de "
				+(precioIncial3 + precioIncial3 * 0.21) + " €");

		//Precio total de la comanda SIN IVA
		System.out.println("El precio total de la comanda SIN IVA es de: "+ (precioIncial1 * cantidad 
				+ precioIncial2 * cantidad2
				+ precioIncial3 * cantidad3 + "€"));

		//Precio Total de la comanda CON IVA
		System.out.println("El precio total de la comanda CON IVA es de: "
				+ (( (precioIncial1 * cantidad) + ( (precioIncial1 * cantidad ) * 0.21 ) ) 
				+ ( (precioIncial2 * cantidad2) + ( (precioIncial2 * cantidad2 ) * 0.21 ) )
				+ ( (precioIncial3 * cantidad3) + ( (precioIncial3 * cantidad3 ) * 0.21 ) )
				+ "€"));

	}

}
