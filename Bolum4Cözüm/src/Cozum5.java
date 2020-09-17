import java.util.Scanner;

public class Cozum5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		
		char ch=scanner.next().toLowerCase().charAt(0);
		// to LoverCase ile girilen harfleri kücük harfe cevirdim.Bu sayede büyük kücükde girse tek tek if döngüsüne ekleme
		//gereksiniminde bulunmayacaðým.
		
		
		if('a' <= ch && ch<='z' || 'A'<=ch && ch <= 'Z') {
	    	
			//(a, e, ý, i, o, ö, u, ü)
			
			if(ch=='a' || ch=='e' ||ch=='ý' ||ch=='i' ||ch=='o' ||ch=='ö' ||ch=='u' ||ch=='ü'   ) {
				System.out.println("Sesli harf girilmiþtir.");
			}else {
				System.out.println("Sessiz harf girilmistir.");
			}
			
			
		}else {
			System.out.println("Yanlis bir islem yaptiniz lütfen bir harf giriniz");
		}
		
	}

}
