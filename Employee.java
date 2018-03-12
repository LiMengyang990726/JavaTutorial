
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName,String lastName,int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getName() {
		return String.format(firstName+" "+lastName);
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return 12*salary;
	}
	
	public int raiseSalary(int percent) {
		salary = ((1+percent)*salary)/10;
		return salary;
	}
	
	public String toString() {
		return String.format("Employee[id=%d,name=%s %s,salary=%d]", id,firstName,lastName,salary);
	}
}
