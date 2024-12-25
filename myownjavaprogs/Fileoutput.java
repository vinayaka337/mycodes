package myownjavaprogs;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.util.Scanner;
public class Fileoutput {

	public static void main(String[] args) {
		try
		{
		FileOutputStream f=new FileOutputStream("vinayak_buf.java");
		BufferedOutputStream bf=new BufferedOutputStream(f);
        System.out.println("Enter java program line");
        for(int i=0;i<=5;i++) 
        {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
		byte[] b=s.getBytes();
		bf.write(b);
		bf.write((int)'\n');
		}
        
		bf.flush();
		bf.close();
		
	} catch(Exception e) {System.out.println(e.getMessage());}
	}
}
