package myownjavaprogs;
import java.util.*;
public class Cyclicprime {

	public static void main(String[] args) {
		boolean abprimflag,flag;
		int i,j;double m=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("num?");
		int num=sc.nextInt();
		for(j=1;j<=num;j++) {if (num>10) {num=num/10;m++;}}
		xx:	for(abprimflag=true;num>0;num=num*(pow(10,m))) {
			System.out.println(num); flag=true;
	        for(i=2;i<num/2;i++)
	        	if (num%i==0) {abprimflag=false;
	        	num=num/10;
	        	break xx;}
	}
	}
	}
