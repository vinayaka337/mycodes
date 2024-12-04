package myownjavaprogs;

import java.util.Scanner;
class project extends internals1{
	int m1p,m2p,m3p;
	void fiprintdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("MARKS IN THE FIRST SUBJECT PROJECT?");
		m1p=sc.nextInt();
		System.out.println("MARKS IN THE SECOND SUBJECT PROJECT?");
		m2p=sc.nextInt();
		System.out.println("MARKS IN THE THIRD SUBJECT PROJECT?");
		m3p=sc.nextInt();
				
	}
	void printdata()
	{
		m1=m1+m1i+m1p;
		m2=m2+m2i+m2p;
		m3=m3+m3i+m3p;
		//System.out.println(m1);
		System.out.println("TOTAL MARKS IN THE FIRST SUBJECT = "+m1);
		System.out.println("TOTAL MARKS IN THE SECOND SUBJECT = "+m2);
		System.out.println("TOTAL MARKS IN THE THIRD SUBJECT = "+m3);
	}
}

class internals1 extends Build{
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
	

}

public class Build {
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
		
		project d1 = new project();
		d1.readdata();
		d1.show();
		d1.fiprintdata();
		d1.printdata();
	}

}
