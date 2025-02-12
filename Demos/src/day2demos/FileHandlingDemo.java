package day2demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
 fis = new FileInputStream("d:\\mkg\\sun.jpg");
			
			 fos = new FileOutputStream("d:\\mkg\\newsun2.jpg");
			int i=0;
			while( (i = fis.read())!= -1) {
				fos.write(i);
				fos.flush();
				
			}
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("FIle cannot be read..");
			}
		
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}
		
		
	}

}
