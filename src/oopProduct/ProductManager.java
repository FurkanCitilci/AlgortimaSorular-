package oopProduct;

public class ProductManager {
	
	public static void showInfo(Product product) {
		
		System.out.println("ID: " + product.getId() 
						+ " Price: " + product.getPrice() 
						+ " Stok: " + product.getStock() 
						+ " Name: " + product.getName());
		
	}
	
	//veri tabanına kaydet
	// asus veri tabanına kaydedildi
	
	public static void saveData(Product product) {
		System.out.println(product.getName() + "------> Veri tabanına kaydelidi");
	}
	
	public static void sepeteEkle(Product product) {
		System.out.println(product.getName() + "------> Sepete Eklendi");
	}
	
	public  void proNameUpdate(Product product ,String yeniIsım) {
		product.setName(yeniIsım);
		
		
	}

}
