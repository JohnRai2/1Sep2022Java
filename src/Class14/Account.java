package Class14;

public class Account {
	int acNumber;
	String holderName;
	float balance;
	
	public Account(int acNumber, String holderName, float balance) {
		this.acNumber = 2121;
		this.holderName = "JA";
		this.balance = 4200;
	}
	
	public Account() {
		super();
		//Constructor Overloading
	}
	
	public void display() {
		System.out.println("Account number: "+
				acNumber+"\nAccount holder name: "+
				holderName+"\nBalance: "
				+balance+"\n");
	}
}
