import java.util.Scanner;

public class Cozum8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen 3 basamakli bir sayi giriniz.Polindrom olup olmad�g� kontrol edilecektir. ");
		int sayi =scanner.nextInt();
		int birlerBasamak=sayi %10;
		int onlarBasamak=(sayi/10)%10;
		int y�zlerBasamak=sayi/100;
		
		if(birlerBasamak==y�zlerBasamak) {
			System.out.println("Say� polindrom bir sayidir");
		}else {
			System.out.println("Polindrom bir sayi degildir.");
		}
		
	}

}
