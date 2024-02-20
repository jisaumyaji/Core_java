//quicksort
import java.util.*;
public class Quicksort {

    public static void main(String[] args) {
        // Example input array
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15};
        
        System.out.println("Original array:");
        printArray(array);

        // Apply QuickSort
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Quicksort algorithm
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array, and get the index of the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partition the array and return the index of the pivot element
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Utility method to print an array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
