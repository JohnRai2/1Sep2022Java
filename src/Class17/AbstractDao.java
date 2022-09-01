package Class17;

//extends for class and implements for interface -> Inheritance.
public abstract class AbstractDao<T> implements DataAccessObject<T> { //Dao = Data Access Object
	@Override
	public void connect() {
		System.out.println("Connected to the database sucessfully");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database");
	}
}