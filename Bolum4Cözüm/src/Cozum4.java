import java.util.Scanner;

public class Cozum4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		
		char ch=scanner.next().charAt(0);
		if('a' <= ch && ch<='z' || 'A'<=ch && ch <= 'Z') {
			int deger =(int)ch;
			System.out.println(deger);
			
		}else {
			System.out.println("Yanlis bir islem yaptiniz lütfen bir harf giriniz");
		}
		
		
	}

}
