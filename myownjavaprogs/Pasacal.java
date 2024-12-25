package myownjavaprogs;

public class Pasacal {

	public static void main(String[] args) {
		int i,j,k,l;
		for(i=1;i<=5;i++)
		{
			System.out.println();
			for(j=1;j<=5-i;j++) {
			System.out.print(" ");}
			for(k=1;k<=i;k++) { {System.out.print(k);}
			if(k>1&&k==i){for(l=k-1;l>=1;l--) {System.out.print(l);} 
			break;}
			}
		}
	}

}
