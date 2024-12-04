package myownjavaprogs;
import java.util.Iterator;
import java.util.LinkedList;

class llist{
	String name;
	float a,b;
	void setdata() {
		 name="sunny";
		a=10.0f;
		b=20.0f;
	}
}
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<llist> li = new LinkedList<llist>();
llist s1=new llist();
s1.setdata();
li.add(s1);

Iterator it=li.iterator();
while(it.hasNext()) {
	llist i1=(llist) it.next();
System.out.println(i1.a+" "+i1.b+" "+i1.name);
       }

	}


}






