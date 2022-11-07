package lesson005;

public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sayilar= {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		
		//bu sayı tek bu sayı çift
		//tüm sayıların toplamı
		int cift=0;
		int tek=0;
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]%2==0) {
				System.out.println(sayilar[i]  + " Sayısı çiftir" );
				 cift =cift+sayilar[i];
			}
			
			else if(sayilar[i]%2!=0) {
				System.out.println(sayilar[i]  + " Sayısı tektir" );
				tek=tek+sayilar[i];
			}
		}
		System.out.println("Toplam :" + (tek+cift));

	}

}
