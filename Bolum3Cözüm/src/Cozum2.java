import java.util.Scanner;

public class Cozum2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int ilkSayi =(int)(Math.random()*10);
		int ikinciSayi=(int)(Math.random()*10);
		int ucuncuSayi=(int)(Math.random()*10);
		
		int toplamDeger =ilkSayi+ikinciSayi+ucuncuSayi;
		System.out.println(ilkSayi+" + "+ ikinciSayi +" + "+ ucuncuSayi+ " =  ?" );
		System.out.println("Toplam degeri kactir : ");
		int tahmin =scanner.nextInt();
		
		if(tahmin==toplamDeger) {
			System.out.println("Dogru bildiniz ..");
		}else {
			System.out.println("Yanlis bildiniz. Dogru cevap :" + toplamDeger);
		}
	}

}
