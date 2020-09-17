import java.util.Scanner;

public class Cozum9 {
	
	public static void main (String [] args) {
			Scanner scanner=new Scanner(System.in);
			int deger=(int)(Math.random()*2);
			
			System.out.println("Yazi icin 1 Tura icin 0 sayisini giriniz.");
			int tahmin=scanner.nextInt();
			if(tahmin==deger) {
				System.out.println("Dogru bildiniz..");
			}else {
				System.out.println("Malesef bilemediniz . Dogru deger : " + deger);
			}
			
		
		
		
		
	}
}
