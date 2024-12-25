package myownjavaprogs;
import java.util.*;
public class Sortingarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("numbers?");
		for(int i=1;i<=a.length;i++) {
		  a[i-1] = sc.nextInt();
		}
		int[] b = new int[5];
	
		int num=a[0];int i=0,pos=0;
		int m=0;
		for(int k=0;k<a.length;k++)
		{
			for(i=0;i<a.length;i++) 
			{
			 if (num<a[i])  {num=a[i];pos=i;}
			}
			a[pos]=a[pos]/999;
			//System.out.println(num);
			b[m++]=num;
			num=0;
		}
		System.out.println("after");
		for(int q:b)
			System.out.println(q);
		//for(i=0;i<a.length;i++) {a[i]=a[i]-999;}
		//System.out.println("before");
		//for(int r:a)
			//System.out.println(r);
	} 
     
}