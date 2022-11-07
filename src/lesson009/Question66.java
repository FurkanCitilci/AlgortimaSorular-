package lesson009;

public class Question66 {
	static String[] iller ={"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
	        "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
	        "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
	        "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
	        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
	        "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
	        "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
	        "Kilis", "Osmaniye", "Düzce" };

	public static void main(String[] args) {
		
		//ikinci harfi a olanların ilk değeri ve ilk 3 harfi büyük olarak yaz
		//Çankırı---->Çan
		//ikinciHarfeGoreSorgulama metot, donüş tipi yok, paramatre almasına gerek yok
 
		
		
		ikinciHarfeGoreSorgulama();
		
	}
	
	public static void ikinciHarfeGoreSorgulama() {
		
		for (int i = 0; i < iller.length; i++) {
			
			if(iller[i].charAt(1)=='a') {
				System.out.println(iller[i] + "-----> " + iller[i].substring(0,3).toUpperCase());
			
		}
			
				
		}
		
	}

}
