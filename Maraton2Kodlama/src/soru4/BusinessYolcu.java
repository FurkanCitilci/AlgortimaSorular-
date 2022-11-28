package soru4;

import java.util.HashMap;

public class BusinessYolcu extends Yolcu {

	private final static int BUSINNESSFIYAT = 200;
	private final static int BUSINNESSVIPFIYAT = 150;
	private boolean tur;
	HashMap<EFirmaAdi, Integer> hashMap = new HashMap<EFirmaAdi, Integer>();

	public BusinessYolcu(int id, String ad, String soyAd, boolean tur) {
		super(id, ad, soyAd);
		this.tur = tur;

	}

	public static int getBusinnessfiyat() {
		return BUSINNESSFIYAT;
	}

	public static int getBusinnessvipfiyat() {
		return BUSINNESSVIPFIYAT;
	}

	@Override
	public void yolcuBilgileriniGetir() {

		System.out.println("Yolcu bilgileri-----> Bussines Yolcusu " + getAd() + "Biletleri: " + hashMap);

	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {

		if (this.getCheckIn()) {
			System.out.println("Daha önce bilet aldınız, ve check in yaptınız");

		} else {

			if (tur) {
				int toplam = this.getBASEFIYAT() + getBusinnessfiyat() + getBusinnessvipfiyat();
				hashMap.put(firmaAdi, toplam);
				System.out.println(getAd() + " adlı yolcu için " + firmaAdi + " VIP bilet almıştır----->" + hashMap);

			} else {

				int toplam = this.getBASEFIYAT();
				hashMap.put(firmaAdi, toplam);

			}

		}

	}

	@Override
	public void checkInYap() {

		if (getCheckIn()) {
			System.out.println("Daha önce checkIn yaptınız uçağa geçebilirsiniz");
		} else {

			setCheckIn(true);
			System.out.println("Check in yapıldı iyi uçuşlar...");

		}

	}

	@Override
	public void ucagaBin() {

		if (getCheckIn()) {
			System.out.println(getAd() + " " + getKoltukNo() + " numaralı koltkta ucağa binebilirsiniz");
		} else
			System.out.println("Uçağa binmek için lütfen checkIn yapınız!!!!");

	}

}
