package lesson005;

public class Question46Iki {

	public static void main(String[] args) {
		
		int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
		 
        for (int i = 0; i < liste.length-1; i++) { //Dizimizin değerlerini sırası ile alıyoruz
 
            int sayi = liste[i]; //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i; //sayi 'nin indeksini temp değerine atıyoruz
 
            for (int j = i+1; j < liste.length ; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                if(liste[j]<sayi){ //sayi değişkeninden küçük sayı var mı
                    sayi = liste[j]; //varsa sayi değişkenimizide değiştiriyoruz
                    temp = j; //indeks değerinide değiştiriyoruz
                }
            }
 
            if(temp != i){ //temp değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                liste[temp] = liste[i];
                liste[i] = sayi;
            }
 
        }
 
        for (int sayi:liste) {
            //Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
            System.out.println(sayi);
 
        }
		
		
	}

}


