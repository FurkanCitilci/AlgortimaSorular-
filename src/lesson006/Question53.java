package lesson006;

public class Question53 {

	public static void main(String[] args) {
		// bir dizide ard arda gelen iki indeksdeki sayı 2 ise true
		//yoksa false 
		
		int[] sayilar= {2, 2, 4, -256, 1258, 32};
		boolean flag=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if(sayilar[i]==2 && sayilar[i+1]==2) {
				flag=true;
			}
				
			
				
			
		}
		System.out.println(flag);
	}

}
