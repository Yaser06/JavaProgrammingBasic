import java.util.Scanner;

public class Cozum1 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Denklemin k�klerini s�rayla giriniz a : b : c  olarak ");
		double a =scanner.nextDouble();
		double b =scanner.nextDouble();
		double c =scanner.nextDouble();
		double birinciK�k;
		double ikinciK�k ;
		double tekK�k;
		
		System.out.println(a+"x2 + "+b+"x + "+c+" denklemi ");
		double diskriminant =(b*b)-(4*(a*c));
		
		if (diskriminant>0) {
			
			System.out.println("Denklemin iki k�k� vardir.");
			birinciK�k = (-b + (Math.pow(diskriminant, 0.5) ) )/(2*a);
			ikinciK�k =(-b - (Math.pow(diskriminant, 0.5) ) )/(2*a);
			System.out.println("Denklemin birinci k�k� : "+ birinciK�k + "  Denklemin ikinci k�k� : "+ ikinciK�k);
			
		}else if (diskriminant==0) {
			System.out.println("Denklemin bir k�k� vardir.");
			tekK�k =-b / (2*a);
			System.out.println("Denklemin tek k�k� : "+ tekK�k);
		}else {
			System.out.println("Denklemin k�k� yoktur.");
		}
		
		
		
		
	}

}
