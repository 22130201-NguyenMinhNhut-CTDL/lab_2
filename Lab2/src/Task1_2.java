
public class Task1_2 {
	// Get the nth value of the Fibonacci series
	public static int getFibonacci(int n) {
		// Base case: when n is 0 or 1, return n
		if (n <= 1) {
			return n;
		} else {
			// Recursively calculate the Fibonacci value for n-1 and n-2
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	// This method is used to display a Fibonacci series based on the parameter n.
	public static void printFibonacci(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(getFibonacci(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 10; // You can change n to the desired Fibonacci sequence length
		System.out.println("Fibonacci sequence of length " + n + ":");
		printFibonacci(n);
	}
}
