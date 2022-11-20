package com.furkancitilci.odevOOP;

public class Sensor {
	
	private String gyro;
	private String anten;
	private String pusula;
	
	
	
	@Override
	public String toString() {
		return "Sensor [sensor=" + gyro + ", anten=" + anten + ", pusula=" + pusula + "]" ;
	}


	
	public Sensor(String gyro, String anten, String pusula) {
		super();
		this.gyro = gyro;
		this.anten = anten;
		this.pusula = pusula;
	}



	public String getSensor() {
		return gyro;
	}
	public void setSensor(String gyro) {
		this.gyro = gyro;
	}
	public String getAnten() {
		return anten;
	}
	public void setAnten(String anten) {
		this.anten = anten;
	}
	public String getPusula() {
		return pusula;
	}
	public void setPusula(String pusula) {
		this.pusula = pusula;
	}
	
	

}
