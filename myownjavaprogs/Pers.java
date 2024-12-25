package myownjavaprogs;

import java.util.*;

public class Pers {

	public static void main(String[] args) {
		int n,pers=0,d,prod;
		Scanner sc = new Scanner(System.in);
		System.out.println("number?");
		n = sc.nextInt();
		while (n > 9) {
			pers++;
			prod=1;
			while (n > 0) {
				d=n%10;
				prod=prod*d;
				n=n/10;
			} 
			System.out.println(prod);
			n=prod;
		}
		System.out.println("persistance = "+pers);
	}
}