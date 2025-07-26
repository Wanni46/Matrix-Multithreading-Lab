# Matrix-Multithreading-Lab
# 🧮 Multithreaded Matrix Multiplication using Pthreads (C) & Java Threads

<div align="center">

![Matrix Multiplication](https://img.shields.io/badge/Matrix-Multiplication-brightgreen)
![Threads](https://img.shields.io/badge/Multithreading-Parallel-blue)
![Languages](https://img.shields.io/badge/Languages-C%20%7C%20Java-orange)
![Last Updated](https://img.shields.io/badge/Last%20Updated-July%202025-lightgrey)
![User](https://img.shields.io/badge/Author-Wanni46-blueviolet)
![Date](https://img.shields.io/badge/Updated-2025--07--26-success)

</div>

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

<pre>
📂 Matrix-Multithreading-Lab
├── 📄 matrix_mult_pthread.c       # C code using Pthreads
├── 📄 MatrixMultJava.java         # Java code using Threads
├── 📝 README.md                   # Project documentation (this file)
└── 📁 screenshots/                # Screenshot folder (add terminal outputs here)
</pre>

---

## ⚙️ Requirements

### ✅ For C (Pthreads)
- <img src="https://img.shields.io/badge/GCC-Compiler-blue"/> GCC Compiler
- <img src="https://img.shields.io/badge/POSIX-Support-green"/> Linux/macOS/WSL (for POSIX support)

### ✅ For Java
- <img src="https://img.shields.io/badge/JDK-8%2B-red"/> JDK 8 or above
- <img src="https://img.shields.io/badge/IDE-Optional-yellow"/> Command Line or any IDE (e.g., IntelliJ, Eclipse, VS Code)

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

<details>
<summary>📊 Click to see example output visualization</summary>

```
Matrix A:        Matrix B:        Result C:
[ 1  2  3 ]      [ 9  8  7 ]      [ 38  32  26 ]
[ 4  5  6 ]  x   [ 6  5  4 ]  =   [ 92  77  62 ]
[ 7  8  9 ]      [ 3  2  1 ]      [146 122  98 ]

Execution time with threads: 0.0034 seconds
Execution time without threads: 0.0092 seconds
Performance gain: 2.7x faster!
```

</details>

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
|:--------------:|:---------------------------:|:------------------------------:|
| Syntax          | Low-level, manual management | High-level, object-oriented     |
| Thread Creation | `pthread_create()`           | `new Thread().start()`          |
| Synchronization | Requires mutexes/semaphores  | Built-in `synchronized` keyword |
| Portability     | Unix-based systems           | Platform-independent (Java VM)  |
| Ease of Use     | Complex                      | Simpler and beginner-friendly   |

---

<div align="center">
  
## 🌐 GitHub Repository

[![GitHub Repository](https://img.shields.io/badge/GitHub-Matrix--Multithreading--Lab-brightgreen?style=for-the-badge&logo=github)](https://github.com/Wanni46/Matrix-Multithreading-Lab)

<img src="https://img.shields.io/badge/Last%20Commit-2025--07--26%2008:55:15%20UTC-informational?style=flat-square&logo=git"/>
<img src="https://img.shields.io/badge/Status-Active-success?style=flat-square"/>
<img src="https://img.shields.io/badge/Maintained%20by-Wanni46-orange?style=flat-square&logo=github"/>

---

## 📚 References

1. A. Silberschatz, P. B. Galvin, and G. Gagne, _Operating System Concepts_, 8th ed. Hoboken, NJ, USA: Wiley, 2008.
2. "What are the limitations of Amdahl's Law?" MassedCompute, [Online]. Available: https://massedcompute.com/faq-answers/?question=What+are+the+limitations+of+Amdahl% [Accessed: 25-Jul-2025].
3. "RISC and CISC," GeeksforGeeks, [Online]. Available: https://www.geeksforgeeks.org/computer-organization-architecture/computer-organization-risc-and-cisc/ [Accessed: 25-Jul-2025].
4. "Amdahl's law," Wikipedia, [Online]. Available: https://en.wikipedia.org/wiki/Amdahl%27s_law [Accessed: 25-Jul-2025].
5. "Historical Notes on CISC and RISC," OSDev Wiki, [Online]. Available: https://wiki.osdev.org/Historical_Notes_on_CISC_and_RISC [Accessed: 25-Jul-2025].
6. "RISC architecture," IBM Archives, [Online]. Available: https://www.ibm.com/history/risc [Accessed: 25-Jul-2025] 
