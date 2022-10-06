// Tenint en compte els valors de a, b, c i x, indica si les següents expressions s'avaluen com a CERT o FALS:

public class Ejercicio03 {

	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int c = 4;
		int x = 0;
		
		// caso 1
		if((2 + 3) > (1 + 4)){
			System.out.println("((2 + 3) > (1 + 4)) es correcto.");
		} else {
			System.out.println("((2 + 3) > (1 + 4)) es falso");
		}
		
	}

}

//a == 8 -> Falso
//
//!(a == 7) && !(b == 8) -> Correcto
//
//a == 7 || b == 8 -> Falso
//
//!(a == 7 && b == 6) -> Falso
//
//Math.pow(1.5, 2.0) <= 1.5 -> Falso
//
//5 != 1 + 4 -> Falso
//
//1 < 2 && 3 < 4 -> Correcto
//
//1 < 2 && 3 > 4 -> Falso
//
//1 == 1 || 2 == 3 -> Falso
//
//!false -> Correcto
//
//!(1 < 2) -> Falso
//
//x < 0 -> Falso
//
//a * b == a * c -> Falso
//
//a != 8 && b > 5 || c == 4 && !(a == 6) -> Correcto