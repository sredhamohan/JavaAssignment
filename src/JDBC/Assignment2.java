package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String url = "jdbc:sqlserver://GXWFSDASHDB01\\FISERV_ONBOARD;"
					+ "databaseName=QAPracticeDB;integratedSecurity=true;trustServerCertificate=true";

			Connection con = DriverManager.getConnection(url);

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select*from emp where emp_id=14;");
			while (rs.next())
				System.out.println("Employee designation= " + rs.getString(4));
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
