import java.util.Scanner;

public class Cozum19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("surus mefasesini girin");
		double surusMesafesi = scanner.nextDouble();
		
		System.out.println("galon basina giden mil sayisini girin");
		double milBasinaGidenGalonBenzin = scanner.nextDouble();
		
		System.out.println("galon fiyatini girin ");
		double galonFiyati = scanner.nextDouble();
		
		double toplamSurusMaliyeti = (surusMesafesi / milBasinaGidenGalonBenzin) * galonFiyati;
		
		System.out.println("toplam surus maliyeti - " + toplamSurusMaliyeti);
	}

}
