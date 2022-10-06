import java.util.Scanner;

// 1. Fer un programa que ens demani per una hora concreta, la temperatura i els litres de pluja d'una població i segons això resoldre aquests petits problemes. 
//    
//    Cadascun que guardi el resultat en una variable booleana diferent i mostri el valor per pantalla.
//    
//    - Construeix una expressió que retorni cert si fa bon dia per sortir. O sigui, si la temperatura és superior a 20 i els litres de pluja són inferiors a 2.
//    - Construeix una expressió que retorni fals en el cas que siguin més tard de les 22 h o si la temperatura és inferior a 5 graus.
//    - Construeix una expressió que ens digui que podem sortir en bici si són abans de les 21 h o si la temperatura és superior a 20 graus i la pluja inferior a 0,5 litres.
//    

public class Ejercicio02 {

	public static void main(String[] args) {
		// Pedir hora, temperatura y litros de lluvia

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la hora");
		double hora = teclado.nextInt();
		System.out.println("Introduce la temperatura");
		double temperatura = teclado.nextInt();
		System.out.println("Introduce los litros de lluvia:");
		double litrosLluvia = teclado.nextInt();

		boolean buenDia = (temperatura > 20 && litrosLluvia < 2);
		boolean esPronto = (hora <= 22 && temperatura <= 5);
		boolean sacaBici = (hora < 21 
				|| temperatura > 20 && litrosLluvia < 0.5);

		System.out.println("Buen dia para salir: " + buenDia);
		System.out.println("Buena hora para salir: " + esPronto);
		System.out.println("Se puede salir en bici: " + sacaBici);

	}

}
