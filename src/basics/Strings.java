package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of The Rings";

		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word Ring");
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");			
		}
		
		String firstName = "Tim";
		String lastName = "Smith";
		String SSN = "693456725";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//Print the initial plus last 4 digits of social security 
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
	}

}
