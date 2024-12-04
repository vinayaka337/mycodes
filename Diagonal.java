package myownjavaprogs;
import java.util.*;
public class Diagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		boolean flag=true;
		int a [][]=new int [3][3];
		System.out.println("numbers?");
		for(i=0;i<a.length;i++)
		for(j=0;j<a.length;j++) {
			a[i][j]=sc.nextInt();
		if(i>j && (a[i][j]>0)) {flag=false;}
		else if(i<j && (a[i][j]>0)) {flag=false;}
		else if(i==j && (a[i][j]==0)) {flag=false;}
		}
		if(!flag) {System.out.println("it's not a diagonal matrix");}
		else {System.out.println("it's a diagonal matrix");}
	}
}
