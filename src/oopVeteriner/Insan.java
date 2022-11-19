package oopVeteriner;

public abstract class Insan {
	
	private String name;
	private String tcKimlikNo;
	
	
	
	
	
	public Insan(String name, String tcKimlikNo) {
		super();
		this.name = name;
		this.tcKimlikNo = tcKimlikNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public abstract void bilgileriGoster();
	
	@Override
	public String toString() {
		return  "Insan [name=" + name + ", tcKimlikNo=" + tcKimlikNo + "]";
	}
	
	
	

}
