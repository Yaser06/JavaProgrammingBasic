import java.util.Scanner;

public class Cozum3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("0 �LE 127 ARASINDA B�R SAYI G�R�N�Z ");
		int c=scanner.nextInt();
		if(0 <= c && c <=127) {
			char ch=(char)c;
			System.out.println("Girilen sayini ascii karsiligi: " + ch);
		}else {
			System.out.println(" L�tfen 0 ile 127 aras�nda bir sayi giriniz .");
		}
		
		
	}

}
