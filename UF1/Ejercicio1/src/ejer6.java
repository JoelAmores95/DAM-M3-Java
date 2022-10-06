import java.util.Scanner;

//6. Escriu un programa que calculi l'import d'una compra. 
//L'usuari ha d'introduir el preu d'una unitat i el nombre d'unitats a comprar

public class ejer6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pido el precio del producto
		System.out.println("¿Cuánto vale este producto?");
		double precio = teclado.nextDouble();
		
		//Pido la cantidad de unidades
		System.out.println("¿Cuántas unidades llevas?");
		int unidades = teclado.nextInt();
		
		//Muestro el precio total
		System.out.println("Todo esto vale: "+precio*unidades+"€");
		
		teclado.close();
		
	}

}
