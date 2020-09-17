import java.util.Scanner;

public class Cozum6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("LÜTFEN A , B , C, D, E, F HARFLERÝNDEN BÝRÝNÝ GÝRÝNÝZ");

		char ch = scanner.next().toUpperCase().charAt(0);

		if (ch == 'A') {
			System.out.println(ch + " 4 ");
		} else if (ch == 'B') {
			System.out.println(ch + " 3 ");

		} else if (ch == 'C') {
			System.out.println(ch + " 2 ");

		} else if (ch == 'D') {
			System.out.println(ch + " 1 ");

		} else if (ch == 'F') {
			System.out.println(ch + " 0 ");

		} else {
			System.out.println("Yanlis bir harf girdiniz..");
		}
	}

}
