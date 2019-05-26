package edu.handong.analysis.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Utils {
   public static ArrayList<String> getLines(String file, boolean removeHeader){
      ArrayList<String> read = new ArrayList<String>();
      
      
            
      return read;   
   }
   
   
   public static void writeAFile(ArrayList<String> lines, String targetFileName) {
	   String fileName = targetFileName;
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(
					new FileOutputStream(fileName));
			Scanner keyboard = new Scanner(System.in);
			
			String str;
			for(String list : lines) {
				str = list;
				outputStream.writeChars(str);
			}

			System.out.println("Written to the file " + fileName);
			outputStream.close();
			
			keyboard.close();
		} catch(FileNotFoundException e) {
			System.out.println("Problem opening the file " + fileName);
		} catch (IOException e) {
			System.out.println("Problem with output to file " + fileName);
		}
   }
}