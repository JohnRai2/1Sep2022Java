package Class18;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		int x=5, y=7, z=13;
		int sum1 = add(x,y);
		int sum2 = add(x,y,z); //Hover over method to create it automatically
		System.out.println("Sum1: "+sum1+"\nSum2: "+sum2);
	}

	private static int add(int x, int y, int z) {
		return x+y+z;
	}

	private static int add(int x, int y) {
		return x+y;
	}
}
