package com.orilore.test.main2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Demp2 {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       System.out.println("��ӭ����д�ְ�");
	       boolean flag = true;
	       System.out.println("����������Ҫ������ļ�����");
	       String filepath = s.next();
	       File file = new File(filepath);
	       BufferedWriter writer = null;
	       if(!file.exists()){
	    	   try {
				  boolean isexist = file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
	       }
while(flag){
	  FileOutputStream fout;
	  try {
		  fout = new FileOutputStream(file,true);
		  writer = new BufferedWriter(new OutputStreamWriter(fout));
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	  System.out.println("������һ���ı�");
	  String str = s.next();
	  try {
		  writer.write(str);
		  writer.newLine();
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	try {
		writer.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("���Ƿ����yes���������˳�");
	String userinput = s.next();
	if(!"yes".equalsIgnoreCase(userinput)){
		
		break;
	}
	
}
	}

}
