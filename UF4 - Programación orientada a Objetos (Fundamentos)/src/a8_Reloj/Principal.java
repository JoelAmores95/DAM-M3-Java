package a8_Reloj;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creo el reloj vacío
		Reloj relojVacio = new Reloj();

		// Imprimo el reloj 
		System.out.println(relojVacio.toString());

		// Sumo un segundo
		relojVacio.sumarSegundo();

		// Imprimo el reloj 
		System.out.println(relojVacio.toString());

		// Sumo varios segundos
		System.out.println("¿Cuántos segundos quieres sumar?");
		relojVacio.sumarSegundos(teclado.nextInt());

		// Imprimo el reloj 
		System.out.println(relojVacio.toString());

		// Creo un reloj personalizado con datos erroneos
		System.out.println("Aquí una prueba de datos mal introducidos: ");
		Reloj relojMalo = new Reloj(25,61,61);

		// Creo un reloj personalizado con datos pedidos por el usuario
		System.out.println("Crea tu reloj: (hh mm ss)");
		Reloj relojUsuario = new Reloj(teclado.nextInt(),teclado.nextInt(),teclado.nextInt());
		
		// Imprimo el reloj 
		System.out.println(relojUsuario.toString());
		
		System.out.println("Prueba a cambiar la hora: (hh mm ss)");
		// Modifico la hora del reloj
		relojUsuario.modificarHora(teclado.nextInt(),teclado.nextInt(),teclado.nextInt());
		
		// Imprimo el reloj 
		System.out.println(relojUsuario.toString());
	}

}
