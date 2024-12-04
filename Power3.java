package myownjavaprogs;
import java.util.*;
public class Power3 {

	public static void main(String[] args) {
		double x,n,num=1.0,term=1.0,sum=0,i=0;
		int a=1;
		Scanner sc=new Scanner(System.in);		
		System.out.println("x?");
		x=sc.nextInt();
		System.out.println("n?");
		n=sc.nextInt();
		for(a=1;a<=n;a++)
		{num=num*(-x);term=num/a;sum=sum+term;
		}System.out.println(-sum);
	}

}
