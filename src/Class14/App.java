package Class14;

public class App {
	public static void main(String[] args) {
		Account ac = new Account(); //returns objects of class App in ac. Known as default constructor.
		ac.acNumber = 1212;
		ac.holderName = "AJ";
		ac.balance = 2400f;
		ac.display();
		
		Account ac1 = new Account(2121, "JA", 4200f);
		ac1.display();
		
		//class 15 continue.
		Person p = new Person();
		p.setId(123);
		System.out.println(p.getId());
		
		p.setName("AJAX");
		System.out.println(p.getName());
		
		p.setContact(989898);
		System.out.println(p.getContact());
	}
}
