import java.util.Scanner;

public class Cozum14 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen alt�genin kenar uzunlugunu giriniz : ");
		double kenar=scanner.nextDouble();
		double alan =( ( 3 * ( Math.pow(3, 0.5) ) ) /2 )  *  (kenar * kenar);
		
		System.out.println("Alt�genin alan� : " + alan);
	}

}
