package myownjavaprogs;
import java.util.*;
public class Mergingarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("numbers?");
		for(int i =1;i<=a.length;i++) {
			a[i-1]=sc.nextInt();
		}
		int b[] = new int[5];
		System.out.println("numbers?");
		for(int i=1;i<=b.length;i++) {
			b[i-1]=sc.nextInt();
		}
		int c[]=new int[10];
		int num=999,k=0,index1=0,index2=0;
		for(int j=0;j<10;j++) {
		for(int i=0;i<=4;i++) {
			if(num>a[i]) {num=a[i];index1=i;}
			if(num>b[i]) {num=b[i];index2=i;}
		}
		c[k]=num;
		k++;
		num=999;
		if(a[index1]<b[index2]) {a[index1]=a[index1]+1000;}
		else {b[index2]=b[index2]+1000;};
		}
		for(int l:c) {
			System.out.println(l);
		}
	}
}
