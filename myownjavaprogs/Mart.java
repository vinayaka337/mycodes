package myownjavaprogs;
import java.util.*;
public class Mart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sl,quantity,cost,tot,i=1,total=0;
		String Name;
		char any;
		for( ; ; )
		{
		System.out.println("serial number");
		sl=sc.nextInt();
		System.out.println("name of the item");
		Name = sc.nextLine();
		sc.next();
		System.out.println("quantity");
		quantity = sc.nextInt();
		System.out.println("cost");
		cost = sc.nextInt();
		tot=cost*quantity;
		total = total+tot;
		System.out.println("number of items = " +i++);
		System.out.println("total = " +total);
		System.out.println("more items? yes or no?");
		any=sc.next().charAt(0);
		if(any=='n') break;
		}
		System.out.println("TOTAL = " +total);
	}
}