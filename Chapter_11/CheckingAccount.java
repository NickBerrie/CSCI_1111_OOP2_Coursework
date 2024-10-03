public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	CheckingAccount() {
		overdraftLimit = 500;
	}
	
	CheckingAccount(int newId, double newBalance, double newOverdraftLimit) {
		overdraftLimit = newOverdraftLimit;
		setId(newId);
		setBalance(newBalance);
	}
	
	@Override public void withdraw(double amountWithdrawn) {
		if (!((getBalance() - amountWithdrawn) < -overdraftLimit)) {
			withdraw(amountWithdrawn);
		}
		
		else {
			System.out.println("Error: Exceeds Overdraft Limit");
		}
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double newOverdraftLimit) {
		if (newOverdraftLimit >= 0) {
			overdraftLimit = newOverdraftLimit;
		}
		
		else {
			System.out.println("Error: Overdraft Limit can't be less than 0");
		}
	}
	
	@Override public void accountToString() {
		System.out.println("Account ID: " + getId());
		System.out.println("Balance: " + getBalance());
		System.out.println("Date Created: " + getDateCreated());
		System.out.println("Overdraft Limit: " + getId());
		System.out.println();
	}
}