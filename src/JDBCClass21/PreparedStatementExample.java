package JDBCClass21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3308/mydb";
		String username = "root";
		String password = "john";
		
		Class.forName(driver);
		Product p = new Product("Mug", "China", "Coffee Mug", 430.54f, true);
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected to the database...");
		
		String query = "INSERT INTO product (Name, Manufacturer, Description, Price, InStock) VALUES (?,?,?,?,?)";
		
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, p.Name);
		pstm.setString(2, p.Manufacturer);
		pstm.setString(3, p.Description);
		pstm.setFloat(4, p.Price);
		pstm.setBoolean(5, p.InStock);
		pstm.executeUpdate();
		pstm.close();
		con.close();
	}
}
