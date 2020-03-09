

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;



	public class JdbcMySql {

		public static void main(String[] args) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","7008876660");
			System.out.println("connection established!!!!!1");
			Statement stmt=dbcon.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM employee");
			while(rs.next())
			{
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				double phone=rs.getDouble("PHONE");
				System.out.println(id+"--"+name+"--"+phone)
	;
				}
			rs.close();
			stmt.close();
			dbcon.close();
		}

	}


