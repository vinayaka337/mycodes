package myownjavaprogs;
import java.io.Console;
public class Readconsole {

	public static void main(String... args) {
		Console c=System.console();
	
		System.out.println("enter your name");
		String n=c.readLine();
		System.out.println(n);
	}
}
