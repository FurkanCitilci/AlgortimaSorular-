package com.furkancitilci;

public class Soru1 {

	public static void main(String[] args) {
		
		int sayac=7;
		for (int i = 0; i < 10; i++) {
			if(i<=3) {
			for (int j = 0; j <sayac; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
			}else {
				sayac--;
				for (int j = 0; j <sayac; j++) {
					System.out.print("* ");
				}
				System.out.println();
				
				
			}
			
		}

	}

}

/*
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/
