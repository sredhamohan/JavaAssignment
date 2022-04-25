package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String url = "jdbc:sqlserver://GXWFSDASHDB01\\FISERV_ONBOARD;"
					+ "databaseName=QAPracticeDB;integratedSecurity=true;trustServerCertificate=true";

			Connection con = DriverManager.getConnection(url);

			Statement stmt = con.createStatement();
			String sql = ("Update emp set emp_desig='CEO'where emp_id=14;");

			int count = stmt.executeUpdate(sql);

			System.out.println("Record inserted  : " + count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
