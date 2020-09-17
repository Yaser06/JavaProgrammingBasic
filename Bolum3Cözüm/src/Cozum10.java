import java.util.Scanner;

public class Cozum10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = (int) (Math.random() * 3);
		System.out.println("Makas =0 ,Tas=1 , Kagıt=2 ");
		System.out.println("Lütfen Seçmek için  bir sayi degeri giriniz: ");
		int secim = scanner.nextInt();

		if (secim == number) {
			System.out.println("Berabere kaldiniz ..");
		} else if ((number == 0 && secim == 1) || (number == 1 && secim == 2) || (number == 2 && secim == 0)) {
			System.out.println("Kazandınız..");
		} else if(secim>2) {
			System.out.println("0 ile 2 arasında bir sayi seciniz..");
		}else {
			System.out.println("Kaybettiniz..");
		}

		switch (number) {
		case 0:
			System.out.println("Bilgisayar makas secti");
			break;
		case 1:
			System.out.println("Bilgisayar tas secti");
			break;
		case 2:
			System.out.println("Bilgisayar kagıt secti");
			break;

		default:
			break;
		}
	}

}
