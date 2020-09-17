import java.util.Scanner;

public class Cozum1 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Merkezden kenara kadar olan uzaklýgý giriniz ");
		double r=scanner.nextDouble();
		double s =(2*r)*Math.sin(Math.PI/5);
		
		double alan=(int) (((5*s*s))/(4*Math.tan(Math.PI/5)) *100);
		
		
		double virgülKaydirma =alan/100;
		
		
		System.out.println("Besgenin alaný : " +virgülKaydirma);
		
	}

}
