//Buscar informacion sobre las funciones integradas Math.abs(), Math.round() y Math.pow()

public class Ejer15 {

	public static void main(String[] args) {
//		
//		// Math.abs(valor); muestra el VALOR ABSOLUTO, sin signos
//		System.out.println(Math.abs(-15)); = 15
//		
//		// Math.round(float); redondea al valor más cercano en forma de int
//		System.out.println(Math.round(-15.8372)); = -16
//		
//		// Math.pow(); eleva el primer numero a la potencia indicada en el segundo numero
//		System.out.println(Math.pow(2, 10)); = 1024
//		
//		// (int) variable; modifica temporalmente la variable y la usa como int
//		System.out.println((int)2.9); = 2
//		
		
		// a)Calcula 3 a la potencia de 7
		System.out.println(Math.pow(3,7)); 
		
		// b) Convertir 34,7 a un enter truncant (només la part entera).
		System.out.println((int)34.7); //Los decimales van con PUNTO
		
		// c) Convertir de 34,7 a un enter per arrodoniment.
		System.out.println(Math.round(34.7)); //Los decimales van con PUNTO
		
		// d) Tenir el valor absolut de -86, després convertir-lo a un nombre decimal (double)
		System.out.println((double)Math.abs(-86));

	}

}
