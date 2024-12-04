package myownjavaprogs;
import java.util.*;


public class Arrays {

	public static void main(String[] args) {
		int[] b= {1,2,3,4,5};
		int[] a= {10,20,30,40,50,60,70};
		//for(int i=0;i<a.length;i++)
			//System.out.println(a[i]+" ");
		
		System.out.println("using foreach syntax");
		for(int j:a)
		{     System.out.println(j);
			 // System.out.println(a[j]+"==");
		}for(int k:b) {System.out.println(k);}
	}

}
