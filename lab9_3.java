import java.util.Scanner;

public class MatrixSumThreaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[m][n];

        // Read the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create and start threads
        Thread[] threads = new Thread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new Thread(new RowSumCalculator(matrix[i], i));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Runnable class to compute sum of elements in a row
    static class RowSumCalculator implements Runnable {
        private final int[] row;
        private final int rowIndex;

        public RowSumCalculator(int[] row, int rowIndex) {
            this.row = row;
            this.rowIndex = rowIndex;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int element : row) {
                sum += element;
            }
            System.out.println("Sum of elements in row " + rowIndex + ": " + sum);
        }
    }
}
