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
	                    	 
	                    	 System.out.println("请输入要选择复制文件的文件夹");
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
	                    			 System.out.println("请输入您要复制的文件名字");
	                    			 String cstr = s.next();//??????
	                    			 boolean flag1 = true;
	                    			 String cdirname = null;
	                    			 while(flag1){
	                    				 System.out.println("请输入您要复制到哪个文件夹");
	                    				 cdirname = s.next();
	                    				 File checkfile = new File(cdirname);
	                    				 if((checkfile.exists()&&checkfile.isDirectory())){
	                    					 break;
	                    					 
	                    				 }
	                    				 else{
	                    					 System.out.println("输入有错误请重新输入");
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
	                    			System.out.println("您是否继续YES继续其它退出");
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
	                    			
	                    			 System.out.println("对不起，请输入文件夹名称");
	                    		continue;
	                    		 }
	                    	 }
	                    	 else{
	                    		 System.out.println("你输入的文件夹不存在请重新输入");
	                    		 continue;
	                    		 
	                    	 }
	                     }
}
}
