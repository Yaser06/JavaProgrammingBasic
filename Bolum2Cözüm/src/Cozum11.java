import java.util.Scanner;

public class Cozum11 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Aylýk birikim miktarýnýz giriniz : ");
		double aylikBirikim=scanner.nextDouble();
		
		double yillikFaiz=(1+(0.05/12));
		
		double birinciAy=aylikBirikim*yillikFaiz;
		double ikinciAy=(aylikBirikim+birinciAy)*yillikFaiz;
		double ucuncuAy=(aylikBirikim+ikinciAy)*yillikFaiz;
		double dorduncuAy=(aylikBirikim+ucuncuAy)*yillikFaiz;
		double besinciAy=(aylikBirikim+dorduncuAy)*yillikFaiz;
		double altinciAy=(aylikBirikim+besinciAy)*yillikFaiz;
		
		System.out.println("Birinci Ay : " + birinciAy);
		System.out.println("Ikinci Ay : " + ikinciAy);
		System.out.println("Ucuncu Ay : " + ucuncuAy);
		System.out.println("Dorduncu Ay : " + dorduncuAy);
		System.out.println("Besinci Ay : " + besinciAy);
		System.out.println("Altinci Ay : " + altinciAy);
		
		
	}

}
