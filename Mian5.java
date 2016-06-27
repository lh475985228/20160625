package com.orilore.test.main2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Mian5 {

	public static void main(String[] args) {
     try {
		     FileInputStream finput = new FileInputStream("F:/file/c.txt");
		     InputStreamReader reader  = new InputStreamReader(finput, "utf-8");
		     BufferedReader breader = new BufferedReader(reader);
		     String strline = "";
		     while((strline=breader.readLine())!=null){
		    	 System.out.println(strline);
		    	 
		    	 
		     }
		     
		     
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
