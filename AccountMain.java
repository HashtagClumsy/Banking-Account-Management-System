/*Create a package “com.account.test”. 
Create a class “AccountMain” with the main() and displays the following menu 
1. Deposit 
2. Withdraw 
3. Display Balance 
4. Exit */

package com.account.test;

import java.util.Scanner;

import com.account.*;

public class AccountMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		
		Account a = new Account(20300, "Salary", 45000);

		int ch;
		do {
			 
			System.out.println(
					" hello please choose from below " + "\n 1. deposit \n 2. withdraw \n 3. display balance \n 4. exit");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the deposit amount = ");
				double depositAmount = s.nextDouble();
				a.deposit(depositAmount);
				a.display();
				break;
			case 2:
				System.out.println("Enter withdraw amount" );
				double withdrawAmount = s.nextDouble();
				a.withdraw(withdrawAmount);
				a.display();
				break;
			case 3:
				a.display();
				break;
			case 4:
				System.out.println("Thank you for banking");
				System.exit(1);
			default:
				System.out.println("Invalid");
			}
		} while (ch != 4);

		}
	}
	

