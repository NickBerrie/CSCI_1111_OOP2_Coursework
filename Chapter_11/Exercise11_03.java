class Exercise11_03 {
	public static void main(String[] args) {
		Account testAccount = new Account();
		CheckingAccount testChecking = new CheckingAccount();
		SavingsAccount testSavings = new SavingsAccount();
		
		testAccount.accountToString();
		testChecking.accountToString();
		testSavings.accountToString();
	}
}