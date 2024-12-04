package myownjavaprogs;
import java.util.*;
public class Train {

	public static void main(String[] args) {

		int a[][]=new int[6][];
		for(int i=0;i<6;i++) {

			a[i]=new int[3];
			i++;
			a[i]=new int[3];
			i++;
			a[i]=new int[2];
		}
		
		
			int j=1,k=1;
			for(int i=0;i<a.length;i++) {
				{for (j=0;j<a[i].length;j++) {a[i][j]=k;k++;}
			}
			
		}
			Scanner sc = new Scanner(System.in);
			System.out.println("TYPE 1 FOR BOOKING");
			System.out.println("TYPE 2 FOR VIEW");
			int info = sc.nextInt();
			if (info == 1) {
				System.out.println("TYPE 1 FOR RIGHT");
				System.out.println("TYPE 2 FOR LEFT");
				System.out.println("TYPE 3 FOR SIDE");
				int direction = sc.nextInt();
				if(direction ==1) {{System.out.println("TYPE 1 FOR LOWER");}
				System.out.println("TYPE 2 FOR MIDDLE");
				System.out.println("TYPE 3 FOR UPPER");
				int seat = sc.nextInt();
				int i=0;
				if(seat ==1) {for(i=0;i<a.length;i=i+3) {if(a[i][0]<20) {System.out.println(a[i][0]+"SEAT IS FREE");a[i][0]=99;}else System.out.println("SEAT IS BOOKED");}}
				if(seat ==2) {for(i=0;i<a.length;i=i+3) {if(a[i][1]<20) {System.out.println(a[i][0]+"SEAT IS FREE");a[i][1]=99;}else System.out.println("SEAT IS BOOKED");}}
				if(seat ==3) {for(i=0;i<a.length;i=i+3) {if(a[i][2]<20) {System.out.println(a[i][0]+"SEAT IS FREE");a[i][2]=99;}else System.out.println("SEAT IS BOOKED");}}
				}
				else if(direction ==2) {{System.out.println("TYPE 1 FOR LOWER");}
				System.out.println("TYPE 2 FOR MIDDLE");
				System.out.println("TYPE 3 FOR UPPER");
				int seat = sc.nextInt();
				int l=1;
				if(seat ==1) {for(l=1;l<a.length;l=l+3) {if(a[l][0]<20) {System.out.println(a[l][0]+"SEAT IS FREE");a[l][0]=99;}else System.out.println("SEAT IS BOOKED");}}
				if(seat ==2) {for(l=1;l<a.length;l=l+3) {if(a[l][1]<20) {System.out.println(a[l][0]+"SEAT IS FREE");a[l][1]=99;}else System.out.println("SEAT IS BOOKED");}}
				if(seat ==3) {for(l=1;l<a.length;l=l+3) {if(a[l][2]<20) {System.out.println(a[l][0]+"SEAT IS FREE");a[l][2]=99;}else System.out.println("SEAT IS BOOKED");}}
				}
				else if(direction ==3) {{System.out.println("TYPE 1 FOR LOWER");}
				System.out.println("TYPE 2 FOR UPPER");
				int seat = sc.nextInt();
				int m=2;
				if(seat ==1) {for(m=2;m<a.length;m=m+3) {if(a[m][0]<20) {System.out.println(a[m][0]+"SEAT IS FREE");a[m][0]=99;}else System.out.println("SEAT IS BOOKED");}}
				if(seat ==2) {for(m=2;m<a.length;m=m+3) {if(a[m][1]<20) {System.out.println(a[m][0]+"SEAT IS FREE");a[m][1]=99;}else System.out.println("SEAT IS BOOKED");}}
				}
			}
				
			
			if (info == 2) 	{for( int i=0;i<a.length;i++) {
					System.out.println();
					for(  j=0;j<a[i].length;j++) {
						System.out.print(a[i][j]+" ");}
						
			}
		}
	}
}