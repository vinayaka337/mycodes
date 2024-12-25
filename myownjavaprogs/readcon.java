package myownjavaprogs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class readcon {
 public static void main(String... args) 
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("name?");
	 String namee = sc.nextLine();

	 System.out.println("roll number?");
	 int sturolln = sc.nextInt();
	 System.out.println("marks in first subject?");
	 int m01 = sc.nextInt();
	 System.out.println("marks in second subject?");
	 int m02 = sc.nextInt();
	 
	 
	 
	 try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
			Statement statement = connection.createStatement();
			String querystr1="select * from student";
			//String querystr2="insert into student(sturoll,name,m1,m2) values("   + sturolln +   ",'"  +   namee  +  "',"  +  m01  +  ","  +  m02 +  ")"   ;
			PreparedStatement pst=connection.prepareStatement("insert into student (sturoll,name,m1,m2) values (?,?,?,?)");
			pst.setInt(1,sturolln);
			pst.setString(2, namee);
			pst.setInt(3, m01);
			pst.setInt(4, m02);
 			//System.out.println(querystr2);
			
			
			//System.out.println("example with jdbc");
			//int n=statement.executeUpdate(querystr2);
			int n=pst.executeUpdate();
			ResultSet rs=statement.executeQuery(querystr1);
			while(rs.next())
			{	
				int avg = (rs.getInt("m1")+rs.getInt("m2"))/2;
				System.out.println(rs.getInt("sturoll")+"  "+rs.getString("name")+"  "+rs.getInt("m1")+"  "+rs.getInt("m2")+" "+avg);
				
			//+rs.getInt("tot")+"  "+rs.getInt("average")+"  "+rs.getInt("total"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
}
