package com.orilore.test.main1;

import java.io.FileInputStream;
import java.io.*;
import java.io.FileOutputStream;

public class T2 {
              public static void main(String[] args) {
				   try {
//				 FileOutputStream fout = new FileOutputStream("F:/file/a.txt");
//				 String hello = "ÄãºÃ";
//				 String hello2 = "ÄãºÃ2";
//				 byte[] strbyte = hello.getBytes();
//				 byte[] strbyte2 = hello2.getBytes();
//				 fout.write(strbyte);
//				 fout.write(strbyte2);
//				 fout.flush();
//				 fout.close();
					   
					   FileInputStream input = new FileInputStream("F:file/a.txt");
					 String hello = "ÄãºÃ";
					byte[] bs = hello.getBytes();
					byte[] newbs = new byte[bs.length];
					input.read(newbs);
					String str = new String(newbs);
					
					System.out.println(str);
					   
			   
				} catch (Exception e) {
					e.printStackTrace();  
				}
			}
}
