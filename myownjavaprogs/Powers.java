package myownjavaprogs;
import java.util.*;
public class Powers {
	
public static void main(String... args) {
	int n,p;

	Scanner sc = new Scanner(System.in);
	System.out.println("number?");
    n=sc.nextInt();
    System.out.println("power?");
    p=sc.nextInt();
    int powerp=power(n,p);    
    System.out.println("power of a number = "+powerp);
}


public static int power(int nn,int pp) {
   int prod=1;
	for(int i=1;i<=pp;i++) {
		prod=prod*nn;
	}
	return prod;
}
}
