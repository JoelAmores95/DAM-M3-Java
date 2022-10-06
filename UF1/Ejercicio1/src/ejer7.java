
//7. Conversió Celsius a Fahrenheit:

//a) Crea una nova variable temp, i assigna-li el valor 24.
//b) Converteix el valor de temperatura de Celsius (temp) a Fahrenheit multiplicant per 1,8 i sumant 32. 
//Emmagatzema el valor resultant a la mateixa variable temp. Quin és el nou valor de temp?

// (farenheit = celsius * 1,8 + 32)

public class ejer7 {

	public static void main(String[] args) {
		
		//Valor inicial de temp
		double temp = 24;
		System.out.println(temp + "ºC");
		
		//Conversion a Farhernheit
		temp = (temp * 1.8) + 32;
		System.out.println(temp + "F");

	}

}
