package collections;

import java.util.Stack;

public class StackOrnek {

	public static void main(String[] args) {
		// stack oluştur
		
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> buyuk = new Stack<Integer>();
		stack.add(5);
		stack.add(12);
		stack.add(22);
		stack.add(20);
		stack.add(102);
		stack.add(127);
		
		System.out.println(stack);
		
		
		for (Integer sayilar : stack) {
			System.out.println(sayilar);
			
		}
		
		//stack boşalana kadar bütün elemanları çıkaralım,
		//çıkarılan tüm elemanı yazdır
//		while(true) {
//			
//			if(stack.isEmpty()) {
//				System.out.println("Stack boşaldı");
//				break;
//
//			}else {
//				
//				System.out.println("Stack den çıkan eleman :" + stack.pop());
//				
//			}
//			
//		}
		
		//100 küçük değerleri topla stack den çıkar
		int top=0;
		while(true) {
			
			if(stack.isEmpty()) {
				System.out.println("Stack boşaldı");
				break;

			}else  {
				int temp=stack.pop();					//temp de son sayıyı tutma, stack.peek();
				if(temp<100) {
					top=top+temp;
				}else if(temp>100) {
					buyuk.add(temp);
				}
				
				
				
			}
			
		}
		System.out.println(top);
		System.out.println(buyuk);
		
		
	}

}
