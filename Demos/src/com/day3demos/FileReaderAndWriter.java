package com.day3demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
	public static void main(String[] args) {
		
		try(BufferedReader br  =
				new BufferedReader(new FileReader("d:\\mkg\\test.txt"));
				BufferedWriter bw =
				new BufferedWriter(new FileWriter("d:\\mkg\\datacopy.txt"));){
			String str = "";
			while(( str =br.readLine())!=null) {
				bw.write(str);

				bw.flush();
				
			}
			
			System.out.println("File copied to the destination");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
