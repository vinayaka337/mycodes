package myownjavaprogs;
import java.util.*;
public class Op {

	public static void main(String[] args) {
		double n1,n2,tot=0;
		int op;
		Scanner sc = new Scanner(System.in);
		for( ; ; )
		{
			System.out.println("MENU");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBSTRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("5.EXIT");
			System.out.print("CHOICE = ");
			op = sc.nextInt();
			if(op==5) {break;}
			System.out.print("n1 = ");
			n1=sc.nextInt();
			System.out.println("n2 = ");
			n2=sc.nextInt();
			switch (op) 
			{
			case 1:tot=n1+n2;
				break;
			case 2:tot=n1-n2;
				break;
			case 3:tot=n1*n2;
				break;
			case 4:tot=n1/n2;
				break;
			}
			System.out.println("TOTAL = " +tot);
		}
	}

}
