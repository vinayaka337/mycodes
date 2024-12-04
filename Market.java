/**package myownjavaprogs;
import java.util.*;
class items extends Market{
	void readdata() {
		for(int i=0;i<a.length;i++) {
		System.out.println("NAME OF THE PRODUCT?");
		name=sc.nextLine();
		System.out.println("COST OF A SINGLE PRODUCT?");
		cost=sc.nextInt();
		System.out.println("NO:OF PRODUCTS?");
		no=sc.nextInt();
		sc.next();
		char con;
		System.out.println("DO YOU WANT CONTINUE?");
		con=sc.next().charAt(0);
		if(con=='y') {continue;}
		else {break;}
		for(i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=
			}

		}
	}
	void cal() {
		tot=no*cost;
	}
	void printdata() {
			}
}
public class Market {
	Scanner sc = new Scanner(System.in);
	int a[][]=new int[3][4];
	String name;
	int cost,no,tot;
	
public static void main(String...args) {
	items s1=new items();
	s1.readdata();
	s1.cal();
	s1.printdata();
}
}
**/