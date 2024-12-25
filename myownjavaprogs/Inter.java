package myownjavaprogs;

interface Animal1
{
	  void bark();
}

class dog1 implements Animal1
{
	public void bark() {
		System.out.println("BOW BOW");
	}
}

class cat1 implements Animal1
{
	public void bark() {
		System.out.println("MEOW MEOW");
	}
}
public class Inter {

public static void main(String... args) {
  dog1 d1=new dog1();
  cat1 c1=new cat1();
  
  d1.bark();
  c1.bark();
}
}

