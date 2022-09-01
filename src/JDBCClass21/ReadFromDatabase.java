//Class23
package JDBCClass21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadFromDatabase {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3308/mydb";
		String username = "root";
		String password = "john";
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		
		String query = "SELECT * FROM product WHERE Id = ?";
		PreparedStatement pstm = con.prepareStatement(query);
		
		System.out.println("Enter the Id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		pstm.setInt(1, id);
		pstm.executeQuery();
		ResultSet rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.id = rs.getInt("Id");
			p.Name = rs.getString("Name");
			p.Manufacturer = rs.getNString("Manufacturer");
			p.Description = rs.getString("Description");
			p.Price = rs.getFloat("Price");
			p.InStock = rs.getBoolean("InStock");
			
			System.out.println();
			System.out.println(p);
		}else {
			System.out.println();
			System.out.println("Product not found");
		}
		pstm.close();
		con.close();
	}
}
