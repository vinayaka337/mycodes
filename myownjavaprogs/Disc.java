package myownjavaprogs;
import java.util.*;
public class Disc {

	public static void main(String[] args) {
		String name,winner="trial";
		int dis,i=0,j=0,k=0,l=0,lar=1;
		char c;
		Scanner sc = new Scanner(System.in);
		for( ; ; ) {
		System.out.println("name of the participant ?");
		name=sc.nextLine();
		sc.next();
		System.out.println("Distance thrown ?");
		dis=sc.nextInt();
		if(dis<=500) {i++;}
		else if(dis<=300) {j++;}
		else if(dis<=200) {k++;}
		else if(dis<=100) {l++;}
		if(dis>lar) {lar=dis;winner=name;}
		System.out.println("do want to continue?");
		c=sc.next().charAt(0);
		if (c=='y') {continue;};
		System.out.println("number of people who throwed more than 500mts = " +i);
		System.out.println("number of people who throwed more than 300mts = " +j);
		System.out.println("number of people who throwed more than 200mts = " +k);
		System.out.println("number of people who throwed more than 100mts = " +l);
		System.out.println("winner = " +winner);
		System.out.println("longest distance throwed = " +lar);
		break;
		}
	}
}
