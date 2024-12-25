package myownjavaprogs;

public class Downcasting {
int i;
Downcasting(int n)
{
	i=n;
}
void printdata() 
{
	System.out.println(i);
	}
void compare(Downcasting d) {
   if(d.i > i)
	     System.out.println("second is higher");
}

public static void main(String...args) {
	Downcasting s1 = new Downcasting(10);
	s1.printdata();
	Downcasting s2 = new Downcasting(20);
	s2.printdata();
	s1.compare(s2);
	
}
}
