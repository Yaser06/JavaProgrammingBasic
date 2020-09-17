
public class Cozum10 {

	public static void main(String[] args) {
		int rasgeleBirSayi= 1000 + (int) (Math.random() * (9999 - 1000));
		
		int harf1= 65 + (int) (Math.random() * (91 - 65));
		char harf1Ch= (char)harf1;
		
		int harf2=65 + (int) (Math.random() * (91 - 65));
		char harf2Ch=(char)harf2;
		
		int harf3=65 + (int) (Math.random() * (91 - 65));
		char harf3Ch=(char)harf3;		
		
		System.out.println("YENÝ PLAKA : " +rasgeleBirSayi+"  " + harf1Ch+harf2Ch+harf3Ch);
	}

}
