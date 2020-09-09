
public class Cozum11 {

	public static void main(String[] args) {

		int dogum = 7;
		int olum = 13;
		int gocmen = 45;

		int nufus = 312_032_486;

		double yildakiSaniye = (365 * 24 * 60 * 60);

		double yildakiDogum = yildakiSaniye / dogum;
		double yildakiOlum = yildakiSaniye / olum;
		double yildakiGocmen = yildakiSaniye / gocmen;

		double birinciYilToplamNufus = (nufus + yildakiDogum - yildakiOlum + yildakiGocmen);
		double ikinciYildaToplamNufus = (birinciYilToplamNufus + yildakiDogum - yildakiOlum + yildakiGocmen);
		double ucuncuYildakiToplamNufus = (ikinciYildaToplamNufus + yildakiDogum - yildakiOlum + yildakiGocmen);
		double dorduncuYildakiToplamNufus = (ucuncuYildakiToplamNufus + yildakiDogum - yildakiOlum + yildakiGocmen);
		double besinciYildakiToplamNufus = (dorduncuYildakiToplamNufus + yildakiDogum - yildakiOlum + yildakiGocmen);

		System.out.println("bir yil sonra toplam nufus  : " + (int) birinciYilToplamNufus);
		System.out.println("iki yil sonra toplam nufus  : " + (int) ikinciYildaToplamNufus);
		System.out.println("uc yil sonra toplam nufus   : " + (int) ucuncuYildakiToplamNufus);
		System.out.println("dort yil sonra toplam nufus : " + (int) dorduncuYildakiToplamNufus);
		System.out.println("bes yil sonra toplam nufus  : " + (int) besinciYildakiToplamNufus);

	}

}
