package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek {

	public static void main(String[] args) {
		
		//string kuyruğu oluştur
		//kuyruğun içine isim al
		//elemanları yazdır
		
		//kuyruk boşalana kadar elemanları çıkar
		//çıkarılan elemanları yazdır
		
		Queue<String> isimler = new LinkedList<>();
		isimler.offer("hasan");
		isimler.offer("mert");
		isimler.offer("mehmet");
		isimler.offer("ahmet");
		
		System.out.println(isimler);
		
		while(!isimler.isEmpty()) {
			System.out.println(isimler.poll());
		}
		
		System.out.println(isimler);
		

	}

}
