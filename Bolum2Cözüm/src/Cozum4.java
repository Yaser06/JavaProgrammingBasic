import java.util.Scanner;

public class Cozum4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen bir pound de�eri yaz�n�z");
		double pound=scanner.nextDouble();
		
		double kilogram= pound*0.454;
		
		System.out.println("Kilogram degeri : " + kilogram);

	}

}
