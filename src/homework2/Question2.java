package homework2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		/*
		//Soru2 (40puan)
		// Swtich case ile 
		//input --> mehmet
		//input--> hangisi işlemi yapmak istiyosunuz
		
		System.out.println("1- Kelimeleri Büyük Harf Yap");
	    System.out.println("2- kelimenin harflerini Küçük yap");
	    System.out.println("3- kelimenin harflerinin arasına ? koy");
	    //mehmet m?h?m?e?t
	    System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
	    //     mehmet   
	    System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin");
	    //replace replaceAll("a", ?")
	    System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
	    // mehmet
	    //meh...
	    //substring()
	     */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen İşlem Yapmak İstediğiniz Kelimeyi Giriniz:");
		String kelime=scanner.nextLine();
		System.out.println("1- Kelimenin Harflerini Büyük Yap\n"
				+ "2- Kelimenin harflerini Küçük yap\n"
				+ "3- Kelimenin harflerinin arasına ? koy\n" 
				+ "4- Kelimenin başındaki ve sonundaki boşlukları silin\n"
				+ "5- Kelimenin içindeki bütün a harflerini ? ile değiştirin\n"
				+ "6- Kelimenin ilk üç indexinin alıp sonuna ... koyun");
		System.out.println("*************************************************");
		System.out.println("Girilen Kelime: "  + kelime);
		System.out.println("Hangi işlemi Yapmak istiyorsunuz:");
		int tercih=scanner.nextInt();
		
		switch (tercih) {
		case 1:  
			System.out.println("Tercih : 1\nKelimenin Harflerini Büyük yap");
			System.out.println(kelime.toUpperCase());
			
			break;
		case 2:
			System.out.println("Tercih: 2\nKelimenin harflerini Küçük yap");
			System.out.println(kelime.toLowerCase());
			
			break;
		case 3:
			System.out.println("Tercih: 3\nKelimenin harflerinin arasına ? koy");
			for (int i = 0; i <= kelime.length() - 1; i++) {
				if (i < kelime.length() - 1) {
					System.out.print(kelime.charAt(i) + "?");
				} else
					System.out.println(kelime.charAt(i));
			}
			break;
		case 4:
			System.out.println("Tercih: 4\nKelimenin başındaki ve sonundaki boşlukları silin");
			System.out.println(kelime.trim());
			
			break;	
		case 5:
			System.out.println("Tercih: 5\nKelimenin içindeki bütün a harflerini ? ile değiştirin");
			System.out.println(kelime.replaceAll("a", "?"));
			
			break;	
		case 6:
			System.out.println("Tercih: 6\nKelimenin ilk üç indexinin alıp sonuna ... koyun");
			System.out.println(kelime.replace(kelime.substring(3,kelime.length()),"..." ));
			break;	

		default:
			break;
			
		}
		scanner.close();
	}
}
