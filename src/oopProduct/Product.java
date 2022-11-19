package oopProduct;

public class Product {
	
	//Attribute, property, field
	//üye değişken
	//sınıf değişkenleri
	private String id;
	private String name;
	private double price;
	private int stock;
	
	//method overloading
	public Product() {
		
	}
	
	public Product(String id,  String name ) {
		
		this.id=id;
		this.name=name;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void bilgileriGetir() {
		System.out.println("ID: " + this.id + " Price: " + this.price + " Stok: " + this.stock + " Name: " + this.name);
	}

	

}
