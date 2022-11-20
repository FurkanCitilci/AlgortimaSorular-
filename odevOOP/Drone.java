package com.furkancitilci.odevOOP;

import java.util.ArrayList;

public class Drone extends HavaArarci implements IKamera ,IStandart {
	
	private String tipi;
	private String kumanda;
	
	private ArrayList<Sensor> sensors= new ArrayList<>();  
	

	public Drone(String id, int agirlik, int menzil, String gorevAlani,String tipi,String kumanda) {
		super(id, agirlik, menzil, gorevAlani);
		this.tipi=tipi;
		this.kumanda=kumanda;
		this.sensors=sensors;
		
	}

	
	public void sensorBilgileri() {
		for (Sensor sensor : sensors) {
			System.out.println(sensor.toString());
			
		}
		
		
	}

	@Override
	public String toString() {
		return "Drone [tipi=" + tipi + ", kumanda=" + kumanda +  ", yakitTipi()=" + yakitTipi()
				+ ", motorTipi=" + motorTipi() + ", Id=" + getId() + ", Agirlik()=" + getAgirlik()
				+ ", Menzil=" + getMenzil() + ", GorevAlani=" + getGorevAlani() + "]";
	}



	public void sensoler(Sensor sensor) {
		this.sensors.add(sensor);
		
		System.out.println("Drone modeline sensorler eklendi..");
	}

	public String getTipi() {
		return tipi;
	}


	public void setTipi(String tipi) {
		this.tipi = tipi;
	}


	public String getKumanda() {
		return kumanda;
	}


	public void setKumanda(String kumanda) {
		this.kumanda = kumanda;
	}




	@Override
	public String yakitTipi() {
		// TODO Auto-generated method stub
		return "Lİ-PO Batarya";
	}


	@Override
	public String motorTipi() {
		// TODO Auto-generated method stub
		return "Elektrik Motor-Dc";
	}



	@Override
	public void fotoCek(int mesaj) {
		if(mesaj==1) {
			System.out.println("bölge fotoğrafı 100 defa çekiliyor");
		}else if(mesaj==2) {
			System.out.println("bölge fotoğrafı 200 defa çekiliyor");
		}else
			System.out.println("bölgede fotoğraf çekilmiyor");
		
		
		
	}



	@Override
	public void videoCek(boolean sitiation) {
		if(sitiation) {
			System.out.println("Bölge anlık görüntü almaktadır");
		}else {
			System.out.println("Bölge gece durumda,gece mod a geçiliyor");
			geceMod();
			System.out.println("Bölge anlık görüntü almaktadır");
		}
			
		
	}



	@Override
	public void geceMod() {
		System.out.println("Gece görüş modu açıldı...");
		
	}



	@Override
	public int maxYukseklik() {


		return 2000;
		
	}



	@Override
	public void sertifika() {
		System.out.println("SHGMI sertifikası");
		System.out.println("Güvenlik amaçlı hizmet sertifikası");
		
	}



	@Override
	public void ucusIzni() {
		System.out.println("İçişleri bakanlığı bölgesel uçuş izni");
		
	}


	
	
	
	
	

}
