public class Task1_1 {
	public static int getSn1(int n) {
		// Base case: when n is 1, return 1
		if (n == 1) {
			return 1;
		} else {
			// Calculate the current term (-1)^(n+1) * n
			int currentTerm = ((n % 2 == 0) ? -1 : 1) * n;
			// Recursively calculate S(n-1) and add the current term
			return getSn1(n - 1) + currentTerm;
		}
	}

	public static int getSn2(int n) {
		// Base case: when n is 1, return 1
		if (n == 1) {
			return 1;
		} else {
			// Calculate the current term 1*2*3*...*n
			int currentTerm = 1;
			for (int i = 1; i <= n; i++) {
				currentTerm *= i;
			}
			// Recursively calculate S(n-1) and add the current term
			return getSn2(n - 1) + currentTerm;
		}
	}
	
	public static int getSn3(int n) {
        // Base case: when n is 1, return 1
        if (n == 1) {
            return 1;
        } else {
            // Calculate the current term n^2
            int currentTerm = n * n;
            // Recursively calculate S(n-1) and add the current term
            return getSn3(n - 1) + currentTerm;
        }
    }
	
	public static double getSn4(int n) {
        // Base case: when n is 0, return 1
        if (n == 0) {
            return 1.0;
        } else {
            // Calculate the current term 1/(2.4.6...2n)
            double currentTerm = 1.0 / calculateProduct(2, n);
            // Recursively calculate S(n-1) and add the current term
            return getSn4(n - 1) + currentTerm;
        }
    }

    // Helper function to calculate the product of numbers from start to end
    private static double calculateProduct(int start, int end) {
        if (start > end) {
            return 1.0;
        }
        return start * calculateProduct(start + 2, end);
    }

    public static void main(String[] args) {
        int n = 5; // You can change n to any non-negative integer
        double result = getSn4(n);
        System.out.println("S(" + n + ") = " + result);
    }
    
    
}
