package Class17;

import java.util.ArrayList;

public interface DataAccessObject<T> { //interface - DataAccessObject->(Methods) to interact with database. 
	public void connect(); //No need to write as: public abstract void connect(); Default abstract.
	public void disconnect();
	public int save(T t);
	public T getOne(int id);
	public ArrayList<T>getAll();
	public int update(T t);
	public int delete(int id);
	//Interface is completely an abstract class. 
}
