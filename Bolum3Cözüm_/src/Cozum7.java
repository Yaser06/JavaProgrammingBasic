import java.util.Scanner;

public class Cozum7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Ay bilgisini giriniz : ");
		int ay = scanner.nextInt();
		System.out.println("Lütfen Yil bilgisini giriniz : ");
		int yil = scanner.nextInt();

		
		if (((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) && ay == 2) {
			System.out.println(yil + " yilinda subat ayi 29 gundur");
		} else {
		switch (ay) {
		case 1:
			System.out.println("ocak ayi " + yil + "'da 31 gundur.");
			break;
		case 2:
			System.out.println("subat ayi " + yil + "'da 28 gundur");
			break;
		case 3:
			System.out.println("mart ayi " + yil + "'da 31 gundur");
			break;
		case 4:
			System.out.println("nisan ayi " + yil + "'da 30 gundur");
			break;
		case 5:
			System.out.println("mayis ayi " + yil + "'da 31 gundur");
			break;
		case 6:
			System.out.println("haziran ayi " + yil + "'da 30 gundur.");
			break;
		case 7:
			System.out.println("temmuz ayi " + yil + "'da 31 gundur");
			break;
		case 8:
			System.out.println("agustos ayi " + yil + "'da 31 gundur");
			break;
		case 9:
			System.out.println("eylul ayi " + yil + "'da 30 gundur");
			break;
		case 10:
			System.out.println("ekim ayi " + yil + "'da 31 gundur");
			break;
		case 11:
			System.out.println("kasim ayi " + yil + "'da 30 gundur");
			break;
		case 12:
			System.out.println("aralik ayi " + yil + "'da 31 gundur");
			break;

		}}
	}

}
