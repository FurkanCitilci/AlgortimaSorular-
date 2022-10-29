package lesson004;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		//kullanıcıdan bir kelime alın
        // eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın
        
        // eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin
        
        //eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın
        
        //replace metod
        //charAt()
        //kelime.startsWith("a")
        //length()
		
		Scanner scanner = new Scanner(System.in);
		String kelime=scanner.nextLine();
		
		if(kelime.charAt(0)=='a') {
			System.out.println(kelime.charAt(kelime.length()-1));
			
			}
		else if(kelime.charAt(0)=='b') {
			System.out.println(kelime.replace('b', '@'));
		}
		

	}

}
