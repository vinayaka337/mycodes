package myownjavaprogs;
class B extends Hybrid{
	void display() {
		System.out.println("B");
		super.display();
	}
}
class C extends B{
	void display() {
		System.out.println("c");
		super.display();
	}
}
public class Hybrid {
 void display() {
	 System.out.println("A");
 }
 public static void main(String... args) {
C s1 = new C();
s1.display();
}
}