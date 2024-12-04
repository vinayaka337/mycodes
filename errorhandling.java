package myownjavaprogs;

import java.util.Scanner;

public class errorhandling {

	public static void main(String[] argums) {
		// TODO Auto-generated method stub
        int m=10,n;
        int d;
		/*
		 * try {
		 * 
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter any number");
		 * n=sc.nextInt();
		 * 
		 * d=m/n; System.out.println("division value"+d); }catch (ArithmeticException
		 * err) { System.out.println(err.getMessage()); }
		 */
  	  
  	  
	  try
	  {  
  		  int p[]=new int [2];
  			   p[1]=150;
  			   p[2]=20;
  			 System.out.println(p[3]);
  		  }
  		  catch (ArrayIndexOutOfBoundsException err) {
  			  System.out.println(err.getMessage());
  	  }
  	  
}
}