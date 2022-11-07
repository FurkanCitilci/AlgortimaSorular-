package lesson009;

import java.util.Scanner;

public class Question64 {

	public static void main(String[] args) {
		//Bir öğrencinin vize ve final notlarını girdiği ve ortalamasının hesaplandığı program
        //Vize notunun +40, final %60
        //puanHesapla --> parametre vize ve final notlarını alacak
        //öğrencinin not ortalaması 60 ın üzerindeyse geçti, 50-60 arasındaysa şartlı geçti, 50 düşükse dersten kaldı
        //mesaj oalrak bunlar konsolda gösterilecek
		System.out.println("lütfen vize notunuzu giriniz:");
		Scanner scanner = new Scanner(System.in);
		float vize=scanner.nextInt();
		System.out.println("lütfen final notunuzu giriniz:");
		float last=scanner.nextInt();
	
		float sonuc = puanHesapla(vize,last);
		if(sonuc>=60) {
			System.out.println("Notunuz :" + sonuc + " Geçtiniz:");
		}else if(sonuc<60) {
			System.out.println("Notunuz :" + sonuc + " Kaldınız:");
		}

	}

	public static float puanHesapla(float vize , float last) {
		
		vize=1f*vize *40/100;
		last=1f*last*60/100;
		return vize +last;
		
	}
	

}
