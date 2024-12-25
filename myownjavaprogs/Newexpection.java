 package myownjavaprogs;

import java.util.Scanner;

class myException extends Exception
{
	myException(String mesg)
	{
		super(mesg);
	}
}

public class Newexpection { 

	  public static void main(String... args) throws myException
	  {
	   int n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number");
	    n=sc.nextInt();
		   if(n==10)
		        throw new myException("invalid number");
	   System.out.println("given number"+n);
}
}

