package myownjavaprogs;
class deri extends Pri {
	void printdata() {
       readdata();
	}
}


class Pri {
	  protected int a=10;
	
	protected void setdata(int p) {
		a=p;
	}
	void readdata()
	{
		System.out.println(a);
	}




public static void main(String...args) {
	deri de = new deri();
	de.a=25;
	de.a=10;
	de.setdata(1);
	de.printdata();
integer.	
	//int n=235;
	//int revn=Integer.reverse(n);
}
}
