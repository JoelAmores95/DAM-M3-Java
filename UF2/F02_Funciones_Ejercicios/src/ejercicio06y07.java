import java.util.Scanner;

// 1. **Salutació multilingüe:** Crear una funció que rebi per paràmetre un nom i un idioma (castellà, català o anglès). 
//    La funció ha d'imprimir "Bon dia X" en l'idioma seleccionat. 
//    
//     Prova-la des del programa principal.
//    
public class ejercicio06y07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		// Pedir nombre
		System.out.println("Te pido el nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Elige idioma:\n1. Castellano\n2. Català\n3. English");
		int idioma = teclado.nextInt();

		switch (idioma) {
		case 1: System.out.println(saludarEspañol(nombre));
		break;
		case 2: System.out.println(saludarCatalan(nombre));
		break;
		case 3: System.out.println(saludarIngles(nombre));
		break;
		}

	}

	// 1. Saludar Español
	public static String saludarEspañol(String nombre) {

		// Miro si es de dia o de noche
		saberDiaNoche();

		if(saberDiaNoche()) {
			String saludo = ("Buenas noches " + nombre);
			return saludo;
		}else {
			String saludo = ("Buenos días " + nombre);
			return saludo;
		}

	}
	// 2. Saludar catalán
	public static String saludarCatalan(String nombre) {
		
		// Miro si es de dia o de noche
		saberDiaNoche();
		
		if (saberDiaNoche()) {
			String saludo = ("Bona niiit " + nombre);
			return saludo;
		} else {
			String saludo = ("Bon dia " + nombre);
			return saludo;
		}
	}
	
	// 3. Saludar Inglés
	public static String saludarIngles(String nombre) {
		// Miro si es de dia o de noche
				saberDiaNoche();
				
		if(saberDiaNoche()) {
			String saludo = ("GUUUDNAI " + nombre);
			return saludo;
		} else {
			String saludo = ("HEEEEEEEY WASSAA " + nombre);
			return saludo;
		}
	}
	
	
	// Función saber dia/noche
	public static boolean saberDiaNoche() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Es de noche? (S/N)");
		String respuesta = teclado.nextLine();
		if (respuesta.equalsIgnoreCase("S")) {
			return true;
		} else {
			return false;
		}
	}

}
