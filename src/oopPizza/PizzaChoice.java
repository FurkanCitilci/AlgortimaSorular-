package oopPizza;

import oopProduct.Product;

public class PizzaChoice {
	
	private int toplam;
	
	public static void sosEkle(Pizza pizza) {
		
		System.out.println("Sos Eklendi.... + 50 TL");
		pizza.setPrice(pizza.getPrice()+50);
		

	}
	
	public static void peynirEkle(Pizza pizza) {
		
		System.out.println("Peynir Eklendi.... + 100 TL");
		pizza.setPrice(pizza.getPrice()+100);
	}
	
	public static void eveSiparis(Pizza pizza) {
		
		System.out.println("Kargo Ücreti.... + 20 TL");
		pizza.setPrice(pizza.getPrice()+20);
		
	}

	public static void showInfo(Pizza pizza) {

		
		System.out.println("Toplam fişiniz : " + pizza.getPrice());

	}
	
	public static void urunCikar(Pizza pizza) {
		
		System.out.println("Kargo Ücreti.... + 20 TL");
		pizza.setPrice(pizza.getPrice()+20);	

	}
	
	public static void sosCikar(Pizza pizza) {
		
		System.out.println("Sos Çıkarıldı.... - 50 TL");
		pizza.setPrice(pizza.getPrice()-50);
		

	}
	
	public static void peynirCikar(Pizza pizza) {
		
		System.out.println("Peynir Çıkarıldı.... - 100 TL");
		pizza.setPrice(pizza.getPrice()-100);
		

	}

}
