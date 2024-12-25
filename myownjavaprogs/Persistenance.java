package myownjavaprogs;

import java.util.*;

public class Persistenance {

	public static void main(String[] args) {
		int per, prod;
		Scanner sc = new Scanner(System.in);
		System.out.println("num?");
		int num = sc.nextInt();
		for (per = 1; num > 9; per++) {
			for (prod = 1; prod > 0; num = num / 10) {
				prod =num % 10;
				num =num*prod;
				System.out.println("prod = " + prod);}
			System.out.print("per = " + per);
		}
	}
}