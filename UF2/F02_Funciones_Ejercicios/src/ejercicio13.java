import java.util.Scanner;

//1. **Bon dia:** Demanar a l'usuari l'hora, temperatura i quantitat de pluja. I indicar si podem sortir d'excursió o no. 
//    
//    
//    Podrem sortir d'excursió si són abans de les 21h o, si la temperatura és superior a 20 graus i la pluja inferior a 0.5 litres.

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora = pedirHora();
		int temp = pedirTemperatura();
		double lluvia = pedirLluvia();
		if(sePuedeSalir(hora, temp, lluvia)) {
			System.out.println("¡¡Se puede salir de excursión!!");
		} else {
			System.out.println("No se puede salir... a quedarse en casa...");
		}
	}

	// 1. Función pedir hora
	public static int pedirHora() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la hora: ");
		int hora = teclado.nextInt();
		return hora;
	}

	// 2. Función pedir temperatura
	public static int pedirTemperatura() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la temperatura: ");
		int temperatura = teclado.nextInt();
		return temperatura;
	}

	// 3.Función pedir cantidad de lluvia
	public static double pedirLluvia() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la cantidad de lluvia: ");
		double cantidadLluvia = teclado.nextDouble();
		return cantidadLluvia;
	}
	
	// 4.Función se puede salir de excursion?
	public static boolean sePuedeSalir(int hora, int temp, double lluvia) {
		if(hora < 21 || temp > 20 && lluvia < 0.5) {
			return true;
		} else {
			return false;
		}
	}
}
