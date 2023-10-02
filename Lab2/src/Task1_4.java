
public class Task1_4 {
	public static void solveTowersOfHanoi(int n, char source, char auxiliary, char target) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + source + " to " + target);
			return;
		}
		solveTowersOfHanoi(n - 1, source, target, auxiliary);
		System.out.println("Move disk " + n + " from " + source + " to " + target);
		solveTowersOfHanoi(n - 1, auxiliary, source, target);
	}

	public static void main(String[] args) {
		int n = 3; // Number of disks
		solveTowersOfHanoi(n, 'A', 'B', 'C');
	}
}
