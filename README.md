# Sorting Algorithms in Java 

This repository contains implementations of various **sorting algorithms** in **Java**. Each algorithm has its own directory and a
`Main.java` file that generates random numbers, sorts them, and measures execution time.

##  Implemented Sorting Algorithms
- **Bubble Sort** 
- **Insertion Sort** 
- **Selection Sort** 
- **Merge Sort** 
- **Quick Sort** 

---

##  How Each Algorithm Works

### 🔹 Bubble Sort
- Repeatedly swaps adjacent elements if they are in the wrong order.
- **Time Complexity:** `O(n^2)` (Worst & Average), `O(n)` (Best Case)
- **Auxiliary Space:** `O(1)`

### 🔹 Insertion Sort
- Picks an element and inserts it into its correct position.
- **Time Complexity:** `O(n^2)` (Worst & Average), `O(n)` (Best Case)
- **Auxiliary Space:** `O(1)`

### 🔹 Selection Sort
- Finds the minimum element in the unsorted part and swaps it with the first element.
- **Time Complexity:** `O(n^2)`
- **Auxiliary Space:** `O(1)`

### 🔹 Merge Sort
- Recursively splits the array into halves and merges them back in sorted order.
- **Time Complexity:** `O(n log n)`
- **Auxiliary Space:** `O(n)`

### 🔹 Quick Sort
- Selects a pivot, partitions the array, and sorts recursively.
- **Time Complexity:** `O(n log n)` (Average), `O(n^2)` (Worst Case)
- **Auxiliary Space:** `O(log n)`

---

##  How to Run the Code

### 1) Clone the Repository

git clone https://github.com/your-username/Sorting-Algorithms.git
cd Sorting-Algorithms


### 2) Compile and Run
Each algorithm has its own Main.java. Navigate to the corresponding directory and run:

-javac Main.java

-java Main

-cd bubble_sort

-javac Main.java

-java Main

