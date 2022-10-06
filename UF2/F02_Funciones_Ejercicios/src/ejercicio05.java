import java.util.Scanner;

// 5. **Calculadora:** 
// Fer un programa principal que contingui un menú amb 5 opcions
//    1. Sumar
//    2. Restar
//    3. Multiplicar
//    4. Dividir 
//    5. Sortir 
//    
//    💡 Cadascuna de les quatre primeres opcions ha d'implementar-se en una funció diferent, i cridar-la des del menú.
//    
//    ⚠️ Fes que a les funcions de sumar i restar els números es demanin a l'usuari al programa principal, 
//		i a les altres dues els números es demanin dintre de la mateixa funció.
//    
public class ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Menú principal
		System.out.println("** Calculadora **\n\nElige tu opción:\n\n1: Sumar\n2: Restar\n3: Multiplicar\n4: Dividir\n5: Salir");
		int opcion = teclado.nextInt();
		int num1=0;
		int num2=0;

		switch(opcion) {
		case 1: 
			System.out.println("Has seleccionado 1.Sumar\nIntroduce el primer número:");
			num1 = teclado.nextInt();
			System.out.println("Introduce el segundo número: ");
			num2 = teclado.nextInt();
			System.out.println(sumar(num1,num2)); 
			break;

		case 2: 
			System.out.println("Has seleccionado 2.Restar\nIntroduce el primer número:");
			num1 = teclado.nextInt();
			System.out.println("Introduce el segundo número: ");
			num2 = teclado.nextInt();
			System.out.println(restar(num1,num2));  
			break;
		case 3: System.out.println(multiplicar(num1,num2)); 
		break;
		case 4: System.out.println(dividir(num1,num2)); 
		break;
		case 5: System.out.println("Has elegido 5.Salir. ADEEEEEU");break;
		}
	}

	// 1. Función Sumar
	public static int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	// 2. Función Restar
	public static int restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	
	// 3. Función Multiplicar
	public static int multiplicar(int num1, int num2) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Has seleccionado 3.Multiplicar\nIntroduce el primer número:");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		int multiplicar = num1 * num2;
		return multiplicar;
	}
	
	// 4. Función Dividir
	public static double dividir(int num1, int num2) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Has seleccionado 4.Dividir\nIntroduce el primer número:");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		double dividir = (double)num1 / num2;
		return dividir;
	}
}