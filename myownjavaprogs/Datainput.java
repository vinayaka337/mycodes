import java.io.*;
import java.util.Scanner;
public class Datainput {

	public static void main(String[] args) {
		try
		{ int n;
		System.out.println("Content from file:");
		FileInputStream f=new FileInputStream("D:\\eclipse_workspace\\myownjavaprogs\\student.dat");
		DataInputStream df=new DataInputStream(f);
		//BufferedInputStream df=new BufferedInputStream(f);
		//String sf=df.readLine();
		byte[] b;
		df.read(b);
		String s=new String(b);
		double m1=df.readDouble();
		double m2=df.readDouble();
		double m3=df.readDouble();
		System.out.println("name"+s);
		System.out.println("roll no "+n+"name="+s+"m1="+m1+"m2="+m2+"m3="+m3);
		df.close();
		f.close();
	} catch(Exception e) {System.out.println(e.getMessage());}
	}
}
