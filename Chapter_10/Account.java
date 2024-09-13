public class Account {
	//Data Fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	
	
	//Constructors
	public Account() {
		id = 0;
		balance = 0;
		dateCreated = new java.util.Date();
	} 
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	//Methods
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = (newId >= 0) ? newId : 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return (balance * (annualInterestRate / 12));
	}
	
	public void withdraw(double amountWithdrawn) {
		balance -= amountWithdrawn;
	}
	
	public  void deposit(double amountDeposited) {
		balance += amountDeposited;
	}
}
