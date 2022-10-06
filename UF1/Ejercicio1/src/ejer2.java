import java.util.Scanner;

//2. Demana a l'usuari la base i l'altura (enters) d'un triangle (demana cada un per separat). 
//Calcula l'àrea del triangle utilitzant la següent fórmula: àrea = base × height / 2
public class ejer2 {

	public static void main(String[] args) {
		
		// Pedir la base y la altura
		Scanner teclado = new Scanner(System.in);
		System.out.println("Voy a calcular el area de un triangulo, dime por favor la base: ");
		int base=teclado.nextInt();
		System.out.println("Ahora la altura del triangulo:");
		int altura=teclado.nextInt();
		
		//Calcular el area y mostrarla en pantalla
		double area = (double)base*(double)altura/2; //También es válido double(base*altura)/2
														//Otra opcion es: base*altura/2.0
		System.out.println("El area de este triangulo es: "+area+"m^2");

	}

}
