package myownjavaprogs;
import java.util.*;
class addr{
	Scanner sc = new Scanner(System.in);
	String addr,mandal,dist,state;
	
	void getaddr() {
	System.out.println("add?");
	addr = sc.nextLine();
	System.out.println("mandal?");
	mandal=sc.nextLine();
	System.out.println("dist?");
	dist=sc.nextLine();
	System.out.println("state?");
	state=sc.nextLine();
	}
	
	void printaddr() {
	System.out.println(addr+","+mandal+","+dist+","+state);	
	}
}
public class Aggregation {
int roll,m1,m2;
String name;
addr sadd=new addr();
void readdata() {
	Scanner sc = new Scanner(System.in);
	System.out.println("roll?");
	roll=sc.nextInt();
	System.out.println("marks in the first subject?");
	m1=sc.nextInt();
	System.out.println("marks in the second subject?");
	m2=sc.nextInt();
	System.out.println("name?");
	name=sc.nextLine();
	//sc.next().charAt(0);
	sc.next();
	sadd.getaddr();
}
void printdata() {
	System.out.println(name);
	System.out.println(roll);
	System.out.println(m1);
	System.out.println(m2);
	sadd.printaddr();
}
public static void main(String... args) {
Aggregation s1 = new Aggregation();
s1.readdata();
s1.printdata();
}
}