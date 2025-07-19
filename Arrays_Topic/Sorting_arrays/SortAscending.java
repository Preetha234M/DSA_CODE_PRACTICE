package Sorting_arrays;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers);  // Ascending order
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}