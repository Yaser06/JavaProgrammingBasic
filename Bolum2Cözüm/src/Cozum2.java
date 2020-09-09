import java.util.Scanner;

public class Cozum2 {

	public static void main(String[] args) {

			Scanner scanner =new Scanner(System.in);
			
			System.out.println("lütfen bir yarý çap deðeri giriniz ");
			double yaricap=scanner.nextDouble();
			
			System.out.println("Lütfen bir yükseklik deðeri giriniz ");
			double yükseklik=scanner.nextDouble();
			
			double alan=yaricap*yaricap*Math.PI;
			double hacim=alan*yükseklik;
			
			System.out.println("Silindirin alaný : "+ alan);
			
			System.out.println("Silindirin hacmi: " + hacim );
	}

}
