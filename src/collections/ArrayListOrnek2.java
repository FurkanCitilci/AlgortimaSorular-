package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {
		// bir tane cift sayılar arraylisti
		//bir de tek sayılar arraylisti
		
		//1 den 100 e kadar random sayı üret
		// tek teke
		//çif çifte ekle
		
		ArrayList<Integer> tekler = new ArrayList<>();
		ArrayList<Integer> ciftler = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i=0; i<35;i++) {
			int sayi = random.nextInt(100);
			
			if(sayi%2==0) {
				ciftler.add(sayi);
				
			}else {
				tekler.add(sayi);
				
			}
				
		}
		System.out.println(ciftler);
		System.out.println(tekler);
	
			
		
	
		
		

	}

}
