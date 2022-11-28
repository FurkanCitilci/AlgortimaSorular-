package soru1;

public class Rehber {
	
	private String adSoyad;
	private String sehir;
	private int id;
	
	
	
	
	
	@Override
	public String toString() {
		return "Rehber [ad=" + adSoyad + ", soyAd=" + sehir + ", id=" + id + "]";
	}
	
	public String istenilenRehber() {
		
		return "Rehber [ad=" + adSoyad + ", soyAd=" + sehir + ", id=" + id + "]";
	}


	public Rehber(String ad, String soyAd, int id) {
		super();
		this.adSoyad = ad;
		this.sehir = soyAd;
		this.id = id;
	}
	
	
	public String getAd() {
		return adSoyad;
	}
	public void setAd(String ad) {
		this.adSoyad = ad;
	}
	public String getSoyAd() {
		return sehir;
	}
	public void setSoyAd(String soyAd) {
		this.sehir = soyAd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
