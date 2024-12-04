package myownjavaprogs;
import java.io.FileInputStream;
import java.util.Scanner;
public class Fileinput {

	public static void main(String[] args) {
		try
		{ int n;
		System.out.println("Content from file:");
		FileInputStream f=new FileInputStream("D:\\Eclipse_Workspace\\Myownjavaprogs\\Src\\Myownjavaprogs\\Factorial.java");
 		while((n=f.read())!=-1)
 		   System.out.print((char)n);
		f.close();
	} catch(Exception e) {System.out.println(e.getMessage());}
	}
}
