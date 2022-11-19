package com.furkancitilci;

public class HaberKanali extends Kanal {

	public HaberKanali(String kanalAdi, int kanalNo) {
		super(kanalAdi, kanalNo);

	}

	
	//haber kanalı bilgileri alındı
	@Override
	public String toString() {
		
		return "HaberKanali\n[Kanal ADI:" + getKanalAdi() + ", Kanal No:" + getKanalNo() + "]";
		
	}
	
	

}
