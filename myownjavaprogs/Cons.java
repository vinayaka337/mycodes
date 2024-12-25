package myownjavaprogs;

public class Cons {
	int roll,m1,m2;
	String name;
	final int a=0;
	Cons(int p_roll,String p_name,int p_m1,int p_m2){
		roll=p_roll;
		name=p_name;
		m1=p_m1;
		m2=p_m2;
	}
	void printdata() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(a);
	}
	


public static void main(String... args) {
	Cons s1 = new Cons(1,"sunny",20,18);
	s1.printdata();
}
}