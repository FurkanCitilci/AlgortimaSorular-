package odevler;

import java.util.Scanner;

public class Odev1Devam {
	public static void main(String[] args) {
		//2- bu sefer hem kilo hem gezegen girdisi alıyoruz girdiğimiz gezegen değerine göre ekrana yazdırıyo
		
				// 1- ay
				// 2- Saturn
				// 3- Mart
				// 4- Venüs
				
				//input --> kg girin, (75)
				//input --> gezegen adı girin (ay)
				//output--> aydaki kilonuz 85
		// Ağırlık = kütle * yerçekimi
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kütlenizi Giriniz:");
		
		
		float kutle=scanner.nextFloat();    // kg cinsinden kütle girilir
		float agirlik=kutle/(9.81f);				//kütlesi girilen değerin Evrende ki ağırlığı hesaplanır
		
		System.out.println("Ağırlığınız:" + agirlik);
		
		System.out.println("1-Ay:");
		System.out.println("2-Marrs:");
		System.out.println("3-Venüs:");
		System.out.println("4-Jupiter:");
		System.out.println("5-Satürn:");
		
		System.out.println("Gezegenlerden Birini Seçiniz...");
		
		int tercih=scanner.nextInt();
		
		float kutleAy=agirlik*1.62f;
		float kutleMars=agirlik*3.721f;
		float kutleVenus=agirlik*8.87f;
		float kutleJupiter=agirlik*24.79f;
		float kutleSaturn=agirlik*10.44f;
		
		if(tercih==1) {
			System.out.println("Ayda ki Kütleniz:" + kutleAy);
		}
		else if(tercih==2) {
			System.out.println("Marsda ki Kütleniz:"+ kutleMars);
		}
		else if(tercih==3) {
			System.out.println("Venüsde ki Kütleniz:" + kutleVenus);
		}
		else if(tercih==4) {
			System.out.println("Jupiterde ki Kütleniz:" + kutleJupiter);
		}
		else if(tercih==5) {
			System.out.println("Satürnde ki Kütleniz:" +  kutleSaturn);
		}
		else
			System.out.println("Yanlış Tercih Yaptınız");
		
		
		
		
		

	}


}
