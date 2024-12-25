package myownjavaprogs;

import java.util.ArrayList;
public class Coll_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Float> ar=new ArrayList<Float>();
      ar.add(10.0f);
      ar.add(20.1f);
      ar.add(30.2f);
      
      System.out.println(ar);
      for(float i:ar)
    	  System.out.println(i);
	}

}
