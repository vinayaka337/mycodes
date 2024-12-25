package myownjavaprogs;
import java.util.*;
public class Employee {

	 public static void main(String... args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("employee name");
		 String name = sc.nextLine();
		 System.out.println("basic salary");
		 double sal = sc.nextDouble();
		 System.out.println("locality?");
		 char loc = sc.next().charAt(0);
		 System.out.println("position?");
		 char pos = sc.next().charAt(0);
		 double DAd = DA(sal); 
		 double HRAd = HRA(sal,loc);
		 double FAd = FA(sal,pos);
		 double EPFd = EPF(sal);
		 double grosal = DAd+HRAd+FAd+sal;
		 double ITd = IT(grosal);
		 double grored = EPFd+ITd;
		 double finalsal = grosal-grored;
		 System.out.println("DA = "+DAd);
		 System.out.println("HRA = "+HRAd);
		 System.out.println("FA = "+FAd);
		 System.out.println("EPF = "+EPFd);
		 System.out.println("IT = "+ITd);
		 System.out.println("GROSS SALARY = "+grosal);
		 System.out.println("GROSS REDUCTION = "+grored);
		 System.out.println("FINAL SALARY IS = "+finalsal);
	 }
	 
	 	public static double DA(double sals) {
	 		double i=0;
	 		if(sals<10000) {i=(0.05*sals);}
	 		else if(sals<20000) {i=(0.1*sals);}
	 		else if(sals<30000) {i=(0.2*sals);}
	 		return i;
	 	}
	 	
 	
	 	public static double HRA(double sals,char locs) {
	 		double i=0;
	 		if(locs=='r') {i=(0.25*sals);}
	 		else  {sals=(i=0.15*sals);}
	 		return i;
	 	}
	 	
	 	public static double FA(double sals,char poss) {
	 		int i=0;
	 		if(poss=='m'|| poss=='d') {i=2200;}
	 		else {i=1100;}
	 		return i;
	 	}
	 	
	 	public static double EPF(double sals) {
	 		double i;
	 		i=0.12*sals;
	 	    return i;
	 	}
	 	
	 	public static double IT(double grosals) {
	 		double i=0;
	 		i=0.2*grosals;
	 		return i;}
}