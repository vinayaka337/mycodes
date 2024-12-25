package myownjavaprogs;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		int n,a=1,c=1;
		double sum=0,b=1;
		Scanner sc= new Scanner(System.in );
		System.out.println("n?");
		n=sc.nextInt();
		for(c=1;c<=n;c++) {a=a*n;b=a/(c*1.0);sum=sum+b;}
		System.out.println(sum);
	}

}
