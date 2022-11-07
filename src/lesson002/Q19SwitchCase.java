package lesson002;

import java.util.Scanner;

public class Q19SwitchCase {

	public static void main(String[] args) {
		//girilen sayının hangi beden olduğunu söyle
			// switch case
			//small 29
			//medium 42
			//large 44
			//xl 48
			//default belirsiz
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen beden numaranızı giriniz");
		
		int beden=scanner.nextInt();
		
		switch (beden) {
		case 29:
			System.out.println("Small Beden");
			
			break;
		case 42:
			System.out.println("Medium Beden");
			
			break;	
		case 44:
			System.out.println("Large Beden");
			
			break;
		case 48:
			System.out.println("XL Beden");
			
			break;

		default:
			System.out.println("Belirsiz");
			break;
		}

	}

}
