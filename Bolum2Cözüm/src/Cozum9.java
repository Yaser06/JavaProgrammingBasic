import java.util.Scanner;

public class Cozum9 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("L�tfen gerekli kilogram su miktar�n� giriniz :  ");
		double su=scanner.nextDouble();
		
		System.out.println("Baslang�c s�cakl�g�n� giriniz : ");
		double ilkSicaklik=scanner.nextDouble();
		
		System.out.println("Istenilen s�cakl�g�n� giriniz: ");
		double sonSicaklik=scanner.nextDouble();
		
		double gerekenEnerji=su*(sonSicaklik-ilkSicaklik)*4184;
		
		System.out.println("Gereken enerji miktar�: " +gerekenEnerji +"joule");
	}

}
