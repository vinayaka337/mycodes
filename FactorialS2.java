package myownjavaprogs;
import java.util.*;
public class Factorial {
	
public static void main(String... args) {
	int n;

	Scanner sc = new Scanner(System.in);
	System.out.println("number for the factorial?");
    n=sc.nextInt();
    int factn=fact(n);    
    System.out.println("factorial of a number"+factn);
}


public static int fact(int pn)
{   int prod=1;
	for(int i=pn;i>0;i--) {
		prod=prod*i;
	}
	return prod;
	
}

}
package myownjavaprogs;
public class S2
{

public  static class S2in {
	int i=0;
	void print() {System.out.println("HELLO?");}

	}

public static void main(String... args)
{
	S2in s2=new S2in();
	s2.print();
	
}

}
