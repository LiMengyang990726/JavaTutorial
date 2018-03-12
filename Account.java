
public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
		balance = 0;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public int debit(int amount) {
		if(amount<=balance) {
			balance -= amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		
		return balance;
	}
	
	public int transferTo(Account another,int amount) {
		if(amount <= balance) {
			this.balance -= amount;
			another.balance += amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		
		return this.balance;
	}
	
	public String toString() {
		return String.format("Account[id=%s,name=%s,balance=%d]", id,name,balance);
	}
}
