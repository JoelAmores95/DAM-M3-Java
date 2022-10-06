package teoria;

public class Principal {

	public static void main(String[] args) {
		
		// Puedo llamar una clase del mismo package
		
		// Instancio el objeto
		Silla sillaProfe = new Silla("Negra", 3000, false);
		
		// Ahora puedo modificar las propiedades o atributos

		// Si hago un syso del objeto, me muestra la dirección de memoria
		System.out.println(sillaProfe);
		
		// Muestro una propiedad
		System.out.println(sillaProfe.getColor());
		
		sillaProfe.pintar("Azul");
		System.out.println(sillaProfe.getColor());
		
		// No me deja porque tengo la propiedad en private
//		sillaProfe.color = "Salmón";
		System.out.println(sillaProfe.getColor());
	}

}
