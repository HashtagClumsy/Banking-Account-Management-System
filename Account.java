/*Create a package “com.account”.  
Create a class “Account” with the fields acctId, acctType, acctBalance. Use Constructor 
to set the values to these fields. Create the following methods in the Account class 
void deposit(int amount)  
void withdraw(int amount) 
int getBalance() 
void display() */


package com.account;


public class Account {
	
	int acctId;
	String acctType;
	double acctBalance;
	
	public Account (int acctId,String acctType,double acctBalance) {
		this.acctId = acctId;
		this.acctType = acctType;
		this.acctBalance = acctBalance;	
	}
	
	public double deposit(double depositAmount) {
			if (depositAmount < 0) {
				System.out.println("Invalid deposit amount.");
				return 0;
			}
			else {
				acctBalance = acctBalance + depositAmount;
				return acctBalance;
			}
		}
		
	
	public double withdraw(double withdrawAmount) {
		 if (withdrawAmount < 0) {
	            System.out.println("Invalid withdrawal amount.");
	            return 0; 
	        } else if (withdrawAmount > acctBalance) {
	            System.out.println("Insufficient balance.");
	            return acctBalance;
	        } else {
	        	acctBalance = acctBalance - withdrawAmount;
	            System.out.println("Withdrew: " + withdrawAmount);
	            return acctBalance;
	        }
	}	
	
	public double getBalance() {
        return acctBalance;
	}
	

	public void display() {
		System.out.println("Account Number :" + acctId);
		System.out.println("Account Type :" + acctType);
		System.out.println("Account Balance :" + acctBalance);
		System.out.println("---------------------------");

	}
	
}


	
