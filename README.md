# Concurrent Matrix Sum
example code that demonstrates applying matrix summation using concurrency and threads in Java

![‏‏لقطة الشاشة (329)](https://github.com/salahsaeed19/ConcurrentMatrixSum/assets/80893300/a62e6064-477c-4b72-b524-8053b4c45478)
The provided code performs matrix summation using concurrency and threads in Java. Here's a simplified explanation of how the code works:

1. We define the size of the matrices (`MATRIX_SIZE`) and the number of threads to use (`NUM_THREADS`).

2. The `fillMatrix` method populates the matrices `matrixA` and `matrixB` with random values.

3. The `printMatrix` method prints the resulting matrix (`result`).

4. The `MatrixSummationTask` class represents a task that computes the summation of a block of rows in the matrices.

5. In the `main` method:
   - We initialize and fill the matrices with random values.
   - We create a thread pool with `NUM_THREADS` threads.
   - We divide the work among the threads by assigning each thread a block of rows to process.
   - Each thread executes an instance of the `MatrixSummationTask` class.
   - We shut down the executor and wait for all tasks to complete.

6. Finally, we print the resulting matrix.

The code utilizes multiple threads to perform the matrix
