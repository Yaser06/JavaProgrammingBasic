import java.util.Scanner;

public class Cozum10 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen ivme deðerini giriniz ");
		double ivme=scanner.nextDouble();
		System.out.println("Lütfen hýzý giriniz ");
		double hýz =scanner.nextDouble();
		
		double gerekliUzunluk=(hýz*hýz)/(2*ivme);
		
		System.out.println("Ýniþ mesafesi: " + gerekliUzunluk);
	}

}
