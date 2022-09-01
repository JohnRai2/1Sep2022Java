package Class13;

import java.util.Scanner;

public class PowerFunction {
	public static void main(String[] args) {
		int num, pow, result;
		System.out.println("Enter a number (n): ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Enter the power (p):");
		Scanner ca = new Scanner(System.in);
		pow = ca.nextInt();
		result = power(num,pow);
		System.out.println("Answer of "+num+"^"+pow+" is: "+result);
	}

	private static int power(int num, int pow) {
		int result = 1;
		for(int i=0; i<pow; i++) {
			result *= num;
		}
		return result;
	}
}
