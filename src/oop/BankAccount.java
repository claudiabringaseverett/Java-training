package oop;

public class BankAccount implements IRate {

	//Define variables
	String accountNumber;
	
	//static belongs to the class not the object
	//final is constant often static final
	private static final String routingNumber = "678329";
	
	//Instance variables
	private String name;
	private String SSN;
	String accountType;
	double balance;

	//Constructor definitions: unique methods
		//1. They are used to define and setup/ initialize properties of an object
		//2. Constructors are implicitly called upon instantiations
		//3. The same name as the class itself
		//4. Constructors have no return type
	
	BankAccount() {
		System.out.println("New account created");
	}
	//Overloading: called same method with different arguments
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		//initDeposit, accountType, Msg are local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit: " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimun deposit must be at least $1,000.";	
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Getters // Setters
	
	//Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
	}
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
	}
	
	//Private can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your Recent Transaction: " + activity);
		System.out.println("Your New Balance is: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " , Account: " + accountNumber + ", Routing #" + routingNumber + ", Balance: $" + balance + "]";
	}

}

