import java.util.Scanner;

public class Cozum2 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen alt�gen kenar�n� giriniz ");
		double kenar =scanner.nextDouble();
		
		double alan = (6*Math.pow(kenar, 2))/(4*Math.tan(Math.PI/6));
		double alan2 = ((int)(alan*100));
		double alan3 =alan2/100;
		//100 �arp�p int cast edece�im sonra 100 b�lece�im virg�lden sonra iki basamak g�z�kmesi i�in 
		
		System.out.println("Altigenin alan� " + alan3);
		
		
	}

}
