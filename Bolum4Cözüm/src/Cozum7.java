import java.util.Scanner;

public class Cozum7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		String harf = scanner.nextLine();
		harf = harf.trim().toLowerCase();
		
		if(harf.equals("a") || harf.equals("b") || harf.equals("c")) {
			System.out.println("karsilik gelen rakam  - > 2");
		}else if(harf.equals("d") || harf.equals("e") || harf.equals("f")) {
			System.out.println("karsilik gelen rakam -> 3");
		}else if(harf.equals("g") || harf.equals("h") || harf.equals("i")) {
			System.out.println("karsilik gelen rakam -> 4");
		}else if(harf.equals("j") || harf.equals("k") || harf.equals("l")) {
			System.out.println("karsilik gelen rakam -> 5");
		}else if(harf.equals("m") || harf.equals("n") || harf.equals("o")) {
			System.out.println("karsilik gelen rakam -> 6");
		}else if(harf.equals("p") || harf.equals("q") || harf.equals("r") || harf.equals("s")) {
			System.out.println("karsilik gelen rakam -> 7");
		}else if(harf.equals("t") || harf.equals("u") || harf.equals("v")) {
			System.out.println("karsilik gelen rakam -> 8");
		}else if(harf.equals("w") || harf.equals("x") || harf.equals("y") || harf.equals("z")) {
			System.out.println("karsilik gelen rakam  -> 9");
		}else {
			System.out.println(harf + " gecersiz giris");
		}
	}
	}


