package myownjavaprogs;

public class Prime {

	public static void main(String[] args) {
		int i, j, k, l, m;
		for (i = 1; i <= 15; i++) {
			System.out.println();
			for (j = 2; j <= 15 - i; j++) {
				System.out.print(" ");
			}
			for (k = 2; k <= i; k++) {
				int flag = 1;
				for (m = 2; m <= k; m++) {
					if (k % m == 0) {
						flag = 0;
					}
					;
					if (flag == 1||k==2) {
						System.out.print(k);
					}
					// if(k>1&&k==i){for(l=k-1;l>=1;l--) {System.out.print(l);}}
				}
			}
		}
	}
}
