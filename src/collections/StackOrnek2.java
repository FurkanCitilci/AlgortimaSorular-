package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {
	
	static Stack<Character> stack = new Stack<Character>();
	
	public static void main(String[] args) {
		
		
		

		Scanner scanner = new Scanner(System.in);

		
		String metin=scanner.nextLine();
		palindrom(metin);
		
		
	}
	
	//parametre olarak string alan
	//girilen her metnin her karakterini STACK İÇİNE ATAN  method yaz
	//method palindrom olsun
	//methodu kullan çıktı al
	
	//metin palindrom mu değil  mi
	//baştan ve sondan okunuşu aynı mı
	//kabak---->palindrom
	
	public static void palindrom(String metin) {
		
		for (int i =0;i<metin.length();i++) {
			stack.push(metin.charAt(i));
			
		}
		for (Character character : stack) {
			System.out.println(character);
			
		}
		isPalindrom(stack);
			
	}
	
	public static void isPalindrom(Stack<Character> stack) {
		while (stack.isEmpty()) {
			if (stack.lastElement() == stack.firstElement()) {
				stack.remove(0);
				stack.pop();
				System.out.println("Palindrom");
			} else {
				// System.out.println();

			}

		}

	}
	

}
