import java.util.*;

public class Exercise10_07 {
	public static void main(String[] args) {
		int selection = 0;
		int id;
		double ammount;
		
		Account[] account_array = new Account[10];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			account_array[i] =  new Account(i, 100);
		}
		
		while (true) {
			System.out.print("Please Enter an Account ID: ");
			id = input.nextInt();
			
			while (!((id < 10) && (id >= 0))) {
				System.out.print("Please Enter a valid ID: ");
				id = input.nextInt();
			}
			
			while (!(selection == 4)) {
				System.out.println("Main Menu");
				System.out.println("1. Check Balance");
				System.out.println("2. Withdraw");
				System.out.println("3. Deposit");
				System.out.println("4. Exit");
				System.out.println();
				System.out.println();
				System.out.println();
				
				do {
					
					System.out.print("Enter a selection: ");
					selection = input.nextInt();
					
				} while (!((selection < 5) && (selection > 0)));
				
				if (selection == 1) {
					System.out.printf("The account balance is $%4.2f", account_array[id].getBalance());
					System.out.println();
					System.out.println();
				}
				else if (selection == 2) {
					do {
						
						System.out.print("How much would you like to withdraw (cannot exceed account balance): ");
						ammount = input.nextDouble();
						
					} while (ammount > account_array[id].getBalance());
					
					System.out.println();
					System.out.println();
					
					account_array[id].withdraw(ammount);
				}
				else if (selection == 3) {
					
					System.out.print("How much would you like to deposit: ");
					ammount = input.nextDouble();
					
					System.out.println();
					System.out.println();
					
					account_array[id].deposit(ammount);
				}
				else {
					System.out.println();
					System.out.println();
				}
			}
			selection = 0;
		}
	}
}