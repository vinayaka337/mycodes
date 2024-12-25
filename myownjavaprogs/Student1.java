package myownjavaprogs;

import java.util.Scanner;

class internals extends Student1{
	int m1i,m2i,m3i;
	void show()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("MARKS IN THE FIRST SUBJECT INTERNALS?");
		m1i=sc.nextInt();
		System.out.println("MARKS IN THE SECOND SUBJECT INTERNALS?");
		m2i=sc.nextInt();
		System.out.println("MARKS IN THE THIRD SUBJECT INTERNALS?");
		m3i=sc.nextInt();
	}
	void printdata()
	{
		m1=m1+m1i;
		m2=m2+m2i;
		m3=m3+m3i;
		//System.out.println(m1);
		System.out.println("TOTAL MARKS IN THE FIRST SUBJECT = "+m1);
		System.out.println("TOTAL MARKS IN THE SECOND SUBJECT = "+m2);
		System.out.println("TOTAL MARKS IN THE THIRD SUBJECT = "+m3);
	}

}

public class Student1 {
	String name;
	int m1,m2,m3;
	
	void setdata(String p_nm,int p_m1, int p_m2, int p_m3)
	{
					name=p_nm;m1=p_m1;m2=p_m2;m3=p_m3;
	}
	
	void readdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("NAME?");
		name=sc.nextLine();
		System.out.println("MARKS IN THE FIRST SUBJECT?");
		m1=sc.nextInt();
		System.out.println("MARKS IN THE SECOND SUBJECT?");
		m2=sc.nextInt();
		System.out.println("MARKS IN THE THIRD SUBJECT?");
		m3=sc.nextInt();
	}
	public static void main(String... args) {
		
		internals d1 = new internals();
		d1.readdata();
		d1.show();
		d1.printdata();
	}

}
