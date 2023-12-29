package jdbc;

import java.sql.*;

public class first {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root", "Root123");
		System.out.println("Connection established");
	}

}
