# Matrix-Multithreading-Lab
# 🧮 Multithreaded Matrix Multiplication using Pthreads (C) & Java Threads

Welcome to the Matrix Multiplication Simulator!  
This project shows how we can speed up matrix multiplication by using multithreading — in both **C (Pthreads)** and **Java (Java Threads)**.

---

## 📌 Lab Introduction

In this lab, we created two programs that perform matrix multiplication using threads.  
The goal is to understand how threading helps with **performance**, **concurrency**, and **parallel execution**.

We used:
- 🧵 **Pthreads** for C
- ☕ **Java Threads**

Each thread is responsible for calculating one element of the result matrix. This makes the program faster and more efficient on multi-core systems.

---

## 🗂️ File Structure

```
📂 Matrix-Multithreading-Lab
├── matrix_mult_pthread.c       # C code using Pthreads
├── MatrixMultJava.java         # Java code using Threads
├── README.md                   # Project documentation (this file)
└── screenshots/                # Screenshot folder (add terminal outputs here)
```

---

## ⚙️ Requirements

### ✅ For C (Pthreads)
- GCC Compiler
- Linux/macOS/WSL (for POSIX support)

### ✅ For Java
- JDK 8 or above
- Command Line or any IDE (e.g., IntelliJ, Eclipse, VS Code)

---

## 🚀 How to Compile and Run

### 🔷 C - Pthreads Version

```bash
# Step 1: Compile
gcc -o matrix_pthread matrix_mult_pthread.c -lpthread

# Step 2: Run
./matrix_pthread
```

### 🔶 Java - Thread Version

```bash
# Step 1: Compile
javac MatrixMultJava.java

# Step 2: Run
java MatrixMultJava
```

---

## 📷 Screenshots

Please add the screenshots of the terminal output from both implementations inside the `/screenshots` folder.

---

## 💭 Reflections

### 🔹 Multithreaded Programming

We split the work of matrix multiplication into multiple threads to perform tasks in parallel, improving performance.

### 🔹 Thread Management

Each thread computes one value of the resulting matrix (for 3x3 matrices, 9 threads are created).

### 🔹 Concurrency

Threads execute independently and simultaneously, showing how CPU cores can be efficiently utilized.

### 🔹 API Comparison

| Feature         | Pthreads (C)                 | Java Threads                    |
| --------------- | ---------------------------- | ------------------------------- |
| Syntax          | Low-level, manual management | High-level, object-oriented     |
| Thread Creation | `pthread_create()`           | `new Thread().start()`          |
| Synchronization | Requires mutexes/semaphores  | Built-in `synchronized` keyword |
| Portability     | Unix-based systems           | Platform-independent (Java VM)  |
| Ease of Use     | Complex                      | Simpler and beginner-friendly   |

---

## 📚 References

1. A. Silberschatz, P. B. Galvin, and G. Gagne, _Operating System Concepts_, 8th ed. Hoboken, NJ, USA: Wiley, 2008.
2. "What are the limitations of Amdahl’s Law?" MassedCompute, [Online]. Available: https://massedcompute.com/faq-answers/?question=What+are+the+limitations+of+Amdahl% [Accessed: 25-Jul-2025].
3. "RISC and CISC," GeeksforGeeks, [Online]. Available: https://www.geeksforgeeks.org/computer-organization-architecture/computer-organization-risc-and-cisc/ [Accessed: 25-Jul-2025].
4. "Amdahl’s law," Wikipedia, [Online]. Available: https://en.wikipedia.org/wiki/Amdahl%27s_law [Accessed: 25-Jul-2025].
5. "Historical Notes on CISC and RISC," OSDev Wiki, [Online]. Available: https://wiki.osdev.org/Historical_Notes_on_CISC_and_RISC [Accessed: 25-Jul-2025].
6. "RISC architecture," IBM Archives, [Online]. Available: https://www.ibm.com/history/risc [Accessed: 25-Jul-2025]
