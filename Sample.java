package myownjavaprogs;

public class Sample {
		static int i=1,j=2;
		void printdata() {
			System.out.println(i+" "+j);
		}
		void trial()
		{
			System.out.println("tis is from trial method");
		}
		
		
		
		public static void main(String... args) {
			int k=3,l=4;
			
			Sample s1=new Sample();
			
			System.out.println(i);
			System.out.println(j);
			s1.printdata();
			System.out.println(k);
			System.out.println(l);
			s1.trial();
		}
}
