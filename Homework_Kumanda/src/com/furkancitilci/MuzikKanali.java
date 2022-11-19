package com.furkancitilci;

public class MuzikKanali extends Kanal {

	public MuzikKanali(String kanalAdi, int kanalNo) {
		super(kanalAdi, kanalNo);

	}

	//Muzik kanalı bilgileri alındı
	@Override
	public String toString() {
		return "MuzikKanali\n[Kanal ADI:" + getKanalAdi() + " Kanal No:" + getKanalNo() + "]";
	}

	
	
}
