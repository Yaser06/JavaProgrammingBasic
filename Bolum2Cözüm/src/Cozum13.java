import java.util.Scanner;

public class Cozum13 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ýki nokta arasý mesafe hesaplama ");
		System.out.println("Lütfen x1 degerini giriniz: ");
		double x1=scanner.nextDouble();
		System.out.println("lütfen y1 degerini giriniz: ");
		double y1=scanner.nextDouble();
		
		System.out.println("Lütfen x2 degerini giriniz: ");
		double x2=scanner.nextDouble();
		System.out.println("Lütfen y2 degerini giriniz: ");
		double y2=scanner.nextDouble();
		
		double xfark=(x2-x1)*(x2-x1);
		double yfark=(y2-y1)*(y2-y1);
		double mesafeToplami=xfark+yfark;
		double mesafe =Math.pow(mesafeToplami, 0.5);
		System.out.println("Aralarýndaki mesafe degeri : "+ mesafe);
	}

}
