package myownjavaprogs;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [][]=new int [5][5];
		for(int i=0;i<a.length;i++)
		for(int j=0;j<a.length;j++) {
			//if(i==j) {a[i][j]=1;}
			if((i==0 || j==0)||(i==a.length-1 || j==a.length-1)) {a[i][j]=1;}
			else if(i==1 || j==1 || i==a.length-2 || j==a.length-2) {a[i][j]=2;}
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println();
		for(int j=0;j<a.length;j++)
			System.out.print(a[i][j]+" ");
		}
	}

}
