import java.util.Scanner;

public class Cozum1 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen bir Santigrat  de�eri giriniz ");
		
		double santigrat=scanner.nextDouble();
		
		double fahrenayt= ((9.0/5)*santigrat)+32;
		
		System.out.println("Fahrenayt degeri : " +fahrenayt);
	}

}
