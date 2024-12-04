package myownjavaprogs;
import java.util.*;
public class Busticket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("from?");
		String from = sc.nextLine();
		System.out.println("to?");
		String to = sc.nextLine();
		sc.next();
		int a[][] = {{20},
					{30,15},
					{40,20,10},
					{50,30,20,10},
					{55,35,25,15,5}};
			
		
		for (int i=0;i<a.length;i++) {
			
		}
		
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println();
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+" ");}
	}

}