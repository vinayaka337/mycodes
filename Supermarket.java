package myownjavaprogs;
import java.util.*;
public class Supermarket {
	String name,prodName;
	int num,cost;
	
	void custName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("customer name?");
		name=sc.nextLine();
	}
	
	void readdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name of the product?");
		prodName=sc.nextLine();
		System.out.println("number of pieces?");
		num=sc.nextInt();
		System.out.println("cost of a single pieces?");
		cost=sc.nextInt();
		}
	    
		void printdat() {
			System.out.print("PRODUCT NAME");
			System.out.print("      COST OF A SINGLE PIECE");
			System.out.println("     NUMBER OF PIECES");
		}
	
		void printdata() {
			//System.out.println("CUSTOMER NAME = "+name);
			System.out.print(prodName);
			System.out.print("     			   "+cost);
			System.out.println("     		     "+num);
		}
		
		int gettot() {
			return num*cost;
		}
		
		public static void main(String... args) {
			Supermarket s0 = new Supermarket();
			//s0.custName();
			Scanner sc = new Scanner(System.in);
			Supermarket[] s1 = new Supermarket[5];
			for(int i=0;i<3;i++) 
			{
				s1[i]=new Supermarket();
				s1[i].readdata();
				s1[i].printdata();
				s1[i].gettot();
				System.out.println("TOTAL = "+s1[0].gettot());
				char flag;
				System.out.println("DO YOU WANT TO CONTINUE?  Y or N  ?");
				flag = sc.next().charAt(0);
				if(flag=='n') {break;}
			}
			s0.printdat();
			for(int i=0;i<3;i++) {
				System.out.print(" ");
				s1[i].printdata();
			}
		}
}
