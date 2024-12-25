package myownjavaprogs;

public class Msgpassing {
	int i;
 void print(int val) {
	  i=val;
 }
 void printdata() {
	 System.out.println(i);
 }
 public static void main(String...args) {
 Msgpassing s1 = new Msgpassing();
 s1.print(10);
 Msgpassing s2 = new Msgpassing();
s1.printdata();
s2=s1;
s2.printdata();
}
}