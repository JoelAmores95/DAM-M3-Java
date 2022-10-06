import java.util.Scanner;

//4. Escriu un programa que demani una quantitat en pessetes i faci la conversió a euros.
//euro = pessetes / 166,386

public class ejer4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedir pesetas (solo enteros)
		System.out.println("Introduce una cantidad de pesetas:");
		int pesetas = teclado.nextInt();
		
		//Mostrar la conversion
		System.out.println("Esto en euros son: "+pesetas/166.386+" €");
		
		//Cierro Scanner
		teclado.close();
	}

}
