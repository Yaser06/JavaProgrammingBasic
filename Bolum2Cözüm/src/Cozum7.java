import java.util.Scanner;

public class Cozum7 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Bir y�l�n 365 g�n oldu�unu unutmay�n");
		System.out.println("Dakika t�r�nden bir sayi giriniz ");
		
		int sayi=scanner.nextInt();
		int dakika=sayi%60;
		int saat=sayi/60;
		int toplamG�n= saat/24;
		int g�n=toplamG�n%365;
		int yil=toplamG�n/365;
				
		
		System.out.println("Toplam yil :" + yil);
		System.out.println("G�n : "+ g�n);
		System.out.println("Dakika : " +dakika);
		
	}

}
