package lesson005;

public class Question42 {

	public static void main(String[] args) {
		// verilen dizi de 0 dan küçük sayılar var ise 100 ile değiş
		//değişen idenks değişti 100 diye çıktı al
		
		
		//2. indek değişti---->100
		
		int[] sayilar= {0, 120, -5, -85, -256, 16, 1258, 81, 14};
		
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]<0) {
				sayilar[i]=100;
				System.out.println(i  + " nci indek değişti--->" + sayilar[i]);
			}
		}
		

	}

}
