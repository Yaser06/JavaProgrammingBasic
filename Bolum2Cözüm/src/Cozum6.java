import java.util.Scanner;

public class Cozum6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("L�tfen 0-1000 aras�nda bir de�er giriniz ");
		int sayi =scanner.nextInt();
		int y�zler =sayi/100;
		int onlar=(sayi/10)%10;
		int birler=sayi%10;
		int basamaklar�nToplam�=birler+y�zler+onlar;
		
		System.out.println("Birler basama�� : "+birler );
		System.out.println("Onlar basama�� : " +onlar);
		System.out.println("Y�zler basama��: "+y�zler);
		System.out.println("Basamaklar�n toplam�: " +basamaklar�nToplam�);
	}

}
