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
	bwriter.write("白日依山尽");
	bwriter.newLine();
	bwriter.write("黄河入海流");
	bwriter.newLine();
	bwriter.write("欲穷千里目");
	bwriter.newLine();
	bwriter.write("更上一层楼");
	
     bwriter.flush();
     bwriter.close();
     
     } catch (Exception e) {
		e.printStackTrace();
	}
	}

}
