package myownjavaprogs;
abstract class engineering{
	void branch() {
		System.out.println("BRANCHES IN THE ENGINEERING ARE:-");
	}
}
class cse extends engineering{
	void branch() {
		super.branch();
		System.out.println("cse");
	}
}
class ece extends engineering{
	void branch() {
		System.out.println("ece");
		
	}
}
class eee extends engineering{
	void branch() {
		System.out.println("eee");
	}
}
class mech extends engineering{
	void branch() {
		System.out.println("mech");
	}
}
class civil extends engineering{
	void branch() {
		System.out.println("civil");
	}
}
public class Btech {
public static void main(String...args) {
	
	cse s1 = new cse();
	ece s2 = new ece();
	eee s3 = new eee();
	mech s4 = new mech();
	civil s5 = new civil();
	s1.branch();
	s2.branch();
	s3.branch();
	s4.branch();
	s5.branch();
}
}
