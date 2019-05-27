package basics;

public class Factorial {

	public static void main(String[] args) {
		//Write a function that takes a value N and returns the sum of 1 to n
		System.out.println(sum(4));
	}
	
	public static int sum(int n) {
		int sum  = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println(1 + " " + sum);
		}
		return sum;
	}
}
