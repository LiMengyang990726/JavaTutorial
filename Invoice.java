
public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;
	
	public Invoice(int ID, Customer customer,double amount) {
		this.ID = ID;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getID() {
		return ID;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return customer.getID();
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return amount*(1-((double)customer.getDiscount()/100));
	}
	
	public String toString() {
		return String.format("Invoice[id=%d,customer=%s,amount=%.1f]", ID,customer,amount);
	}
}
