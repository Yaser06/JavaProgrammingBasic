import java.util.Scanner;

public class Cozum2 {

	public static void main(String[] args) {

			Scanner scanner =new Scanner(System.in);
			
			System.out.println("l�tfen bir yar� �ap de�eri giriniz ");
			double yaricap=scanner.nextDouble();
			
			System.out.println("L�tfen bir y�kseklik de�eri giriniz ");
			double y�kseklik=scanner.nextDouble();
			
			double alan=yaricap*yaricap*Math.PI;
			double hacim=alan*y�kseklik;
			
			System.out.println("Silindirin alan� : "+ alan);
			
			System.out.println("Silindirin hacmi: " + hacim );
	}

}
