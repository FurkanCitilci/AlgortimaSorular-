package oopPizza;

public class Pizza {
	
	private int price;
	private boolean vegi;
	
	
	public Pizza(boolean vegi) {
		this.vegi=vegi;
		if(this.vegi) {
			this.price=300;
		}else {
			this.price=200;
		}
	
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public boolean getVegi() {
		return vegi;
	}


	public void setVegi(boolean type) {
		this.vegi = vegi;
	}
	
	
	
	

}
