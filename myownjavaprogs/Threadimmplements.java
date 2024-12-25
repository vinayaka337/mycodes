package myownjavaprogs;
import java.util.regex.*;

public class Threadimmplements
{

	public static void main(String... args)
	{
		/*
		 * Threadimmplements ti = new Threadimmplements(); Thread t = new Thread(ti);
		 * t.start();
		 */
		Pattern p=Pattern.compile("/+?");	
		System.out.println("pattern found"+p);
		String ms="/users/vinayak/myown";
		Matcher m=p.matcher(ms);
		boolean b=m.find();
		if(b)
		{
			System.out.println("found at "+b);
			while (m.find())
			System.out.println("starting at "+m.start()+"ending at "+(m.end()-1));
		}
		else
		{
			System.out.println("not found");
		}
	}
	
}
