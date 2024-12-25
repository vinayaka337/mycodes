package myownjavaprogs;
import java.io.Console;
public class Readpassword {

	public static void main(String... args) {
	Console c = System.console();
	System.out.println("ENTER PASSWORD");
	char[] ch=c.readPassword();
	String pass=String.valueOf(ch);
	System.out.println(pass);
	
	
	}
}