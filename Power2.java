package myownjavaprogs;

import java.util.Scanner;

public class Power2 {

	public static void main(String[] args) {
	
	
	int n,a=1,c,x;
	double sum=0,b=1,LHS=0,RHS=0;
	Scanner sc= new Scanner(System.in );
	System.out.println("x?");
	x=sc.nextInt();
	System.out.println("n?");
	n=sc.nextInt();
	for(c=1;c<=n;c++) {a=a*x;b=a/(c*1.0);sum=sum+b;if(n%2==0) {b=LHS;} else {b=RHS;}}
	System.out.println(LHS-RHS);
}
}