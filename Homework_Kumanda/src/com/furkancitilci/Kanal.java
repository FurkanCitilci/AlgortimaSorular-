package com.furkancitilci;

public class Kanal {

	private String kanalAdi;
	private int kanalNo;

	public Kanal() {

	}

	public Kanal(String kanalAdi, int kanalNo) {
		super();
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
	}

	@Override
	public String toString() {
		return "Kanal [kanalAdi=" + kanalAdi + ", kanalNo=" + kanalNo + "]";
	}

	public String getKanalAdi() {
		return kanalAdi;
	}

	public void setKanalAdi(String kanalAdi) {
		this.kanalAdi = kanalAdi;
	}

	public int getKanalNo() {
		return kanalNo;
	}

	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}

}
