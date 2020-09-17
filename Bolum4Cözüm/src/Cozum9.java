import java.util.Scanner;

public class Cozum9 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen dersi seciniz..");
		System.out.println("Matematik icin = M ");
		System.out.println("Bilgisayar bilimleri icin = C");
		System.out.println("Bilgi Teknolojileri icin =I");
		System.out.println("Ders secimi icin Harfi yaziniz..");
		char ch=scanner.next().charAt(0);
		
		System.out.println("Lütfen kacinci sinif oldugunuzu giriniz.(1,2,3,4) ");
		int sinif=scanner.nextInt();
		
		if (ch=='M' || ch=='C' || ch=='I') {
			System.out.print(ch);
		}else {
			System.out.println("Yanlis ders secimi yaptiniz.Düzgün harf giriniz.");
		}
		if(sinif==1 || sinif==2 || sinif == 3 || sinif ==4) {
			System.out.println(sinif);
		}else {
			System.out.println("Gecerli bir sayi degeri giriniz...");
		}
	}
}
