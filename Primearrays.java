package myownjavaprogs;
import java.util.*;
public class Primearrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a[] = new int[100];int n;
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		for(int i=1;i<a.length-1;i++) {
			if (a[i]==0)
				continue;
			n=a[i];
			for(int j=i+1;j<a.length;j++) {
                if (a[j]>0 && a[j]%n==0)
                        a[j]=a[j]%n;
			}
		}
		for(int j=0;j<a.length;j++)
			 if (a[j]>0) System.out.println(a[j]);
	}

}





















