// Crear una funció que rebi 3 números com a paràmetres i digui el màxim.

public class ejercicio01 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		// TODO Auto-generated method stub
		dameElNumAlto(num1, num2, num3);

	}
	
	public static int dameElNumAlto(int num1,int num2,int num3) {
		int numGrande = Math.max(num1, Math.max(num2, num3));
		System.out.println(numGrande);
		return numGrande;
	}

}
