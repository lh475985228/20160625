package com.orilore.test.main2;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Mian2 {

	public static void main(String[] args) {
		// InputStreamReader;
		// OutputStreamWriter;
		try {
			FileOutputStream fout = new FileOutputStream("F:/file/b.txt");

			OutputStreamWriter writer = new OutputStreamWriter(fout, "utf-8");

			writer.write("��Һã��������ַ���");
			
			writer.write(" \n ");
		
			writer.write("�Һܺ�");
		
			writer.flush();
		
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
