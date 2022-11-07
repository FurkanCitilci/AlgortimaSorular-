package lesson006;

import java.util.Scanner;

public class Question50 {

	public static void main(String[] args) {
		// 2*2 matris tanımlama
		// bunların içine isim alacağız
		//isimleri dışardan al
		
		//çıktı;
		//1. grup
		//Ahmet
		//mehmet
		
		//2.grup
		//aslı
		//zeynep
		
		String[][] sinif= new String[2][2];
		Scanner scanner=new Scanner(System.in);
		int grup=1;
		for (int i = 0; i < sinif.length; i++) {
			for (int j = 0; j < sinif[i].length; j++) {
				
				System.out.println("Lütfen Kişi ismini giriniz");
				
				sinif[i][j]=scanner.nextLine();;
				
			}
								
		}
		for (int i = 0; i < sinif.length; i++) {
			System.out.println();
			System.out.print(i+1 + ". Grup-----");
			System.out.println();
			for (int j = 0; j < sinif[i].length; j++) {
				
				System.out.print(sinif[i][j] + " ");
				
			}
			
		}
	}
}
		
		

