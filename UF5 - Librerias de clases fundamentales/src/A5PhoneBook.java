import java.util.Scanner;

class A5PhoneBook {

	// CONSTANTES
	public static final String SALIDA = "quit";
	public static final String PEDIRNOMBRE = "name?";
	public static final String CIERRE = "good-by";
	public static final String ERROR = "Name not found";

	// Método Principal
	public static void main (String[] args) {
		PhoneBook pb = new PhoneBook();

		Scanner teclado = new Scanner(System.in);
		System.out.println(PEDIRNOMBRE);

		// Pido nombre mientras el usuario no introduzca quit

		String persona = teclado.nextLine();		
		while(!persona.toLowerCase().equals(SALIDA.toLowerCase())) {

			// Search for persona
			PhoneEntry entry = pb.search(persona);

			if (entry != null) {
				System.out.println(entry.name + ": " + entry.phone );

			} else {
				System.out.println(ERROR); 
			}

			// Vuelvo a pedir nombre
			System.out.println(PEDIRNOMBRE);
			persona = teclado.nextLine();
		}
		System.out.println(CIERRE);
		teclado.close();

	} 
}

class PhoneEntry {

	// Name of a person
	String name;
	// Their phone number
	String phone;

	PhoneEntry (String n, String p) { 
		name = n;
		phone = p; 
	}
}

class PhoneBook { 

	PhoneEntry[] phoneBook;

	// Constructor
	PhoneBook() {
		phoneBook = new PhoneEntry[5];
		phoneBook[0] = new PhoneEntry("James Barclay", "(418)665- 1223");
		phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860)399- 3044");
		phoneBook[2] = new PhoneEntry("Paul Kratides", "(815)439- 9271");
		phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223- 1937");
		phoneBook[4] = new PhoneEntry("John Wood", "(913)883- 2874");
	}

	// Método search() -> Reescribir para tener un único return
	PhoneEntry search (String targetName) {
		
		// String auxiliar
		PhoneEntry telefono = null;
		
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].name.equals(targetName)) {
				// asigno valor 
				telefono = phoneBook[j];
			} 
		}
		return telefono;
	}
}
