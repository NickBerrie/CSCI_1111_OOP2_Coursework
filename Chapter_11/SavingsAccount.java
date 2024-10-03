import javax.crypto.spec.*;

public class SavingsAccount extends Account {
	
	SavingsAccount() {
		
	}
	
	SavingsAccount(int newId, double newBalance) {
		setId(newId);
		setBalance(newBalance);
	}
	
	@Override public void withdraw(double amountWithdrawn) {
		if ((getBalance() - amountWithdrawn) < getBalance()) {
			withdraw(amountWithdrawn);
		}
		else {
			System.out.println("Error: Overdrawn");
		}
	}
}