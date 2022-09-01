package JDBCClass21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewAll {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3308/mydb";
		String username = "root";
		String password = "john";
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		
		String query = "SELECT * FROM product";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.executeQuery();
		ResultSet rs = pstm.executeQuery();
		
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product p = new Product(); 
			/*If declared outside object p then it results the last data only as ArrayList 
			only stores address and the address is overwritten resulting in same data output.
			So to change the address we declare it inside the loop to keep on changing its address value.*/ 
			p.id = rs.getInt("Id");
			p.Name = rs.getString("Name");
			p.Manufacturer = rs.getNString("Manufacturer");
			p.Description = rs.getString("Description");
			p.Price = rs.getFloat("Price");
			p.InStock = rs.getBoolean("InStock");
			products.add(p);
		}
		
		//Advanced for loop
		for(Product pd:products) {
			System.out.println(pd);
			System.out.println();
		}
		pstm.close();
		con.close();
	}
}
