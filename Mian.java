package com.orilore.test.main2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Mian {
            public static void main(String[] args) {
//				          try {
//							    FileOutputStream fout = new FileOutputStream("F:/file/a");
//							    DataOutputStream dout = new DataOutputStream(fout);
//							    dout.writeUTF("hello java world");
//							    dout.writeUTF("license");
//							    dout.writeLong(166623123);
//							    dout.writeBoolean(true);
//							    dout.flush();
//							    dout.close();
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
            	try {
            		  FileInputStream finput = new FileInputStream("F:/file/a");
                	  DataInputStream dinput = new DataInputStream(finput);
                	  String r = dinput.readUTF();
                	  System.out.println(r);
                	  dinput.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
}
