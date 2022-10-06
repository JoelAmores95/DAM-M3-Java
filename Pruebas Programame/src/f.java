import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numCasos = teclado.nextInt();		
		
		for (int i = 0; i < numCasos; i++) {
			
			int c = teclado.nextInt(); //comensales
			int n = teclado.nextInt(); //sobran
			
			int min = (n * c - 1) / (c - 1);
			int max = (n * c) / (c - 1);	
			
			System.out.println(min + " " + max);			
			
		}
		
	}

}
