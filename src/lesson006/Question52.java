package lesson006;

import java.util.Iterator;

public class Question52 {

	public static void main(String[] args) {
		// Tek sayıları ayrı bir diziye yazdır

		int[][] matris = { { 56, 23, 678, 231, 5 }, 
						   { 234, 21, 78, 26, 6 }, 
						   { 654, 33, 32, 67, 2 },
						   { 189, 35, 56, 89, 8 }};
		
		
		int[] tekSayilar=new int[matris.length * matris[0].length];
		int k=0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j <matris[i].length; j++) {
				if(matris[i][j]%2!=0) {
					tekSayilar[k]=matris[i][j]; 
					k++;
					
				}			
				
			}
			
		}
		for (int i = 0; i < k; i++) {
			
			System.out.print(tekSayilar[i] + " ");
			
		}

	}

}
