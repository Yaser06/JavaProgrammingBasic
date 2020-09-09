import java.util.Scanner;

public class Cozum8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ilk hýzý giriniz : ");
		double ilkHýz=scanner.nextDouble();
		
		
		System.out.println("Son hýzý giriniz: ");
		double sonHýz=scanner.nextDouble();
		
		System.out.println("Zamaný giriniz t : ");
		double zaman=scanner.nextDouble();
			
		double ortalamaIvme=(sonHýz-ilkHýz)/zaman;
		
		System.out.println("Ortalama ivme a : " +ortalamaIvme);
		
	}

}
