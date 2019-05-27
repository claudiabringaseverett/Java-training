package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("228458970", 1000);
		BankAccount acc2 = new BankAccount("657568765", 5000);
		BankAccount acc3 = new BankAccount("231986750", 2500);
		
		acc1.setName("Tim");
		System.out.println(acc1.getName());	
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		//	acc1.payBill(300);
		acc1.accrue();
	}

}

class BankAccount implements IInterest {
	//Properties of Bank Account
	private static int iD = 1001; //ID + 2 digit random number + first of 2 SSN
	private String accountNumber;
	private static final String routingNumber = "004787524";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBillPaying(double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making Deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
}