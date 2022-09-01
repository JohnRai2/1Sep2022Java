package Class24DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends AbstractDao<Product>{
	
	PreparedStatement pstm;
	ResultSet rs;
	String sql;
	int i;
	
	@Override
	public int save(Product p) throws ClassNotFoundException, SQLException {
		sql = "INSERT INTO product (Name, Manufacturer, Description, Price, InStock) VALUES (?,?,?,?,?)";
		connect();
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setBoolean(5, p.isInStock());
		pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Product getOne(long Id) throws ClassNotFoundException, SQLException {
		sql = "SELECT * FROM product WHERE Id = ?";
		connect();
		pstm = con.prepareStatement(sql);
		pstm.setLong(1, Id);
		rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.setId(rs.getLong("Id"));
			p.setName(rs.getNString("Name"));
			p.setManufacturer(rs.getString("Manufacturer"));
			p.setDescription(rs.getString("Description"));
			p.setPrice(rs.getFloat("Price"));
			p.setInStock(rs.getBoolean("InStock"));
		}
		disconnect();
		return p;
	}

	@Override
	public ArrayList<Product> getAll() throws ClassNotFoundException, SQLException {
		sql = "SELECT * FROM product";
		connect();
		pstm = con.prepareStatement(sql);
		rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product p = new Product();
			p.setId(rs.getLong("Id"));
			p.setName(rs.getNString("Name"));
			p.setManufacturer(rs.getString("Manufacturer"));
			p.setDescription(rs.getString("Description"));
			p.setPrice(rs.getFloat("Price"));
			p.setInStock(rs.getBoolean("InStock"));
			products.add(p);
		}
		disconnect();
		return products;
	}

	@Override
	public int update(Product p) throws ClassNotFoundException, SQLException {
		sql = "UPDATE product SET Name = ?, Manufacturer = ?, Description = ?, Price = ?, InStock = ? WHERE Id = ?"; 
		connect();
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setBoolean(5, p.isInStock());
		pstm.setLong(6, p.getId());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(long Id) throws ClassNotFoundException, SQLException {
		sql = "DELETE FROM product WHERE Id = ?";
		connect();
		pstm = con.prepareStatement(sql);
		pstm.setLong(1, Id);
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}	
}
