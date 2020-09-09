import java.util.Scanner;

public class Cozum3 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen bir feet deðeri giriniz ");
		double feet=scanner.nextDouble();
		
		double metre = feet*0.305;
		
		System.out.println("Metre degeri : " + metre);
	}

}
