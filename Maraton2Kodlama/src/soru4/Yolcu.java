package soru4;

import java.util.Random;

public abstract class Yolcu {
	
	private int id;
	private String ad;
	private String soyAd;
	private int koltukNo;
	private boolean checkIn;
	private final static int BASEFIYAT=100;
	
	public abstract void yolcuBilgileriniGetir();
	public abstract void biletAl(EFirmaAdi firmaAdi);
	public abstract void checkInYap();
	public abstract void ucagaBin();
	
	public Yolcu(int id, String ad, String soyAd) {
		super();
		Random random = new Random();
		int koltukNu= random.nextInt(1,100);
		this.id = id;
		this.ad = ad;
		this.soyAd = soyAd;
		this.koltukNo = koltukNu;
		this.checkIn = false;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyAd() {
		return soyAd;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public int getBASEFIYAT() {
		return BASEFIYAT;
	}
	
	

}
