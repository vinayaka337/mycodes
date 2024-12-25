package myownjavaprogs;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SevakEntry {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try
			{
			FileOutputStream f=new FileOutputStream("mantralayam26nov2024.dat");
	        //System.out.println("Enter java program line");
			for(;;) 
			{
				
				System.out.println("name");
				String n = sc.nextLine();
				System.out.println("aadhar");
				String aadhar = sc.nextLine();
				System.out.println("mobile number");
				String num = sc.nextLine();
				System.out.println("age");
				String age = sc.nextLine();
				sc.next().charAt(0);
				byte[] b=n.getBytes();
				f.write(b);
				f.write((int)',');
				byte[] c=aadhar.getBytes();
				f.write(c);
				f.write((int)+',');
				byte[] d=num.getBytes();
				f.write(d);
				f.write((int)+',');
				byte[] e=age.getBytes();
				f.write(e);
				//f.write(age+'\n');
				System.out.println("do you want to continue?");
				char ch = sc.next().charAt(0);
                if(ch!='y')
                	break;
			}
			f.flush();
			f.close();
			
		} catch(Exception e) {System.out.println(e.getMessage());}
	}

}
