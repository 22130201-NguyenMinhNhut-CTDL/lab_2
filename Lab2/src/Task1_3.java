
public class Task1_3 {
    public static void printPascalTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            int[] row = getPascalTriangle(i);
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[] getPascalTriangle(int n) {
        if (n == 1) {
            return new int[] { 1 };
        } else {
            int[] prevRow = getPascalTriangle(n - 1);
            return generateNextRow(prevRow);
        }
    }

    public static int[] generateNextRow(int[] prevRow) {
        int[] nextRow = new int[prevRow.length + 1];
        nextRow[0] = 1;
        nextRow[nextRow.length - 1] = 1;

        for (int i = 1; i < nextRow.length - 1; i++) {
            nextRow[i] = prevRow[i - 1] + prevRow[i];
        }

        return nextRow;
    }

    public static void main(String[] args) {
        int numRows = 5; // Change this to the number of rows you want to print
        printPascalTriangle(numRows);
    }
}
