package oops;

public class Assignment13 {

	static int add(int a, int b) {
		return( a + b);

	}

	static int add(int a, int b, int c) {
		return( a + b + c);

	}

	static double add(double a, double b, double c) {
		return( a + b + c);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 13. Method overloading: Create simple addition program with method
		// overloading and print the outputs

		System.out.println(add(2, 3));
		System.out.println(add(67, 33, 55));
		System.out.println(add(52.262, 727.272, 26.33));

	}

}
