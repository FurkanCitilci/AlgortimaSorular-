package soru3;

public class Maymun extends MemeliHayvan{
	
	

	public Maymun(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() +" isimli Maymun Yürüyor");
		
	}

}
