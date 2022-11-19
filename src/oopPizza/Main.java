package oopPizza;

public class Main {

	public static void main(String[] args) {
		// pizza siparişi uygulaması
		//attrubute;
		// price ve vej mi normal mi?
		// pizza vejeteryan mı normal mi
		// vej ise fiyat 300 normal ise 200 constructor d belirle
		
		// true----normal
		// false---vej
		// sos ekle metodu---->50tl
		//peynir ekle----->100tl
		// eve sipiriş----->20tl
		//fiş al--->toplam pizza fiyatı
		
		//sosCıkar---->50 tl düş
		//pizza array i oluştur
		//oluşturduğun nesneleri array a ekle
		//400 tl den fazla olanı konsola bastır
		
		Pizza[] pizzaDizi = new Pizza[3];
		
		Pizza pizza = new Pizza(true);
		Pizza pizza2 = new Pizza(true);
		Pizza pizza3 = new Pizza(true);
		//Pizza pizza4 = new Pizza(true);
		//Pizza pizza5 = new Pizza(true);
	
		PizzaChoice.peynirEkle(pizza);
		PizzaChoice.sosEkle(pizza);
		PizzaChoice.eveSiparis(pizza);
		
		//PizzaChoice.showInfo(pizza);
		//System.out.println(pizza.getPrice());
		System.out.println("----------------------------");
		PizzaChoice.peynirCikar(pizza);
		PizzaChoice.sosCikar(pizza);
		//System.out.println(pizza.getPrice());
		
		PizzaChoice.peynirEkle(pizza2);
		PizzaChoice.sosEkle(pizza2);
		PizzaChoice.eveSiparis(pizza2);
		
		PizzaChoice.peynirEkle(pizza3);
		PizzaChoice.peynirEkle(pizza3);
		PizzaChoice.peynirEkle(pizza3);
		PizzaChoice.sosEkle(pizza3);	
		PizzaChoice.sosEkle(pizza3);
		PizzaChoice.eveSiparis(pizza3);
		
		for(int i=0; i<pizzaDizi.length;i++) {
			if(pizzaDizi[i].getPrice()<400) {
				System.out.println(pizzaDizi[i].getPrice());
			}
		}
		
//		//eğer static olmasaydı
//		PizzaChoice pizzaTercihleri = new PizzaChoice();
//		pizzaTercihleri.peynirEkle(pizza);
		
	}

}
