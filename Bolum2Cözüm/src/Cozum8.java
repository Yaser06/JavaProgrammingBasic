import java.util.Scanner;

public class Cozum8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ilk h�z� giriniz : ");
		double ilkH�z=scanner.nextDouble();
		
		
		System.out.println("Son h�z� giriniz: ");
		double sonH�z=scanner.nextDouble();
		
		System.out.println("Zaman� giriniz t : ");
		double zaman=scanner.nextDouble();
			
		double ortalamaIvme=(sonH�z-ilkH�z)/zaman;
		
		System.out.println("Ortalama ivme a : " +ortalamaIvme);
		
	}

}
