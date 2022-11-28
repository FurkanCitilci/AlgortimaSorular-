package collections;

import java.util.ArrayList;

public class ArrayListOrnek {

	public static void main(String[] args) {


		//bir tane arraylistolustur
		//içine birkaç tane şehir at
		//liste içinde an ile başlayan şehir varsa xxx ile değiştir
		
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("ankara");
		sehirler.add("sivas");
		sehirler.add("antep");
		
		for (int i=0;i<sehirler.size();i++) {
			
			if(sehirler.get(i).startsWith("an")) {
				//sehirler.get(i).replace(sehirler.get(i), "xxx");
				sehirler.set(i, "xxx");
			}
			System.out.println(sehirler);
			
		}

	}

}
