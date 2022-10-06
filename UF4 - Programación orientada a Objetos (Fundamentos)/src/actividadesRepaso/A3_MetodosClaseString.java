package actividadesRepaso;

public class A3_MetodosClaseString {

	public static void main(String[] args) {

		// CharAt(int Index)
		// Devuelve el valor del char que hay en la posición enviada (0,1,2,n...)

		String palabra = "aeiou";
		System.out.println(palabra.charAt(2));

		// concat(String str)
		// Añade a un String el texto que le indiquemos.
		
		System.out.println(palabra.concat(" son las vocales."));


		// endsWith(String sufijo)
		// devuelve true o false si el string acaba con el sufijo indicado
		
		System.out.println(palabra.endsWith("ou"));

		// equals(String str)
		// Devuelve true o false si son IDENTICAMENTE IGUALES
		// incluidas mayuscualas y minusculas
		
		System.out.println(palabra.equals(palabra));
		System.out.println(palabra.equals("pokemon"));

		// equalsIgnoreCase(String str)
		// Dice si son iguales, ignorando mayusculas
		
		System.out.println(palabra.equalsIgnoreCase("AEIOU"));

		// indexOf(int char)
		// Devuelve el indice de la primera aparicion del char introducido
		
		System.out.println(palabra.indexOf('e'));

		// indexOf(String str)
		// Devuelve el indice donde encuentra la primera aparicion del texto metido
		// Si no encuentra, devuelve -1
		
		System.out.println(palabra.indexOf("iou"));

		// length()
		// Devuleve la longitud
		
		System.out.println(palabra.length());

		// startsWith(String prefijo)
		// Si empieza asi
		
		System.out.println(palabra.startsWith("ae"));
		System.out.println(palabra.startsWith("ei"));

		// substring(int indiceDeInicio)
		// Muestra el substring empezando desde la posicion indicada
		
		System.out.println(palabra.substring(3));

		// substring(int indiceDeInicio, int indiceFin)
		// Muestra el substring empezando desde la posicion indicada
		
		System.out.println(palabra.substring(2,4));
		
		// toLowerCase(),toUpperCase()
		// convierte a minusculas / mayusculas
		
		System.out.println(palabra.toUpperCase());
		palabra = "aEiOu";
		System.out.println(palabra.toLowerCase());
		
		// trim()
		// Se come los espacios iniciales y finales, no los internos
		
		palabra = "  ae i ou  ";
		System.out.println(palabra.trim());
	}

}
