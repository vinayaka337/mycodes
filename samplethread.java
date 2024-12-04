//comment added by me
package myownjavaprogs;

public class samplethread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th=new Thread();
		th.run();
		th.setPriority(10);
		System.out.println("thread name"+th.getName()+th.getPriority());
		
	}

}
