import java.util.Scanner;

public class Cozum10 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("L�tfen ivme de�erini giriniz ");
		double ivme=scanner.nextDouble();
		System.out.println("L�tfen h�z� giriniz ");
		double h�z =scanner.nextDouble();
		
		double gerekliUzunluk=(h�z*h�z)/(2*ivme);
		
		System.out.println("�ni� mesafesi: " + gerekliUzunluk);
	}

}
