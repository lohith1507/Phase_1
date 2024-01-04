package com.to;

import java.util.Scanner;

public class WalletBalance {
	public double balance = 18950;

	public void addAmount() {
		
		System.out.println("YOUR CURRENT WALLET BALANCE IS  - INR." + balance);
		System.out.print("\nDO YOU WANT TO DIPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO) - ");
	
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		switch(amount) {
		case 1:
			System.out.print("Enter the amount (INR) - ");
			double addingAmount = sc.nextDouble();
			double balance1 = balance+addingAmount;
			System.out.println("\nYOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE - INR."+balance1);
			break;

		case 2:
			System.out.println("\nYOUR CURRENT WALLET BALANCE IS  - INR." + balance);
			break;
			
		default:
			System.out.println("YOU HAVE MADE AN INVALID CHOICE.!");
            break;
		}
		
	}
	

}
