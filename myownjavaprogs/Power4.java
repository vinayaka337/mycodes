package myownjavaprogs;

import java.util.*;

public class Power4 {

	public static void main(String[] args) {
		int f1, f2, f, x, i, j, k, p,n;
		double sum = 0, term, prod;
		Scanner sc = new Scanner(System.in);
		System.out.println("f1?");
		f1 = sc.nextInt();
		System.out.println("f2?");
		f2 = sc.nextInt();
		System.out.println("x?");
		x = sc.nextInt();
		System.out.println("n?");
		n=sc.nextInt();
		p = 1;
		//sum = (x / f1) + ((x * x )/ f2);
		//power = 1;
		for (i = 1; i <= n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			
			for (j = 2; j < p; j++) 
				if (p % j == 0) 
					{p++;j=2;}
				System.out.println("prime="+p+"j="+j);
					p++;
				prod = 1;
				for (k = 1; k <= p; k++) {
					prod = prod * x;
				}
				term = (prod / f);
				sum = sum + term;
		
		}
		System.out.println(sum);
	}

}