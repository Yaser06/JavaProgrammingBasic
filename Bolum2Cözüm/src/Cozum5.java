import java.util.Scanner;

public class Cozum5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen ara toplam deðerini giriniz: ");
		double aratoplam=scanner.nextDouble();
		
		
		System.out.println("Lütfen komisyon oranýný giriniz : ");
		double komisyon=scanner.nextDouble();
		
		double komisyonMiktarý =(aratoplam*komisyon)/100;
		double toplam=aratoplam+komisyonMiktarý;
		
		System.out.println("Komisyon miktarý: "+ komisyonMiktarý);
		
		System.out.println("Komisyon toplam deger : " +toplam);
		
		
	}

}
