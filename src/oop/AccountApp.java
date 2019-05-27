package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount ls = new LoanAccount();
		ls.increaseRate();
		ls.setRate();
		ls.setAmortSchedule();
		ls.setTerm(20);

		//Polymorphism changes were we are pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}
