package com.orilore.test.main2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demp {
public static void main(String[] args) {
	                     Scanner s = new Scanner(System.in);
	                     boolean flag = true;
	                     while(flag){
	                    	 
	                    	 System.out.println("������Ҫѡ�����ļ����ļ���");
	                    	 String inputdirname = s.next();
	                    	 
	                    	 File file = new File(inputdirname);
	                    	 if(file.exists()){
	                    		 if(file.isDirectory()){
	                    			 File[] files = file.listFiles();
	                    			 for(File f: files){
	                    				 if(f.isFile()){
	                    				 System.out.println(f.getName());
	                    				 }
	                    			 }
	                    			 System.out.println("��������Ҫ���Ƶ��ļ�����");
	                    			 String cstr = s.next();//??????
	                    			 boolean flag1 = true;
	                    			 String cdirname = null;
	                    			 while(flag1){
	                    				 System.out.println("��������Ҫ���Ƶ��ĸ��ļ���");
	                    				 cdirname = s.next();
	                    				 File checkfile = new File(cdirname);
	                    				 if((checkfile.exists()&&checkfile.isDirectory())){
	                    					 break;
	                    					 
	                    				 }
	                    				 else{
	                    					 System.out.println("�����д�������������");
	                    					 continue;
	                    					 
	                    				 }
	                    				 
	                    			 }				 
	                    			try {
										FileInputStream finput = new FileInputStream(inputdirname+"/"+cstr);
										FileOutputStream fout = new FileOutputStream(cdirname+"/"+cstr);
								int read = 0;
								while((read=finput.read())!=-1){
									fout.write(read);
									
								}
	                    			fout.flush();
	                    			fout.close();
	                    			finput.close();
	                    			System.out.println("���Ƿ����YES���������˳�");
	                    			String userinput = s.next();
	                    			if(!"yes".equalsIgnoreCase(userinput)){
	                    				break;
	                    			}
	                    			} catch (Exception e) {
										e.printStackTrace();
									}	 
	                    			break;
	                    		 }
	                    		 else{
	                    			
	                    			 System.out.println("�Բ����������ļ�������");
	                    		continue;
	                    		 }
	                    	 }
	                    	 else{
	                    		 System.out.println("��������ļ��в���������������");
	                    		 continue;
	                    		 
	                    	 }
	                     }
}
}
