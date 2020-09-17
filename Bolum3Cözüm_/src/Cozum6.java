import java.util.Scanner;

public class Cozum6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi1 = (int) (Math.random() * 100);
		int sayi2 = (int) (Math.random() * 100);
		int toplam = sayi1 + sayi2;
		System.out.println(sayi1+" + " + sayi2 +" = ?");
		System.out.println("Tahmini degeri giriniz : ");
		int tahmin=scanner.nextInt();
		
		if(toplam==tahmin) {
			System.out.println("Dogru bildiniz . ");
		}else {
			System.out.println("Yanlis bildiniz. Dogru cevap : " + toplam);
		}

	}

}
