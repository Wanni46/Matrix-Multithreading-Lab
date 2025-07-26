#include <stdio.h>
#include <pthread.h>

#define SIZE 3

int A[SIZE][SIZE] = {
    {1, 4, 7},
    {2, 5, 8},
    {3, 6, 9}
};

int B[SIZE][SIZE] = {
    {7, 8, 9},
    {4, 5, 6},
    {1, 2, 3}
};

int C[SIZE][SIZE]; // Result matrix

void* multiply_row(void* arg) {
    int row = *(int*)arg;

    for (int j = 0; j < SIZE; j++) {
        C[row][j] = 0;
        for (int k = 0; k < SIZE; k++) {
            C[row][j] += A[row][k] * B[k][j];
        }
    }

    pthread_exit(0);
}

int main() {
    pthread_t threads[SIZE];
    int row_indices[SIZE];

    // Create one thread per row
    for (int i = 0; i < SIZE; i++) {
        row_indices[i] = i;
        pthread_create(&threads[i], NULL, multiply_row, &row_indices[i]);
    }

    // Wait for all threads to finish
    for (int i = 0; i < SIZE; i++) {
        pthread_join(threads[i], NULL);
    }

    // Display result
    printf("Result Matrix (C = A x B):\n");
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            printf("%d\t", C[i][j]);
        }
        printf("\n");
    }

    return 0;
}
