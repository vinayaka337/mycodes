package myownjavaprogs;
import java.util.*;
public class Return {

	public static void main(String[] args) {
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("username?");
		username=sc.nextLine();
		System.out.println("password?");
		password=sc.nextLine();
		System.out.println(username.contentEquals("username"));
		System.out.println(password.contentEquals("password"));
	}
}