import java.util.Scanner;

// 13.  Escriu un algorisme que donats 3 enters que representen hores, minuts i segons 
// (que els llegim de teclat), doni el resultat equivalent en segons.

//       * Variant 1: Donat un nombre de segons, escriu un algorisme que mostri 
//			el nombre d'hores, minuts i segons equivalent.
//
//       * Variant 2: Donat un nombre de minuts, escriu un algorisme que mostri 
//			el nombre de setmanes, dies, hores i minuts equivalent.


public class ejer13 {

	public static int MINUTO = 60;
	public static int HORA = 60;
	public static int DIA = 24;
	public static int SEMANA = 7;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 

		//Pido las variables

		System.out.println("Introduce las horas: ");
		double horas = teclado.nextDouble();

		System.out.println("Introduce los minutos: ");
		double minutos = teclado.nextDouble();

		System.out.println("Introduce los segundos: ");
		double segundos = teclado.nextDouble();

		// 1 hora = 3600s, 1 min = 60
		double segundosTotales = (horas * 3600) +
				(minutos * 60) + segundos;

		System.out.println(horas + " horas, "+ minutos + " minutos y "+ segundos + " segundos equivalen a " 
				+ segundosTotales + " segundos");

		// Variante 1

		System.out.println(segundos + "s equivalen a " + segundos + "s, "
				+ segundos / MINUTO +" minutos y " + segundos / MINUTO / HORA + "horas.");

		// Variante 2
		
		// 1h = 60 min, 1 dia = 1h * 24, 1 semana = 1  dia * 7
		System.out.println(minutos + " minutos equivalen a "+ minutos + " minutos, "
				+ minutos / HORA + " horas y " + minutos / HORA / DIA + " días y "
				+ minutos / HORA / DIA / SEMANA + " semanas.");
		teclado.close();
	}

}
