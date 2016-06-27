package com.orilore.test.main1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.crypto.Data;

public class T3 {
         public static void main(String[] args) {
//			          FileOutputStream fout;
//			          try {
//						   fout = new FileOutputStream("F:/file/b.txt");
//						   DataOutputStream dout = new DataOutputStream(fout);
//						   
//						   dout.writeInt(12);
//						   dout.writeUTF("hello java world");
//						   dout.writeBoolean(true);
//						   dout.flush();
//						   dout.close();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
        	 
        	 
       try {
		  FileInputStream finput = new FileInputStream("F:/file/b.txt");
		  BufferedInputStream binput = new BufferedInputStream(finput);
		  DataInputStream dinput = new DataInputStream(binput);
		  int t1 = dinput.readInt();
		  String t2 = dinput.readUTF();
		  boolean t3 = dinput.readBoolean();
		  System.out.println(t1);
		  System.out.println(t2);
		  System.out.println(t3);
    	   dinput.close();
    	   
    	   
    	   
	} catch (Exception ex) {
		ex.printStackTrace();
	}
		}
}
