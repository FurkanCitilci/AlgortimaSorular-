package soru3;

public class Aslan extends MemeliHayvan{
	

	public Aslan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() +" Kükrüyor...");
		
	}

	@Override
	public void yuru() {


		System.out.println(this.getAd() +" isimli Aslan Yürüyor");
		
	}

	
	

}
