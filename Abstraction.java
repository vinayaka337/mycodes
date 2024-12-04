package myownjavaprogs;

abstract class Animal
{
	abstract void bark();
}

class dog extends Animal
{
	void bark() {
		System.out.println("BOW BOW");
	}
}

class cat extends Animal
{
	void bark() {
		System.out.println("MEOW MEOW");
	}
}
public class Abstraction {

public static void main(String... args) {
  dog d1=new dog();
  cat c1=new cat();
  
  d1.bark();
  c1.bark();
}
}

