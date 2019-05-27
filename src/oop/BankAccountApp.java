package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Create a new bank account - think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Nitin Kumar";
		//with encapsulation : public API methods
		acc1.setName("Nitin Kumar");
		System.out.println(acc1.getName());
		acc1.setSSN("2345674567");
		System.out.println("SSN: " + acc1.getSSN());
		
		acc1.accountNumber = "1019897872";
		acc1.balance = 100000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(2000);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "1012972437";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "1018778230";
		
		/*
		acc2.checkBalance();
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Luis";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		
		*/
		
	}

}
