package etut;

public class Question4 {

	public static void main(String[] args) {
		// b,i,l,g,e,a,d,a,m
		// for loop

		String name = "bilgeadam";

		int len = name.length();
		
		for (int i = 0; i <len; i++) {
			System.out.print(name.charAt(i));
			if(i!=8) {
				System.out.print(",");
			}
		}
	}

}
