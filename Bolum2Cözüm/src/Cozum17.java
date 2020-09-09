import java.util.Scanner;

public class Cozum17 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bakiye ve yillik faiz oranini girin");
		
		double bakiye = scanner.nextDouble();
		double yillikFaizOrani = scanner.nextDouble();
		
		double faizGetirisi = bakiye * (yillikFaizOrani / 1200);
		
		System.out.println("faiz orani : " + faizGetirisi);
	}

}
