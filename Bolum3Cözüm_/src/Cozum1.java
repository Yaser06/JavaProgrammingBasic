import java.util.Scanner;

public class Cozum1 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Denklemin köklerini sýrayla giriniz a : b : c  olarak ");
		double a =scanner.nextDouble();
		double b =scanner.nextDouble();
		double c =scanner.nextDouble();
		double birinciKök;
		double ikinciKök ;
		double tekKök;
		
		System.out.println(a+"x2 + "+b+"x + "+c+" denklemi ");
		double diskriminant =(b*b)-(4*(a*c));
		
		if (diskriminant>0) {
			
			System.out.println("Denklemin iki kökü vardir.");
			birinciKök = (-b + (Math.pow(diskriminant, 0.5) ) )/(2*a);
			ikinciKök =(-b - (Math.pow(diskriminant, 0.5) ) )/(2*a);
			System.out.println("Denklemin birinci kökü : "+ birinciKök + "  Denklemin ikinci kökü : "+ ikinciKök);
			
		}else if (diskriminant==0) {
			System.out.println("Denklemin bir kökü vardir.");
			tekKök =-b / (2*a);
			System.out.println("Denklemin tek kökü : "+ tekKök);
		}else {
			System.out.println("Denklemin kökü yoktur.");
		}
		
		
		
		
	}

}
