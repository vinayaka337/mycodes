package myownjavaprogs;
import java.util.*;
public class Series {

	public static void main(String[] args) {
		int i,j,f1=0,f2=1,f,n=2;
		for(i=1;i<=5;i++)
		{	
			System.out.println();
	
			for(j=1;j<=i;j++)
			{  f=f1+f2;
				System.out.printf("%5d",f);
				System.out.println();
				n=n-1;
				f1=f2;
				f2=f;
			}
			}
		}
		
	}
