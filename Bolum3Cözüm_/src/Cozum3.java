
public class Cozum3 {

	public static void main(String[] args) {

		int aralikliSayi = (int) (((11 + 1) * Math.random()) + 1);
		System.out.print(aralikliSayi +".Ay :  ");

		switch (aralikliSayi) {
		case 1:
			System.out.println("OCAK");
			break;
		case 2:
			System.out.println("SUBAT");
			break;
		case 3:
			System.out.println("MART");
			break;
		case 4:
			System.out.println("NÝSAN");
			break;
		case 5:
			System.out.println("MAYIS");
			break;
		case 6:
			System.out.println("HAZÝRAN");
			break;
		case 7:
			System.out.println("TEMMUZ");
			break;
		case 8:
			System.out.println("AGUSTOS");
			break;
		case 9:
			System.out.println("EYLÜL");
			break;
		case 10:
			System.out.println("EKÝM");
			break;
		case 11:
			System.out.println("KASIM");
			break;
		case 12:
			System.out.println("ARALIK");
			break;
		default:
			break;
		}

	}
}
