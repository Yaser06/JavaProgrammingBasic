import java.util.Scanner;

public class Cozum4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("0 dan 6 ya kadar bir sayi giriniz : ");
		int deger = scanner.nextInt();
		System.out.println("Kac gün sonrasý icin 0 dan 6 ya kadar bir sayi giriniz: ");
		
		int kacgunSonra=scanner.nextInt();
		int günBulma=((deger+kacgunSonra) % 7);
		
		System.out.print("Bugün günlerden : ");
		
		
		switch (deger) {
		case 0:
			System.out.print("Pazar ");
			break;
		case 1:
			System.out.print("Pazartesi");
			break;
		case 2:
			System.out.print("Sali");
			break;
		case 3:
			System.out.print("Carsamba");
			break;
		case 4:
			System.out.print("Persembe");
			break;
		case 5:
			System.out.print("Cuma");
			break;
		case 6:
			System.out.print("Cumartesi");
			break;
		

		default:
			System.out.println("0 dan 6 ya kadar gecerli  bir sayi giriniz");
			break;
		}
		
		System.out.print("  " +kacgunSonra +" gün sonra :  ");
		switch (günBulma) {
		case 0:
			System.out.println("Pazar ");
			break;
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		

		default:
			System.out.println("0 dan 6 ya kadar gecerli  bir sayi giriniz");
			break;
		}
	}

}
