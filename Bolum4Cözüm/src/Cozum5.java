import java.util.Scanner;

public class Cozum5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen bir harf giriniz");
		
		char ch=scanner.next().toLowerCase().charAt(0);
		// to LoverCase ile girilen harfleri k�c�k harfe cevirdim.Bu sayede b�y�k k�c�kde girse tek tek if d�ng�s�ne ekleme
		//gereksiniminde bulunmayaca��m.
		
		
		if('a' <= ch && ch<='z' || 'A'<=ch && ch <= 'Z') {
	    	
			//(a, e, �, i, o, �, u, �)
			
			if(ch=='a' || ch=='e' ||ch=='�' ||ch=='i' ||ch=='o' ||ch=='�' ||ch=='u' ||ch=='�'   ) {
				System.out.println("Sesli harf girilmi�tir.");
			}else {
				System.out.println("Sessiz harf girilmistir.");
			}
			
			
		}else {
			System.out.println("Yanlis bir islem yaptiniz l�tfen bir harf giriniz");
		}
		
	}

}
