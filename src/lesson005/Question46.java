package lesson005;

public class Question46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ödev
		int[] sayilar= {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		
		int[] sirali=new int[9];
		int enBuyuk=sayilar[0];
		
		for(int i=0;i<sayilar.length;i++) {
			
			if(sayilar[i]>enBuyuk) {
				enBuyuk=sayilar[i];
				
			}
			
		
		}

	}

}
