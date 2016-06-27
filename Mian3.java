package com.orilore.test.main2;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Mian3 {
	public static void main(String[] args) {
					        try {
								        FileInputStream   finput = new FileInputStream("F:/file/b.txt");
								        InputStreamReader reader = new InputStreamReader(finput,"utf-8");
								        char[] a = new char[10];
								        int readlength =  0;
								        while((readlength = reader.read(a))!=-1){
					       	String  str = new String (a,0,readlength);
					       	System.out.println(str);
													        				        											        	
						        }
								        reader.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
				}
	}
