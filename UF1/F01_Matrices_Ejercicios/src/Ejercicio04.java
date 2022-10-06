
import java.util.Scanner;

// Crea un taulell d'escacs, omplint el taulell amb les fitxes corresponents, de la forma més efectiva que puguis. 
// Les fitxes blanques han d'estar representades per lletres majúscules i les negres per minúscules. 

// 8x8 casillas

// P → Peó
// T → Torre
// A → Alfil
// C → Cavall
// Q → Reina
// K → Rei

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String[][] tableroAjedrez = new String [8][8];
		
		
		// Pido introducir las Piezas 1 a 1
		
		// Empiezo por las blancas, arriba
		System.out.println("Empezamos a colocar las piezas de ajedrez.");
		System.out.println("Primero las blancas, en MAYUSCULA primera fila: ");
		
		// Solo recorro la primera fila
		for (int fila = 0; fila < 1; fila++) {
			for (int columna = 0; columna < tableroAjedrez[fila].length; columna++) {
				System.out.println("Casilla " + (columna+1));
				tableroAjedrez[fila][columna]= "| " + teclado.nextLine() +" |";
			}
			
		}
		System.out.println("En la siguiente fila solo hay peones, colocando...");
		for (int fila = 1; fila < 2; fila++) {
			for (int columna = 0; columna < tableroAjedrez[fila].length; columna++) {
				tableroAjedrez[fila][columna]= "| P |";
			}
			
		}
		// Lleno los espacios en blanco
		for (int fila = 2; fila < 6; fila++) {
			for (int col = 0; col < tableroAjedrez.length; col++) {
				tableroAjedrez[fila][col]= "|   |";
			}
		}
		System.out.println("Ahora coloco los peones de las negras...");
		for (int fila = tableroAjedrez.length-2; fila < tableroAjedrez.length; fila++) {
			for (int col = 0; col < tableroAjedrez[fila].length; col++) {
				tableroAjedrez[fila][col]= "| p |";
			}
			
		}
		System.out.println("Y por último las piezas principales de las negras, en minuscula: ");
		for (int fila = tableroAjedrez.length-1; fila < tableroAjedrez.length; fila++) {
			for (int columna = 0; columna < tableroAjedrez[fila].length; columna++) {
				System.out.println("Casilla " + (columna+1));
				tableroAjedrez[fila][columna]= "| " + teclado.nextLine() +" |";
			}
			
		}
		
		// Muestro el resultado
		for (int fila = 0; fila < tableroAjedrez.length; fila++) {
			for (int col = 0; col < tableroAjedrez.length; col++) {
				System.out.print(tableroAjedrez[fila][col]);
			}
			System.out.println();
		}
	}

}
