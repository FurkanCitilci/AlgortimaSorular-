package com.furkancitilci.odevOOP;

public class Main {
	
	 

	public static void main(String[] args) {
		
		Sensor sensor = new Sensor("gyro","anten","pusula");
		Drone drone = new Drone("12358", 12, 8, "güvenlik", "Quadcopter", "otonom") ;
		drone.sensoler(sensor);
		
		System.out.println(drone.toString());
		drone.sensorBilgileri();
		drone.fotoCek(1);
		drone.videoCek(true);
		
		
		Helikopter helikopter = new Helikopter("998498", 7500, 3, "sağlık", 4,2);
		helikopter.kapasiteArtir(helikopter, 16);
		System.out.println(helikopter.getKapasite());
		
		
		Ucak ucak = new Ucak("64984", 24500, 12000, "SİVİL", 120, 100, "Airbus");
		ucak.oturmaBolumu(new Koltuk(0, 0, 0));
		
	

	}

}
