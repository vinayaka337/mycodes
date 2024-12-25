package myownjavaprogs;

import java.util.*;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j = 1, k;
		System.out.println("n?");
		n = sc.nextInt();
		k =1;
		while (k <= n) {
			System.out.println();
			i = n;
			while (i >= k) {
				System.out.print(" ");
				i--;
			}
			j = 1;
			while (j < k * 2) {
				System.out.print("*");
				j++;
			}
			k++;
		}
		k = n ;
		while (k >= 1) {
			System.out.println();
			k--;
			i = k;
			while (i <= n) {
				System.out.print(" ");
				i++;
			}
			j = 1;
			while (j < k * 2) {
				System.out.print("*");
				j++;
			}
		}
	}
}
