package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) {
		// kuyruk olustur
		//10-12 isim ekle
		//random 1-10 sayı üret, pide sayısı olsun
		Random random = new Random();
		int pide = random.nextInt(1,10);
		
		Queue<String> isimler = new LinkedList<>();
		isimler.offer("hasan");
		isimler.offer("mert");
		isimler.offer("zeynep");
		isimler.offer("ahmet");
		isimler.offer("ali");
		isimler.offer("veli");
		isimler.offer("ceren");
		isimler.offer("can");
		isimler.offer("nur");
		isimler.offer("cem");
		
		
			System.out.println("Pide alanlar");
			for(int i=0;i<=pide;i++) {
				System.out.println(isimler.poll() + " pidesini aldı");
			}
			System.out.println("Pide alamayanlar...");
			while(!isimler.isEmpty()){
				
				
				System.out.println(isimler.poll());
			}
		
		

	}

}
