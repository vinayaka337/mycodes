package myownjavaprogs;
import javax.swing.*;
public class Static {
	int roll;
	String name;
	static String clg = "JNTU";
			void setdata(int roll,String name)
			{
				this.roll = roll;
				this.name = name;
			}
			
			void printdata()
			{
				System.out.println(roll);
				System.out.println(name);
				System.out.println(clg);
			}
			
public static void main(String... args) {
	Static s1 = new Static();
	s1.setdata(2,"sun");
	s1.printdata();
	Static s2 = new Static();
	s2.setdata(3,"vinay");
	s2.printdata();
	Static.clg="JNTU-HYD";
	s1.printdata();
	s2.printdata();
	
}
}
