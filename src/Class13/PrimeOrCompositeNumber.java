package Class13;

import java.util.Scanner;

public class PrimeOrCompositeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		if(num>0) {
			if(primecomposite(num)) {
				System.out.println("Prime");
			}else {
				System.out.println("Composite");
			}
		}
	}

	private static boolean primecomposite(int num) {
		for(int i=2; i<=(num/2); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
