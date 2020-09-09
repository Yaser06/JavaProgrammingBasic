import java.util.Scanner;

public class Cozum6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen 0-1000 arasýnda bir deðer giriniz ");
		int sayi =scanner.nextInt();
		int yüzler =sayi/100;
		int onlar=(sayi/10)%10;
		int birler=sayi%10;
		int basamaklarýnToplamý=birler+yüzler+onlar;
		
		System.out.println("Birler basamaðý : "+birler );
		System.out.println("Onlar basamaðý : " +onlar);
		System.out.println("Yüzler basamaðý: "+yüzler);
		System.out.println("Basamaklarýn toplamý: " +basamaklarýnToplamý);
	}

}
