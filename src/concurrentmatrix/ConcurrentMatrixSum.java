package concurrentmatrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMatrixSum {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        int numThreads = 4; // Number of concurrent threads

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int step = rows / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int startRow = i * step;
            int endRow = (i < numThreads - 1) ? (i + 1) * step : rows;
            executor.execute(new MatrixSum(matrix1, matrix2, result, startRow, endRow));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }

        // Print the result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
