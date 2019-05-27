package oop;

public class LoanAccount implements IRate {

	@override
	public void setRate() {
		System.out.println("Rate");
	}
	
	@override
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	
	public void setTerm(int terms) {
		System.out.println("Setting the termn to: " + terms + " years.");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization Schedule");
	}


}
