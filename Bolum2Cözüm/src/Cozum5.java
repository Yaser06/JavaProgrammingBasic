import java.util.Scanner;

public class Cozum5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen ara toplam de�erini giriniz: ");
		double aratoplam=scanner.nextDouble();
		
		
		System.out.println("L�tfen komisyon oran�n� giriniz : ");
		double komisyon=scanner.nextDouble();
		
		double komisyonMiktar� =(aratoplam*komisyon)/100;
		double toplam=aratoplam+komisyonMiktar�;
		
		System.out.println("Komisyon miktar�: "+ komisyonMiktar�);
		
		System.out.println("Komisyon toplam deger : " +toplam);
		
		
	}

}
