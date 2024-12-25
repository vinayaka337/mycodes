package myownjavaprogs;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Filee {

	public static void main(String[] args) {
		try
		{
		FileOutputStream f=new FileOutputStream("vinayak.java");
        System.out.println("Enter java program line");
        for(int i=0;i<=5;i++) 
        {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
		byte[] b=s.getBytes();
		f.write(b);
		f.write((int)'\n');
		}
		f.flush();
		f.close();
	} catch(Exception e) {System.out.println(e.getMessage());}
	}
}
