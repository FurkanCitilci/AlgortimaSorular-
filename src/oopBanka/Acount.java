package oopBanka;

import java.util.Random;

public class Acount {
	
	private final String acountNo;
	private int money;
	private int istenenKredi;
	private boolean krediBasvurus; 
	private int krediNotu;
	
	
	
	
	
//	public Acount(String acountNo) {
//		this.setAcountNo="5615666";
//		
//	}
//	
	
	public int getKrediNotu() {
		return krediNotu;
	}


	public void setKrediNotu(int krediNotu) {
		this.krediNotu = krediNotu;
	}


	public Acount() {
		
		Random random = new Random();
		int acountNo1=random.nextInt(99999 - 10000)+10000;
		String acountNoS=Integer.toString(acountNo1);
		this.acountNo = acountNoS;
		
	}


	public Acount(String acountNo, int money) {
		this.acountNo=acountNo;
		this.money=money;
	
	}


	public int getIstenenKredi() {
		return istenenKredi;
	}


	public void setIstenenKredi(int istenenKredi) {
		this.istenenKredi = istenenKredi;
	}


	public boolean isKrediBasvurus() {
		return krediBasvurus;
	}


	public void setKrediBasvurus(boolean krediBasvurus) {
		this.krediBasvurus = krediBasvurus;
	}
	
	
	public String getAcountNo() {
		return acountNo;
	}
	
//	public void setAcountNo(String acountNo) {
//		this.acountNo = "5615666";
//	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	

}
