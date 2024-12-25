package myownjavaprogs;

class Threadextend1 extends Thread {

		public void run()
		{
			try
			{
				for(int i=1;i<11;i++)
				{
					System.out.println("hello "+i);
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("done");
		}
}
		
class Threadextend2 extends Thread{
	public void run() 
	{
		try {
				
			System.out.println("done");
	}
}

public class Threadextend
{
		public static void main(String... args)
		{
			Threadextend1 te1 = new Threadextend1();
			Threadextend2 te2 = new Threadextend2();
			te1.setPriority(9);
			te2.setPriority(8);
			System.out.println("start of thread");
			te1.start();
			te2.start();
			System.out.println("end of thread");

			//try 
			//{
				//te1.join();
				//te2.join();
			//}
			//catch(InterruptedException e) 
			//{
			//	e.printStackTrace();
			//}
		}
}

