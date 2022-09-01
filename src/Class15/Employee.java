package Class15;

//Child
public class Employee extends InheritanceExample{
	int empId;
	String position;
	float Salary;
	public void display() {
		super.display();
		System.out.println("\nEmployee Id: "+empId+
							"\nPosition: "+position+
							"\nSalary: "+Salary);
	}
	public void parentdisplay() {
		super.display();
	}
}
