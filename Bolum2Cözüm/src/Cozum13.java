import java.util.Scanner;

public class Cozum13 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("�ki nokta aras� mesafe hesaplama ");
		System.out.println("L�tfen x1 degerini giriniz: ");
		double x1=scanner.nextDouble();
		System.out.println("l�tfen y1 degerini giriniz: ");
		double y1=scanner.nextDouble();
		
		System.out.println("L�tfen x2 degerini giriniz: ");
		double x2=scanner.nextDouble();
		System.out.println("L�tfen y2 degerini giriniz: ");
		double y2=scanner.nextDouble();
		
		double xfark=(x2-x1)*(x2-x1);
		double yfark=(y2-y1)*(y2-y1);
		double mesafeToplami=xfark+yfark;
		double mesafe =Math.pow(mesafeToplami, 0.5);
		System.out.println("Aralar�ndaki mesafe degeri : "+ mesafe);
	}

}
