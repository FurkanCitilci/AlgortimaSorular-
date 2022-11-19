package util;

import java.util.Random;

public class GenerateRandomId {
	
	// rastgele id oluştur
	
	public static String generateId() {
		Random random = new Random();
		int randomId = random.nextInt(1000);
		
		String randomId1 =String.valueOf(randomId);
		return randomId1;
	}
	
	

}
