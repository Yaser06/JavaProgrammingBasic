import java.util.Scanner;

public class Cozum8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen 3 basamakli bir sayi giriniz.Polindrom olup olmadýgý kontrol edilecektir. ");
		int sayi =scanner.nextInt();
		int birlerBasamak=sayi %10;
		int onlarBasamak=(sayi/10)%10;
		int yüzlerBasamak=sayi/100;
		
		if(birlerBasamak==yüzlerBasamak) {
			System.out.println("Sayý polindrom bir sayidir");
		}else {
			System.out.println("Polindrom bir sayi degildir.");
		}
		
	}

}
