package myownjavaprogs;
import java.util.*;
public class Pal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		char a[] = new char[5];
		System.out.println("letters?");
		for(i = 0; i<a.length;i++) {
			a[i] = sc.next().charAt(0);}
		
		char b[][] = new char[5][5];
		
		
		int j=0,k=0;i=0;
		
		for(j=0;j<a.length;j++)
		for(k=0;k<a.length;k++){
		if(k==j) {b[j][k]=a[i];i++;}}
		
		
		int m=a.length-1;i=0;
		for(j=0;j<a.length;j++) {
			b[j][m]=a[i];m--;i++; 
		}
		
		
		i=0;
		for(k=0;k<a.length;k++) {
			j=2;
			b[j][k]=a[i];i++;
		}
		
		
		i=0;
		for(j=0;j<a.length;j++) {
			k=2;
			b[j][k]=a[i];i++;
		}
		
		
		
		for(j=0;j<a.length;j++) {
			System.out.println();
			for(k=0;k<a.length;k++) {
				System.out.print(b[j][k]+" ");
			}
		}
	}
}
