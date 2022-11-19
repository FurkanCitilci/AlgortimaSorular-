package oop3;

public class Hayvan {

	// ad a herkes ulaşsın
	// tür e sadece kendi paketi ulaşsın
	//familyasına herkes ulaşsın4
	//ayak sayısına herkes ulaşsın
	//tüy rengini sadece hayvan bilsin
	
	public String hayvanAd;
	protected String hayvanTur;
	public String familya;
	public int ayakSayisi;
	private String tuyRengi;
	
	public void bilgileriGoster() {
		System.out.println("Hayvanın adı:" + hayvanAd 
						+ "\nHyavan Türü:" + hayvanTur
						+ "\nFamilyası:  ");
	}

}
