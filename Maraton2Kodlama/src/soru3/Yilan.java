package soru3;

public class Yilan extends Surungen {
	

	public Yilan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() +" Tıslama sesi çıkarıyor");
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() +" isimli Yılan Sürünerek gidiyor");
		
	}

}
