package myownjavaprogs;
import java.util.*;
class item{
	Scanner sc = new Scanner(System.in);
	String itemname;int qnty;double rpq,amt;
	void setdata() {
		System.out.println("ITEM NAME");
		itemname=sc.nextLine();
		System.out.println("QUANTITY");
		qnty=sc.nextInt();
		System.out.println("RATE PER QUANTITY");
		rpq=sc.nextInt();
		amt=qnty*rpq;

	}
}
public class Customer {
	Scanner sc = new Scanner(System.in);
	static int cno;
	static String cname;
	item[] ilist;
	int count=0;
	double tot=0;
	Customer(int pcno,String pcname)
	{
		cno=pcno;
		cname=pcname;
	}
	void getitems() {
		        
				ilist[count]=new item();
		        ilist[count].setdata();
		        tot=tot+ilist[count].amt;
		        count++;
	}
	
	void printdata()
	{
		System.out.println("Customer number	 = "+cno);
		System.out.println("Customer Name	 = "+cname);
		for(int j=0;j<count;j++)
		{
			System.out.println("itemname"+"  "+"quantity"+"  "+"rpq"+"  "+"amount");
			System.out.println(ilist[j].itemname+"            "+ilist[j].qnty+"      "+ilist[j].rpq+"   "+ilist[j].amt);
		}
		System.out.println("total = "+tot);
	}
	public static void main(String...args) {
	Customer s1 = new Customer(1,"sunny");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of items");
	int noi=sc.nextInt();
	s1.ilist=new item[noi];
	for(int i=1;i<=noi;i++)
	{
      s1.getitems();
	}
	s1.printdata();
	sc.close();
}
}
