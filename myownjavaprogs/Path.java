package myownjavaprogs;
import java.util.*;
public class Path {

	public static void main(String[] args) {
		String loc,sub=null;int i=0;String loca =null;int index =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("location?");
		loc = sc.nextLine();
		loca = loc;
		String ss;
		System.out.println("from which one?");
		int pos = sc.nextInt();
		int len = loca.length();
		//int index = loc.indexOf('/',pos);

		for(i=1;i<=pos;i++)
			{
			ss=loc.substring(0,loc.indexOf('/'));
			//System.out.println("ss = "+ss);
			index =index + loc.indexOf('/');
			loc=loc.substring(loc.indexOf('/')+1);
			index = index+1;
			//System.out.println("index = "+index);
			//System.out.println(loca);
			//System.out.println(loca.concat(ss)); 
			//System.out.println("loc="+loc);
		}
		//index = (len-index);
		System.out.println("index = "+index);
		System.out.println(loca.substring(index));
		
		
		//System.out.println("location = " +loc.substring(index+1,length));
	}
}