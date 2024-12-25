package myownjavaprogs;

public class Strud {
	int roll=1,m1=20,m2=18;
	String name = "sunny";
	Strud()
	{
		System.out.println("this is from constructers");
	}
	{ System.out.println("this is from class");}
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(m1);
		System.out.println(m2);
	}	
public static void main(String... args) {
	Strud s1 = new Strud();
	//s1.printdata();
	//Strud s2 = new Strud();
 }
}