package JDBCClass21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3308/mydb";
		String username = "root";
		String password = "john";
		
		Class.forName(driver);
		//Class22 - Class21 Continue, Here
		Product p = new Product("Mug", "China", "Coffee Mug", 430.54f, true);//To Here
				
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected to the database...");
		
		//SQL Query
		String query = "INSERT INTO product (Name, Manufacturer, Description, Price, InStock) VALUES ('"
		+p.Name+"', '"
		+p.Manufacturer+"', '"
		+p.Description+"', "
		+p.Price+", "
		+p.InStock+")";
		System.out.println();
		System.out.println(query);
		Statement stm = con.createStatement();
		stm.executeUpdate(query);
		con.close();
	}
}
