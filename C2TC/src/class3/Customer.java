package class3;

public class Customer {
	private String customerName;
	private String customerCity;
	private int customerId;
	Customer()
	{
		System.out.println("Default constructor");
	
	} 
	Customer(String customerName, String customerCity, int customerId)
	{
		System.out.println("Parameterized Constructor");
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
	}
		public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String toString() {
		return "cust [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId=" + customerId
				+ "]";
	}

}
