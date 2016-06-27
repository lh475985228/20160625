package com.orilore.test.main1;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class T4 {
                   public static void main(String[] args) {
// Positiona p = new Positiona();
//					     try {
//						       	FileOutputStream fout = new FileOutputStream("F:/file/c.dd");
//						       	BufferedOutputStream bout = new BufferedOutputStream(fout);
//						       	ObjectOutputStream oout = new ObjectOutputStream(bout);
//						       	oout.writeObject(p);
//						       	oout.flush();
//						       	oout.close();
//						       	
//						} catch (Exception e) {
//							e.printStackTrace();
//							
//						}

		try {
			FileInputStream finput = new FileInputStream("F:/file/c.dd");
			
			ObjectInputStream oinput = new ObjectInputStream(finput);
			
			Positiona p = (Positiona) oinput.readObject();
			
			System.out.println(p.left);
		
		} catch (Exception e) {     
			e.printStackTrace();
	    	}
	     
		}
}
