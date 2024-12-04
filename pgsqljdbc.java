package myownjavaprogs;

import java.sql.* ;


public class pgsqljdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydata", "postgres", "postgres");
			Statement statement = connection.createStatement();
			String querystr1="select * from student";
			String querystr2="insert into student (sturoll,name,m1,m2) values (2,'second',99,99)";
			
			//System.out.println("example with jdbc");
			int n=statement.executeUpdate(querystr2);
			ResultSet rs=statement.executeQuery(querystr1);
			while(rs.next())
			{
				System.out.println(rs.getString("sturoll")+"  "+rs.getString("name")+"  "+rs.getInt("m1")+"  "+rs.getInt("m2")+"  "+rs.getInt("tot")+"  "+rs.getInt("average")+"  "+rs.getInt("total"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}