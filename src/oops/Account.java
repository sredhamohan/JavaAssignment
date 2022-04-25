package oops;

public class Account {
	private String accName,emailID;
	private long accNum;
	private double amt;
	
	public String getName() {
		return accName;
		
	}
	public long getAccnum() {
		return accNum;
		
	}
	public String getEmail() {
		return emailID;
		
	}
	public double getAmount() {
		return amt;
		
	}
	public void setName(String name) {
		this.accName=name;
		
	}
	public void setAccNum(long  accNumber) {
		this.accNum=accNumber;
		
	}
	public void setEmailID(String  custmerEmail) {
		this.emailID=custmerEmail;
		
	}
	public void setAmount(double customerAmt) {
		this.amt=customerAmt;
		
	}
	
	
	

}
