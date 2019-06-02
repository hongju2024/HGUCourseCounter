package edu.handong.analysis.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Utils {
	static public ArrayList<String> getLines(String file,boolean removeHeader){
		ArrayList<String> lines = new ArrayList<String>();
		String thisLine="";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((thisLine = br.readLine()) != null) { // while loop begins here
				lines.add(thisLine);
			} 
			br.close();
		} 
		catch (IOException e) {
			System.err.println("Error: " + e);
		}
		
		if(removeHeader)
			lines.remove(0);
		
		return lines;
	}
   
   
	public static void writeAFile(ArrayList<String> lines, String targetFileName){
		try {
			File file= new File(targetFileName);
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos=new DataOutputStream(fos);
			
			for(String line:lines){
				dos.write((line+"\n").getBytes());
			}
			//dos.writeBytes();
			System.out.println("written to file " + targetFileName);
			dos.close();
			fos.close();
		} catch(FileNotFoundException e) {
			System.out.println("Problem opening the file " + targetFileName);
		} catch (IOException e) {
			System.out.println("Problem with output to file " + targetFileName);
		}
   }
}