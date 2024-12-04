package myownjavaprogs;
interface dis1
{
	void readdata();int i=10;
}


interface dis2 extends dis1
{
	void getdata();
}


class  d3 implements dis1,dis2 
{
	public void readdata()
	{
		System.out.println("this is from readdata");
		System.out.println(i);
	}
	public void getdata()
	{
		System.out.println("this is from getdata");
	}
}


public class Inter1 {
public static void main(String... args)
{
	d3 dc=new d3();
	dc.getdata();
	dc.readdata();
}
}
