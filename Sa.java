package myownjavaprogs;
import java.util.*;
public class Sa {

	public static void main(String[] args) {
		int a[] =new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("numbers?");
		for(int i=1;i<=a.length;i++) {
			a[i-1]=sc.nextInt();
		}
		for(int j=1;j<a.length/2;j++) {
			int num1,num2,k = 0;
			int last = 4;
			num1=a[k++];
			num2=a[last--];
			last++;k--;
			a[last--]=num1;
			a[k++]=num2;			
		}
		for(int l:a) {System.out.println(l);}
	}
}