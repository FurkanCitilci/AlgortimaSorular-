package oopProduct;

public class Main {

	public static void main(String[] args) {
		//id, price, stock, name olan product sınıf yazalım
		
		//products array i oluştur onun içine at
		
		//farklı pakette sınıf oluştur
		//o sınıfın içinde random ıd üret
		
		Product product1 = new Product();
		
	
		String randomId=util.GenerateRandomId.generateId();
		product1.setName("Asus");
		product1.setId(randomId);
		product1.setPrice(3500);
		product1.setStock(100);
		
		Product product2 = new Product();
		
		randomId=util.GenerateRandomId.generateId();
		product2.setName("Apple");
		product2.setId(randomId);
		product2.setPrice(5500);
		product2.setStock(200);
		
		Product[] products = {product1, product2};
		
		
		
		for(Product item: products) {
			item.bilgileriGetir();

		}
		System.out.println("==========================");
		
		for(int i=0; i<products.length;i++) {
			products[i].bilgileriGetir();
		}
		
		System.out.println("==========================");
		
		ProductManager.showInfo(product2);
		ProductManager.saveData(product2);
		ProductManager.sepeteEkle(product2);
		//ProductManager.proNameUpdate(product2.setName("Applem"));
		ProductManager.showInfo(product2);
		
		ProductManager manager = new ProductManager();
		manager.proNameUpdate(product2, "HP");
		System.out.println("Değişen isim :" + product2.getName());
		ProductManager.showInfo(product2);
		//static olmasaydı..... nesne üzerinden ulaşmam lazım
		// static olduğunda sınıf la ulaşabiirz
//		Product manager = new Product();
//		manager.showInfo(product2);
//		manager.saveData(product2);
//		manager.sepeteEkle(product2);
		
		//ürün ismini güncelle metodu
		// apple ----->applem2
	}

}
