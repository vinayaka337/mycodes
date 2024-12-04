package myownjavaprogs;
import java.util.*;
import java.lang.Math.*;
public class Round {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num?");
		double num=sc.nextDouble();
		System.out.println("number of digits you want round?");
		int n=sc.nextInt();
		num=num*(Math.pow(10,n));
		num=Math.ceil(num);
		num=num/(Math.pow(10,n));
		//for(int i=1;i<=n;i++) {double k = num%10;}
	   System.out.println(num);
	}
}
