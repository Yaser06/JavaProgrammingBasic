import java.util.Scanner;

public class Cozum12 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		
		System.out.println("A��rl�g�n�z� giriniz (pound) : ");
		double agirlik=scanner.nextDouble();
		double kilogram=agirlik*0.45359237;
		
		System.out.println("Boyunuzu giriniz (inch) : ");
		double uzunluk=scanner.nextDouble();
		double metre =uzunluk*0.0254;
				
		double v�c�tKitleIndexi=kilogram/(metre*metre);
		
		System.out.println("V�K :" +v�c�tKitleIndexi);
		
	}

}
