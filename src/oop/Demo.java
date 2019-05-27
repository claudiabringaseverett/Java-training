package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	
	void eat() {
		System.out.println("email");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}


public class Demo {
	
	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Julio";
		person1.email = "julio@gmail.com";
		person1.phone = "704562456";
		
		//Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
	
		
		/*
		// Person
		
		//Attributes, variables, adjectives, descriptors
		String name = "Julio";
		String email = "julio@gmail.com";
		String phone = "7056784532";
		
		// Action, activity, behavior
		walking(name);
		System.out.println(name + " is eating.");
		
		//What if we wanted to do this for another person?
		
		String name2 = "Sarah";
		String email2 = "sarah@gmail.com";
		String phone2 = "705678982";
		
		// Action, activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating.");

	}
	
		//Enhance by adding attributes and properties together;
		static void walking(String name) {
			System.out.println(name + " is walking");
		}
	*/
	}
}

