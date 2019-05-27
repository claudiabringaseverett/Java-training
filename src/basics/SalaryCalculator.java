package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//lets create variable to define career
		
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		//Defined variable
		career = "Software Engineer";
		System.out.println("My career is: "+ career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary has a " + career + " at the rate of $" +rate+ " is $" + salary + " per year.");
		
		//compute our annual salary
		
		//rate * hourperweek * weeksPerYear
	}
}
