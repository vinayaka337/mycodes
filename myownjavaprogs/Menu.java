package myownjavaprogs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Menu {
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1-create");
		System.out.println("2-update");
		System.out.println("3-retrive");
		System.out.println("4-delete");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		
		

		if(ch=='1')
		{
			System.out.println("name of the table?");
			String name=sc.nextLine();
			//System.out.println("checking"+name);
			
			try {
				
				
				String query="CREATE TABLE "+name+" (ID integer , NAME VARCHAR(20))";
				Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
				Statement statement = connection.createStatement();
				String querystr1="select * from name";
				System.out.println("cust name?");
				String custname = sc.nextLine();
				System.out.println("cust num?");
				int numb = sc.nextInt();
				String querystr2="insert into "+name+"(customernumber,name) values("   + numb +   ",'"  +   custname  +  "')"   ;
				PreparedStatement pst=connection.prepareStatement(query);
				System.out.println(querystr2);
				int n=statement.executeUpdate(querystr2); 
				//pst.setString(1,name);
				pst.execute();
				//ResultSet rs=statement.executeQuery(querystr1);
				/*
				while(rs.next())
				{	

					System.out.println(rs.getInt("customernumber")+"  "+rs.getString("name"));
				}
				*/	
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
		}
		
		else if(ch=='2')
		{
			try {
				Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
				Statement statement = connection.createStatement();
	
				System.out.println("table name?");
				String name1=sc.nextLine();
				String sunny="sunny";
				System.out.println("which customer number?");
				char cuupdate=sc.next().charAt(0);
				PreparedStatement pst=connection.prepareStatement("update ? set name=? where customer number=?");
				pst.setString(1,name1);
				pst.setString(2,sunny);
				pst.setInt(3,cuupdate);
				String querystr1="select * from name1";
				int n=pst.executeUpdate();
				ResultSet rs=statement.executeQuery(querystr1);
				while(rs.next())
				{	
					System.out.println(rs.getInt("customernumber")+"  "+rs.getString("name"));
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(ch=='3')
		{
			try {
				Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
				Statement statement = connection.createStatement();
				String querystr1="select * from vinayak";
				ResultSet rs=statement.executeQuery(querystr1);
				while(rs.next())
				{	
					System.out.println(rs.getInt("customernumber")+"  "+rs.getString("name"));
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(ch=='4')
		{
			try {
				System.out.println("table name?");
				String tablename = sc.nextLine();
				System.out.println("do you want to delete entire or a coloum");
				char del = sc.next().charAt(0);
				Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
				Statement statement = connection.createStatement();
				String querystr1="select * from vinayak";

				System.out.println("customer number?");
				int cusnum = sc.nextInt();
				if(del=='e') {
					PreparedStatement pst=connection.prepareStatement("truncate=?");
					pst.setString(1,tablename);
					int n=pst.executeUpdate();
					ResultSet rs=statement.executeQuery(querystr1);
				}
				
				else if(del=='C') {
				PreparedStatement pst=connection.prepareStatement("delete from=? where=?");
				pst.setString(1,tablename);
				pst.setInt(2,cusnum);
				int n=pst.executeUpdate();
				ResultSet rs=statement.executeQuery(querystr1);
				while(rs.next())
				{	
					System.out.println(rs.getInt("customernumber")+"  "+rs.getString("name"));
				}
				
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
					
	}
}
