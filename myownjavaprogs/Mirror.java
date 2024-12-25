package myownjavaprogs;
import java.util.*;
public class Mirror {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("numbers");
		for(int i=1;i<=a.length;i++) {
			a[i-1]=sc.nextInt();
			}
		for(int i=0;i<a.length/2;i++) {
			int temp = a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1] =temp;
		}
		for(int j:a) {System.out.println(j);}
	}

}
