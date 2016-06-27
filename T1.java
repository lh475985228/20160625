package com.orilore.test.main1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class T1 {
	public static void main(String[] args) {
		try {
			String downurl = "http://img3.duitang.com/uploads/item/201606/13/20160613104906_nfUEQ.jpeg";
			URL url = new URL(downurl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			String path = "F:/File";
			String type = downurl.substring(downurl.lastIndexOf("."));
			Date date = new Date();
			long time = date.getTime();
			String filename = path + "/" + time + type;
			InputStream input = conn.getInputStream();
			BufferedInputStream binput = new BufferedInputStream(input);

			FileOutputStream fout = new FileOutputStream(filename);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			long t1 = System.currentTimeMillis();
			// 每次读512个字节
			// byte[] cache = new byte[512];
			// int readlength = 0;
			// while((readlength= input.read(cache))!=-1){
			// fout.write(cache,0,readlength);
			//
			// }
			// 每次读一个字节
			int read = 0;
			while ((read = binput.read()) != -1) {
				bout.write(read);
			}
			bout.flush();
			bout.close();
			input.close();
			long t2 = System.currentTimeMillis();
			System.out.println(t2 - t1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
