import java.util.Scanner;

public class Cozum9 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Lütfen gerekli kilogram su miktarýný giriniz :  ");
		double su=scanner.nextDouble();
		
		System.out.println("Baslangýc sýcaklýgýný giriniz : ");
		double ilkSicaklik=scanner.nextDouble();
		
		System.out.println("Istenilen sýcaklýgýný giriniz: ");
		double sonSicaklik=scanner.nextDouble();
		
		double gerekenEnerji=su*(sonSicaklik-ilkSicaklik)*4184;
		
		System.out.println("Gereken enerji miktarý: " +gerekenEnerji +"joule");
	}

}
