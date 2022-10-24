package odevler;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// bmi hesaplama
		Scanner scanner = new Scanner(System.in);
		System.out.println("Body-Mass-Index Programına Hoşgeldiniz ");
		System.out.println("***************************************");
		System.out.println("Lütfen Aşağıdaki Değerleri Giriniz:");
		
		System.out.print("Cinsiyetiniz(erkek/kadin):");  //e=erkek, k=kadın
		String cinsiyet=scanner.nextLine();
		System.out.print("Boy(cm):");
		float boy= scanner.nextFloat();
		System.out.print("Ağırlık(kg):");
		float agirlik= scanner.nextFloat();
		
		float bmi=(float)(agirlik*(10000/(boy*boy)));
		
		System.out.println("BMI:" + (float)bmi );
		
		if(cinsiyet.equalsIgnoreCase("e")) {
			System.out.println("Cinsiyet:"+ (String)cinsiyet);
			if((float)bmi<20) {
				System.out.println("BMI:" + (float)bmi + " " + "Zayıf Erkek ");
			}
			else if((float)bmi>20 &&(float) bmi<25) {
				System.out.println("BMI:" + (float)bmi + " " + "Normal Erkek ");
			}
			else if((float)bmi>26 && (float)bmi<30){
				System.out.println("BMI:" + (float)bmi + " " + "Şişman Erkek ");
			}
			else if(bmi>30){
				System.out.println("BMI:" + bmi + " " + "Obez Erkek ");
			}

		}
		else if(cinsiyet.equalsIgnoreCase("k")) {
			System.out.println("Cinsiyet:"+ (String)cinsiyet);
			if((float)bmi<19) {
				System.out.println("BMI:" + (float)bmi + " " + "Zayıf kadın ");
			}
			else if((float)bmi>19 &&(float) bmi<24) {
				System.out.println("BMI:" + (float)bmi + " " + "Normal kadın ");
			}
			else if((float)bmi>24 && (float)bmi<30){
				System.out.println("BMI:" + (float)bmi + " " + "Şişman kadın ");
			}
			else if(bmi>30) {
				System.out.println("BMI:" + bmi + " " + "Obez kadın ");
			}
			
		}
		
	}
}




