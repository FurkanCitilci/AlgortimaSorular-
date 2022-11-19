package com.furkancitilci;

import java.util.ArrayList;
import java.util.Random;

public class Televizyon {

	private Kanal kanal = new Kanal();
	private String marka;
	private ArrayList<Kanal> kanallar = new ArrayList<>();
	private String boyut;
	private int ses;

	public void televizyonKapat() {
		if (Main.tvAcik == true) {
			System.out.println("Televizyon kapatılıyor...");
			Main.tvAcik = false;

		}

	}

	public void televizyonAc() {
		if (this.marka == null && this.boyut == null) {
			System.out.println("Lütfen önce Tv yi kurun ve kanalları oluşturun!!!");

		} else {
			System.out.println("Tv açıldı...");
			Main.tvAcik = true;
		}

	}

	public void kanalBilgisi() {
		for (Kanal kanal : kanallar) {
			if(kanal.getClass() == HaberKanali.class) {
				System.out.println("Haber Kanalları:");
				System.out.println(kanal.toString());
			}else {
				System.out.println("Müzik Kanalları:");
				System.out.println(kanal.toString());
				
			}
				
			

		}
	}

 
	public void kanalDegis(int kanalNo) {
		
		 if (kanal.getKanalNo() == kanalNo) {
			System.out.println("zaten aynı kanaldasınız");
		} 
		else if(kanal.getKanalNo() != kanalNo) {
			for (int i = 0; i < kanallar.size(); i++) {
				if (kanallar.get(i).getKanalNo() == kanalNo) {

					kanal.setKanalAdi(kanallar.get(i).getKanalAdi());
					kanal.setKanalNo(kanallar.get(i).getKanalNo());
					System.out.println(
							"Kanal: " + kanallar.get(i).getKanalNo() + " Bilgi:" + kanallar.get(i).getKanalAdi());

				}else
					System.out.println("Kanal bilgisi bulunamamışır");
				
			}

		}

	}

	public void sesKis() {

		if (Main.tvAcik == false) {
			System.out.println("Televizyon açık değil...");

		} else {
			if (this.getSes() == 0) {

			} else
				this.setSes(getSes() - 1);

		}

	}

	public void sesAc() {

		if (Main.tvAcik == false) {
			System.out.println("Televizyon açık değil...");

		} else {
			this.setSes(getSes() + 1);

		}

	}

	public void televizyonuKur(String marka, String boyut) {

		if (this.marka == null && this.boyut == null) {
			this.marka = marka;
			this.boyut = boyut;

		} else
			System.out.println("Televizyonunuz daha önce: " + toString()
					+ " olarak kuruldu!!!, tekrar kurmak için çıkış yapınız.");

	}

	public void kanallariOlustur(Kanal kanal) {
		this.kanallar.add(kanal);

	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public int getSes() {
		return ses;
	}

	public void setSes(int ses) {
		this.ses = ses;
	}

	@Override
	public String toString() {
		return "Televizyon [marka=" + marka + ", boyut=" + boyut + "]";
	}

}
