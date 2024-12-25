package myownjavaprogs;
import java.util.*;
public class Mdimarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [][] = new int [5][5];
		int i,j;
		System.out.println("numbers?");
		for(i=0;i<3;i++)
		for(j=0;j<2;j++)
			a[i][j]=sc.nextInt();
		
		for(i=0;i<3;i++)
		{System.out.println();
		for(j=0;j<2;j++)
			System.out.print (a[i][j]+" ");
		}
	
	}

}
