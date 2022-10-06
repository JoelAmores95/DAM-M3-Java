//Coge de fuera (importa) la herramienta Scanner
import java.util.Scanner; 

public class CalculoSueldo {

	public static void main(String[] args) {
		
		//Introducimos la herramienta Scanner para recoger datos del usuario por teclado
		//Lee estas cosas:
		//nextLine() -> lee lineas
		//nextInt() -> lee enteros
		//nextDouble() -> lee decimales
		
		Scanner teclado= new Scanner(System.in); //La única parte que se puede modificar es el nombre "teclado"
		
		//Pedimos el nombre al usuario
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.nextLine();
		
		//Pedimos los datos al usuario
		System.out.println("¿Cuántas horas has trabajado este mes?");
		int horasTrabajadas=teclado.nextInt();
		System.out.println("¿Cuánto cobras por hora?");
		double sueldoHora=teclado.nextDouble();
		
		//Calculamos el sueldo mensual
		double sueldoMensual = horasTrabajadas*sueldoHora;
		
		//Mostramos el resultado por pantalla
		System.out.println("Hola "+nombre+",");
		
//		//Mostramos elementos uno a uno
//		System.out.print("El sueldo mensual es de: ");
//		System.out.print(sueldoMensual);
//		System.out.println("€"); //Añade salto de línea
//		
		//Opción bonita, todo en una línea añadiendo el +
		System.out.println("Tu sueldo mensual es de: "+sueldoMensual+"€");
	}

}

//CTRL+A =>Seleccionar todo
//CTRL+I => auto tabular
//Para autocompletar: CTRL+Espacio
//Para comentar varias líneas de texto, seleccionar y CTRL+7