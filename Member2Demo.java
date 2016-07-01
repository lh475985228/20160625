package openhome;
import static java.lang.System.out;
import java.io.IOException;
public class Member2Demo {
         public static void main(String[] args) throws Exception {
			Member2[] members = {
					new Member2("B1234","Justin",90),
		    		  new Member2("B5678","Monica",95),
		    		  new Member2("B9876","Irene",100)
			};
			for(Member2 member : members){
				out.println("B1234");
				out.println("B5678");
				out.println("B9876");
			}
		}
}
