import java.util.Scanner;

public class Cozum7 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Bir yýlýn 365 gün olduðunu unutmayýn");
		System.out.println("Dakika türünden bir sayi giriniz ");
		
		int sayi=scanner.nextInt();
		int dakika=sayi%60;
		int saat=sayi/60;
		int toplamGün= saat/24;
		int gün=toplamGün%365;
		int yil=toplamGün/365;
				
		
		System.out.println("Toplam yil :" + yil);
		System.out.println("Gün : "+ gün);
		System.out.println("Dakika : " +dakika);
		
	}

}
