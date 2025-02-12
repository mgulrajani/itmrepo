package day2demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTryWithResources {
	public static void main(String[] args) {
		
	
	try(FileInputStream fis =
			new FileInputStream("d:\\mkg\\sun.jpg"); 
			FileOutputStream fos = 
					new FileOutputStream("d:\\mkg\\newsun3.jpg");)
	{
		int i=0;
		while( (i = fis.read())!= -1) {
		fos.write(i);
		fos.flush();
		
	}
	System.out.println("file copied");
} catch (FileNotFoundException e1) {
	System.out.println("File Not Found");
} catch (IOException e) {
	System.out.println("FIle cannot be read..");
	}}

}

