package myownjavaprogs;
import java.util.*;
public class Read {

	public static void main(String[] args) {
	String loc;
	Scanner sc = new Scanner(System.in);
	System.out.println("location?");
	loc=sc.nextLine();
	int position = loc.lastIndexOf('/');
	int length = loc.length();
	int ext=loc.lastIndexOf('.');
	System.out.println(loc.replace("/", "\\"));
	//System.out.println("file name is " +loc.substring(position+1,length));
	//System.out.println("extension is " +loc.substring(ext,length));
	//System.out.println("file path is " +loc.substring(1,position));
	}
}