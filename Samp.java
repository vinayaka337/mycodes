package myownjavaprogs;
import javax.swing.*;
class Deriv extends Samp
{
	void show()
	{
		System.out.println("this is from derived");
	}
	
	
}

public class Samp {
	void display() {
      System.out.println("this is from main class");
	}
	
	

	
	public static void main(String... args)
	{
		Samp s1=new Samp();
		s1.display();
		
		Deriv d1=new Deriv();
		d1.show();
		
		d1.display();
		
	}
	
}