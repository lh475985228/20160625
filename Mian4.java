package com.orilore.test.main2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Mian4 {
	public static void main(String[] args) {
     try {
		          FileOutputStream fout = new FileOutputStream("F:/file/c.txt");
		          OutputStreamWriter writer = new OutputStreamWriter(fout,"utf-8");
	BufferedWriter bwriter = new BufferedWriter(writer);
	bwriter.write("������ɽ��");
	bwriter.newLine();
	bwriter.write("�ƺ��뺣��");
	bwriter.newLine();
	bwriter.write("����ǧ��Ŀ");
	bwriter.newLine();
	bwriter.write("����һ��¥");
	
     bwriter.flush();
     bwriter.close();
     
     } catch (Exception e) {
		e.printStackTrace();
	}
	}

}
