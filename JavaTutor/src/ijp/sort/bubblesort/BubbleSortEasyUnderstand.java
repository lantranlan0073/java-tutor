package ijp.sort.bubblesort;

public class BubbleSortEasyUnderstand {

	/**
	 * Performs a single pass of the Bubble Sort algorithm over a specified range in the array.
	 * <p>
	 * Starting from indexLeft to indexRight (exclusive), this method compares each adjacent pair
	 * of elements in the array. If a pair is out of order (i.e., the left element is greater than the right),
	 * the two elements are swapped.
	 * </p>
	 *
	 * @param arr        The array of integers to be partially sorted.
	 * @param indexLeft  The starting index of the range (inclusive).
	 * @param indexRight The ending index of the range (inclusive). This method compares up to indexRight - 1.
	 * @return           {@code true} if the range is already sorted (no swaps occurred); 
	 *                   {@code false} if at least one swap occurred.
	 *
	 * @throws IllegalArgumentException if the input is invalid (e.g., null array, out-of-bound indices, or invalid range).
	 *
	 * <p><b>Example usage:</b></p>
	 * <pre>{@code
	 * int[] arr = {5, 3, 4, 1, 2};
	 * boolean alreadySorted = singleBubblePass(arr, 0, 4);
	 * }</pre>
	 *
	 * <p><b>Example output after one pass:</b></p>
	 * Original: [5, 3, 4, 1, 2] → After pass: [3, 4, 1, 2, 5]
	 *
	 * <p>This method is typically used inside a full Bubble Sort implementation to perform one pass,
	 * pushing the largest unsorted value to the right.</p>
	 */
    public static boolean singleBubblePass(int[] arr, int indexLeft, int indexRight) {
        boolean isNoSwap = true;

        // Validate input
        if (arr == null || indexLeft < 0 || indexRight >= arr.length || indexLeft >= indexRight) {
            System.out.println("Invalid input");
            return true; // Treat as no swap needed
        }

        for (int i = indexLeft; i < indexRight; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1] using the swap method
                swap(arr, i, i + 1);
                isNoSwap = false;
            }
        }

        return isNoSwap;
    }

    // Swap method to swap elements at index1 and index2
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Bubble Sort using the helper method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Start from the end and work backwards, shrinking the range
        for (int endIndex = n - 1; endIndex > 0; endIndex--) {
            boolean sorted = singleBubblePass(arr, 0, endIndex);
            if (sorted) break; // Array is sorted; exit early
        }
    }

    // Test the implementation
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Before sorting: " + java.util.Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After sorting:  " + java.util.Arrays.toString(arr));
    }
	}
//https://chatgpt.com/c/6821b336-28c4-8003-a352-32a442e513f5
//https://chatgpt.com/c/6828297b-a740-8003-b89a-49c320ba4148