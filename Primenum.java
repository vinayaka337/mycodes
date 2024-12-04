package myownjavaprogs;

import java.util.*;

public class Primenum {

	public static void main(String[] args) {
		int dupnum,num, i,j,k;
		boolean abprimflag,flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("num?");
		num = sc.nextInt();
		dupnum=num;
		
	xx:	for(abprimflag=true;num>0;num=num/10) {
			System.out.println(num); flag=true;
	        for(i=2;i<num/2;i++)
	        	if (num%i==0) {abprimflag=false;break xx;}
		}
	   if (abprimflag)
		    System.out.println("absolute prime ");
	   else
		   System.out.println("not absolute prime");
		    
        
}
}