package myownjavaprogs;
import java.io.*;
import java.util.*;
public class Dataoutput {
	public static void main(String... args)
	{   
		try {
		FileOutputStream fs=new FileOutputStream("student.dat");
		DataOutputStream df=new DataOutputStream(fs);
		Scanner sc=new Scanner(System.in);
		int rollnum;double m1,m2,m3;
		String name;
		System.out.println("roll no:of student?");
		rollnum=sc.nextInt();
		System.out.println("name of the student");
		name=sc.nextLine();
		sc.next();
		System.out.println("marks in s1");
		m1=sc.nextDouble();
		System.out.println("marks in s2");
		m2=sc.nextDouble();
		System.out.println("marks in s3");
		m3=sc.nextDouble();
		df.writeInt(rollnum);
		df.writeChars(name);
		df.writeDouble(m1);
		df.writeDouble(m2);
		df.writeDouble(m3);
		fs.close();
		df.close();
		}catch(Exception e) {System.out.println(e.getMessage());}
		
	}

}
