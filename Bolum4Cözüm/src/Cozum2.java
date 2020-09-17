import java.util.Scanner;

public class Cozum2 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen altýgen kenarýný giriniz ");
		double kenar =scanner.nextDouble();
		
		double alan = (6*Math.pow(kenar, 2))/(4*Math.tan(Math.PI/6));
		double alan2 = ((int)(alan*100));
		double alan3 =alan2/100;
		//100 çarpýp int cast edeceðim sonra 100 böleceðim virgülden sonra iki basamak gözükmesi için 
		
		System.out.println("Altigenin alaný " + alan3);
		
		
	}

}
