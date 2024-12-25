package myownjavaprogs;
import java.util.*;
public class Dowhile {

	public static void main(String[] args) {
		char c;int sum=0;String prod=null,cumprod="";String name;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("name of the product");
			name = sc.nextLine();
			//sc.next();
			System.out.println("cost of the product");
			int cost = sc.nextInt();
			//System.out.println(name);
			System.out.println("no:of quantity?");
			int quan = sc.nextInt();
			System.out.println("do want to continue? y or n");
			c = sc.next().charAt(0);sc.nextLine();
			prod= ("name of the product = "+name+"   quantity = "+quan+"   cost = "+ cost+"   total = "+quan*cost);
			sum=sum+quan*cost;
			cumprod=cumprod.concat(prod+"\n");
			//System.out.println(cumprod);
			//System.out.println(Name+"="+cost);
		}
		while( c=='y' );
		System.out.println(cumprod);
		System.out.println("total = "+sum);
	}
}