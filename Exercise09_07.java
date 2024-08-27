class Exercise09_07 {
	public static void main(String[] args) {
		//Create Account
		Account account1 = new Account(1122, 20000);
		Account.setAnnualInterestRate(0.045);
		
		//Inital Info
		System.out.println("Account: " + account1.getId());
		System.out.print("Balance: $");
		System.out.printf("%4.2f", account1.getBalance());
		System.out.println("     Annual Interest Rate: " + Account.getAnnualInterestRate());
		System.out.println();
		
		//Withdraw
		account1.withdraw(2500);
		System.out.print("Balance: $");
		System.out.printf("%4.2f", account1.getBalance());
		System.out.println();
		System.out.println();
		
		//Deposit
		account1.deposit(3000);
		System.out.print("Balance: $");
		System.out.printf("%4.2f", account1.getBalance());
		System.out.println();
		System.out.println();
		
		//Final Info
		System.out.println("Account: " + account1.getId());
		System.out.println("Balance: $" + account1.getBalance());
		System.out.print("Monthly Interest: ");
		System.out.printf("%4.2f", account1.getMonthlyInterest());
		System.out.println("Account Created: " + account1.getDateCreated());
	}
}