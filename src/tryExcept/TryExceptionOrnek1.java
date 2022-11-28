package tryExcept;

import java.util.Scanner;

public class TryExceptionOrnek1 {

	public static void main(String[] args) {


		String[] array = {"6", "10", "bc" , null ,"20","5465","jhkjh"};
		//elemaniGetir(array);
		sum2(array);
		//parametre olarak array alan ve girdiğimiz değere karşılık gelen indexi yazdıran metod oluştur
		//girdiğimiz değer hangi indexe karşılık geliyorsa onu bize yazdır
		//tryexcept kullan
		
		int temp=0;
		int top=0;
		int sayac=0;
		
		for(int i=0; i<array.length;i++) {
			try {
				temp=Integer.parseInt(array[i]);
				top=top+temp;
				
			} catch (Exception e) {
				sayac++;
			}
		}
		System.out.println(sayac);
		System.out.println(top);

	}
	
	public static void elemaniGetir(String[] array) {
		int temp=0;
		int top=0;
		int sayac=0;
		
		for(int i=0; i<array.length;i++) {
			try {
				temp=Integer.parseInt(array[i]);
				top=top+temp;
				
			} catch (Exception e) {
				sayac++;
			}
		}
		System.out.println(sayac);
		System.out.println(top);
		
	}
	//nullpointer throw et
	public static void sum2(String[] array) {
		
		int temp=0;
		int top=0;
		int sayac=0;
		
		for(int i=0; i<array.length;i++) {
			if(array[i]==null) {
				throw new NullPointerException();
			}
			else {
				temp=Integer.parseInt(array[i]);
				top=top+temp;
				
			}
			
		}
		
//		public void nullCheck() {
//			
//		}
		
		

		
	}

}
