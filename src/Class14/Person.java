package Class14;

public class Person {
	private int id;
	private String name;
	private long contact;
	
	
	//Encapsulation
	public Person(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Class 15 continue.
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
}
