package oop2;

public class Araba {
	
	public String marka;
	public String renk;
	public String motorTipi;
	public String model;
	public String motorHacmi;
	public String motorGucu;
	
	
	public static int arabaYasi(int model) {
		int yil=2022;
		
		return yil - model;
	}
	
	public void arabaBilgileri(String[] araba) {
		
		for(String item : araba) {
			System.out.println(item);
		}
	}
	

}


