package myownjavaprogs;
import java.util.*;

class itemmm{
	Scanner sc = new Scanner(System.in);
	String itemname;int qnty;double rpq,amt;
	void setdata(){

		System.out.println("ITEM NAME");
		itemname=sc.nextLine();
		System.out.println("RATE PER QUANTITY");
		rpq=sc.nextInt();
		System.out.println("QUANTITY?");
		qnty=sc.nextInt();
		amt=qnty*rpq;
		
		
	}
}
public class Marketbill {
	public static void main(String... args) {
		double tot=0;
		ArrayList<itemmm> ar=new ArrayList<itemmm>();
		for(;;) {
		Scanner sc = new Scanner(System.in);
		itemmm s1=new itemmm();
		s1.setdata();
		System.out.println("do you want to add or delete the item?");
		char d=sc.next().charAt(0);
		if(d=='a') {ar.add(s1);}
		else {ar.remove(s1);}
		System.out.println("do you want to continue?");
		char s=sc.next().charAt(0);
		if(s=='y') {continue;}
		else {
		System.out.println("[item name] [rpq]");
	
		Iterator it=ar.iterator();
		while(it.hasNext())
		{
			itemmm i1=(itemmm) it.next();
			tot=tot+i1.amt;
			System.out.println("item : "+i1.itemname+" quantity = "+i1.qnty+" rpq = "+i1.rpq+" amount = "+i1.amt);
		}
		System.out.println("TOTAL = "+tot);
		//System.out.println(ar);
		break;
		
		}
		}
		
		
	}
}

