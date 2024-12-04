package myownjavaprogs;
import java.util.*;
public class Ar {

	public static void main(String[] args) {
		int num,i;
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("numbers to be inputed?");
		for(i = 1; i<=5;i++) {
			a[i-1] = sc.nextInt();
		}
		for(int j:a)
		{
			System.out.println(j);
		}
		
		System.out.println("number to be searched for?");
		int n = sc.nextInt();
		for (i = 0 ; i<a.length;i++) {
			if(a[i]==n) {System.out.println("found at "+(i+1)+" position");}
		}
		System.out.println("number not found");
		}
	}

