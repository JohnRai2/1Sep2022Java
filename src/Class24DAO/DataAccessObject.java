package Class24DAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DataAccessObject<T> {
	public void connect() throws ClassNotFoundException, SQLException;
	public void disconnect() throws ClassNotFoundException, SQLException;
	public int save(T p) throws ClassNotFoundException, SQLException;
	public T getOne(long Id) throws ClassNotFoundException, SQLException;
	public ArrayList<T> getAll() throws ClassNotFoundException, SQLException;
	public int update(T p) throws ClassNotFoundException, SQLException;
	public int delete(long Id) throws ClassNotFoundException, SQLException;
}
