package myownjavaprogs;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Bill {
	
	public static void main(String... args) throws SQLException 
	{
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
		Statement statement = connection.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		
		// create customer table
		String query;
		query="CREATE TABLE if not exists CUST (cno integer primary key, cname VARCHAR(20) , billamt integer)";
        statement.execute(query);
        
        //create items table
		query="CREATE TABLE if not exists items (cno integer  , itemname VARCHAR(20) , qty integer , rpq integer , amount integer)";
        statement.execute(query);
	
      for(;;)
      {
		//read the customer details
		System.out.println("customer name?");
		String cname = sc.nextLine();
		System.out.println("customer number?");
		int cno = sc.nextInt();
        
		//insert customer details into customer table
		String querystr2="insert into cust (cno,cname) values ("
				+cno
				+",'"
				+cname
				+"')";
		statement.executeUpdate(querystr2);
		
		
		query="truncate items";
		statement.executeUpdate(query);
		
		
		    int bamt=0;
			for(;;) {
				sc.nextLine();
				System.out.println("item name?");
				String iname = sc.nextLine();
			    
				System.out.println("quantity?");
				int qn = sc.nextInt();
				System.out.println("rate per quantity?");
				int rpq = sc.nextInt();
				int amt=qn*rpq;

				query="insert into items values ("
							+cno
							+",'"
							+iname
							+"',"
							+qn
							+","
							+rpq
							+","
							+amt
							+")";
				//write a row into items table
				statement.executeUpdate(query);
				
				bamt = bamt+amt;
			    
				//ask for another item is there?
				System.out.println("do you want to continue yes or no?");
				char ch = sc.next().charAt(0);
				if(ch=='y') {
					continue;
				}
				else 
					break;
			}
			
			query="update cust set billamt="+bamt+" where cno="+cno;
			statement.executeUpdate(query);
			
			
			//print the bill for the customer
			System.out.println("Customer Number="+cno+" Customer Name="+cname);
			
			
			query="select * from items";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
					System.out.println(rs.getString("itemname")+" "+rs.getInt("qty")+" "+rs.getInt("rpq")+" "+rs.getInt("amount"));
			}
			System.out.println("==========================");
			System.out.println("Total bill amount="+bamt);
			System.out.println("End of customer Bill");
			System.out.println("==========================");
			
			System.out.println("Any more customers yes or no?");
			char ch = sc.next().charAt(0);
			if(ch=='y') {
				continue;
			}
			else 
				break;
			
      }	
			
			
			
  }
}