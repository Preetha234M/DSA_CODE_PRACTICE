#  Java Array Sorting Project

This project demonstrates how to sort arrays in Java using built-in methods from the `java.util.Arrays` class.

---

##  What You'll Learn

- How to sort an array in ascending and descending order.
- Difference between primitive arrays and object arrays.
- Use of `Arrays.sort()` and `Collections.reverseOrder()`.

---

##  Project Structure

```
sort-array-java/
├── SortAscending.java
├── SortDescending.java
├── README.md
```

---

##  Example 1: Sort Array in Ascending Order

```java
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers);  // Ascending order
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
```

###  Output:
```
Sorted Array: [1, 2, 3, 4, 5]
```

---

##  Example 2: Sort Array in Descending Order

```java
import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted Array (Descending): " + Arrays.toString(numbers));
    }
}
```

###  Output:
```
Sorted Array (Descending): [5, 4, 3, 2, 1]
```

---

##  How to Run

1. Open the folder in your Java IDE or VS Code.
2. Compile the file using:
   ```bash
   javac SortAscending.java
   java SortAscending
   ```
   Or for descending:
   ```bash
   javac SortDescending.java
   java SortDescending
   ```

---

##  Author

**Preetha M**  
CSE Student, PDIT  
Passionate about coding and development 

---

##  License

Free to use and modify for educational purposes.
