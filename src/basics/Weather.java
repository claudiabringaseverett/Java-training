package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions how to dress based on the weather
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and a t-shirt.");
		}
		else if((temperature > 60) && (sunCondition != "Sunny")){
				System.out.println("It's a little cooler. Wear a long-sleeve shirt and jeans.");
				System.out.println("wear a hat to keep sun out of your eyes.");
		}
		else if((temperature > 50) || (sunCondition =="Overcast")) {
				System.out.println("This is a cool day, make sure to wear warm clothes.");
		}
		else {
			System.out.println("Looks a little cold. Bring a sweater.");
		}
		System.out.println("The program is ending.");	
	}
}
