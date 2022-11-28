package streamApi;

public class Kisi {

	private String name;
	private int age;
	private ECinsiyet cinsyiye;
	
	
	public Kisi(String name, int age, ECinsiyet cinsyiye) {
		super();
		this.name = name;
		this.age = age;
		this.cinsyiye = cinsyiye;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public ECinsiyet getCinsyiye() {
		return cinsyiye;
	}


	public void setCinsyiye(ECinsiyet cinsyiye) {
		this.cinsyiye = cinsyiye;
	}


	@Override
	public String toString() {
		return "Kisi [name=" + name + ", age=" + age + ", cinsyiye=" + cinsyiye + "]";
	}
	
	
	public void elliYasUstuMesaji() {
		System.out.println(getName() + "50 yaş üstüdür");
	}
	
	
	
}
