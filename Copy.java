package openhome;

import java.io.*;
import java.io.FileOutputStream;

import java.io.*;

public class Copy {
       public static void main(String[] args) throws IOException{
		  IO.dump(
				  new FileInputStream(args[0]),
				  new FileOutputStream(args[1])
				  );
	}
}
