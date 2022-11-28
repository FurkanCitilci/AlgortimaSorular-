package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("denem.txt");
			FileInputStream fis = new FileInputStream("denem.txt");
			fos.write(65);
			byte[] array = {100, 80, 88};
			fos.write(array);
			
			
			String string = "Hello java";
			//string i byte cevircez
			fos.write(string.getBytes());
			
			while(fis.read()!=-1) {
			System.out.println((char)fis.read());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
