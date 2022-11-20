package com.furkancitilci.odevOOP;

public class Koltuk {
	
	private int firstClass;
	private int econmy;
	private int bussines;
	
	
	
	
	public Koltuk(int firstClass, int econmy, int bussines) {
		super();
		this.firstClass = firstClass;
		this.econmy = econmy;
		this.bussines = bussines;
	}
	
	
	public int getFirstClass() {
		return firstClass;
	}
	public void setFirstClass(int firstClass) {
		this.firstClass = firstClass;
	}
	public int getEconmy() {
		return econmy;
	}
	public void setEconmy(int econmy) {
		this.econmy = econmy;
	}
	public int getBussines() {
		return bussines;
	}
	public void setBussines(int bussines) {
		this.bussines = bussines;
	}
	
	

}
