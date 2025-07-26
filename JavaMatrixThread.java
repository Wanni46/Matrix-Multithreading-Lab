class MatrixMultiplicationThread extends Thread {
    private int row;
    private static final int SIZE = 3;

    static int[][] A = {
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9}
    };

    static int[][] B = {
        {7, 8, 9},
        {4, 5, 6},
        {1, 2, 3}
    };

    static int[][] C = new int[SIZE][SIZE];

    public MatrixMultiplicationThread(int row) {
        this.row = row;
    }

    public void run() {
        for (int j = 0; j < SIZE; j++) {
            C[row][j] = 0;
            for (int k = 0; k < SIZE; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }

    public static void main(String[] args) {
        MatrixMultiplicationThread[] threads = new MatrixMultiplicationThread[SIZE];

        // Create and start threads
        for (int i = 0; i < SIZE; i++) {
            threads[i] = new MatrixMultiplicationThread(i);
            threads[i].start();
        }

        // Wait for threads to complete
        for (int i = 0; i < SIZE; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }

        // Print result
        System.out.println("Result Matrix (C = A x B):");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
