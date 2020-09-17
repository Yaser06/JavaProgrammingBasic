import java.util.Scanner;

public class Cozum5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int a1=scanner.nextInt();
		int a2=scanner.nextInt();
		int a3=scanner.nextInt();
		int atamaSayisi ;
		
		if(a1>a2) {
		}else {
			atamaSayisi=a1;
			a1=a2;
			a2=atamaSayisi;
		}
		if(a1>a3) {
			
		}else {
			atamaSayisi=a1;
			a1=a3;
			a3=atamaSayisi;
		}
		if(a2>a3) {
			
		}else {
			atamaSayisi=a2;
			a2=a3;
			a3=atamaSayisi;
		}
		
		System.out.println(a1 + " > "+  a2  +" > "+ a3);
		
		
		
	}

}
