import java.util.Scanner;

public class Cozum18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("yatirim miktarini girin : ");
		double yatirimMiktari = scanner.nextDouble();
		
		System.out.println("yillik faiz oranini yuzde olarak giriniz : ");
		double yillikFaizOrani = scanner.nextDouble();
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		System.out.println("yil sayisini giriniz : ");
		double yilSayisi = scanner.nextDouble();
		
		double yatiriminGeriDonusDegeri = yatirimMiktari * Math.pow(1 + aylikFaizOrani, (yilSayisi * 12));
		
		System.out.println(yatiriminGeriDonusDegeri);	
	}

}
