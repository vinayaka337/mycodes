package myownjavaprogs;
import java.util.*;
public class Constructers {
	String name;
	int roll,m1,m2;
	
	Constructers(int proll,String pname,int pm1, int pm2)
	{
		name = pname;
		roll = proll;
		m1 = pm1;
		m2 = pm2;
	}

	Constructers()
	{
		name = "default name ";
		roll = 1;
		m1 =35;
		m2 = 35;
	}

	
	void printdata()
	{
		System.out.println(name);
		System.out.println(roll);
		System.out.println(m1);
		System.out.println(m2);
	}
	
	public static void main(String... args) {
		Constructers s1= new Constructers(125,"vinay",100,80);
		s1.printdata();
		Constructers s2= new Constructers();
		s2.printdata();
	}
	
}