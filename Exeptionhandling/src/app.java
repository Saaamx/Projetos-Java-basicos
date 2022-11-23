import java.util.Scanner;

import models.entities.Account;
import models.exeptions.BusinessException;

public class app {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data ");
		System.out.print("number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdraw = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdraw);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("new balance %.2f%n", acc.getBalance());
		}
		catch(BusinessException e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
