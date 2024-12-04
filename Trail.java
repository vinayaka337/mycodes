package myownjavaprogs;
import javax.swing.*;
public class Trail {
	int roll;String name;
	void setdata(int roll,String name) {
		this.roll=roll;this.name=name;
	}
	void printdata() {
		System.out.println(name);
		System.out.println(roll);
	}
	public static void main(String... args) {
		Trail s1 = new Trail();
		s1.setdata(10,"vinay");
		s1.printdata();
		String n=JOptionPane.showInputDialog("enter any number");
		int num=Integer.parseInt(n);
		
		System.out.println(num);
	
	}
}