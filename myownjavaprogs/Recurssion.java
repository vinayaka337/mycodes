package myownjavaprogs;
import java.util.Scanner;
public class Recurssion {
    public static int fact(int n,int m) 
    {
    	if(n==0) return 0;
    	else return m+fact(n-1,m);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("num?");
		int num=sc.nextInt();
		System.out.println("multiped by?");
		int mul=sc.nextInt();
		a=fact(mul,num);
		System.out.println(a);
	}
	
}