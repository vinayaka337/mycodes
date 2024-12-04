package myownjavaprogs;
import java.util.*;
public class Arrayclass {
	   int m1,m2,m3;
	   String name;
		
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
		}
				
		void printdata() {
		System.out.println(name);
		System.out.println(m1);
		System.out.println(m2);
		}
		
		int gettot()
		{
			return (m1+m2);
		}
				
		double getAvg()
		{
			return(gettot()/2.00);
		}
		
				public static void main(String... args) {
					Arrayclass[] s1 =new  Arrayclass[5];
					s1[0]=new Arrayclass();
					//s1[0].readdata();
					s1[0].setdata("ramu",100,80,75);
					s1[0].printdata();
					System.out.println("TOTAL "+s1[0].gettot());
					System.out.println("AVG "+s1[0].getAvg());
		}
}