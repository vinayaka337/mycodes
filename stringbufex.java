package myownjavaprogs;

public class stringbufex {

	public static void main(String[] args) {
	   
	    String s="sampleeeeeeeeeeee";
	    char []ch=s.toCharArray();

	    //give space between declaration and code
	    //
	    for(int i=0;i<ch.length;i++)
	    {
	    	System.out.println(ch[i]);
	    }
	    StringBuffer sb=new StringBuffer("string buffer");
	    StringBuffer sb1=new StringBuffer("hai");
	    sb1=sb1.append(s);
	    sb1=sb1.delete(5,8);
	    System.out.println("String length "+sb1.length());
	    System.out.println("String buffer value is "+sb1);
	    System.out.println("String buffer capacity is"+sb1.capacity());
	    sb.reverse();
	    System.out.println("Revered string is "+sb);
    }
}
