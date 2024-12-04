package myownjavaprogs;
import java.util.Scanner;
class mypan extends Exception
{
	mypan(String mesg)
	{
		super(mesg);
	}
}
public class Pan {
	public static void main(String... args) throws mypan
	{
		int num;
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [0][5];
		for(int i=0;i<5;i++) {
		System.out.println("enter your PAN number?");
		a[0][i]=sc.next().charAt(0);
		if( (a[0][i] >= 'a' && a[0][i] <= 'z') || (a[0][i] >= 'A' && a[0][i] <= 'Z')) {continue;}
		else{throw new mypan("invalid pan number");}}
			
	}
}
