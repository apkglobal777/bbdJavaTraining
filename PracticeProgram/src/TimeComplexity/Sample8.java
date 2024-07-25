package TimeComplexity;

public class Sample8 {
    // Function to calculate the sum of elements in an array
    static int listSum(int[] A, int n) {
        int sum = 0; // Cost = 1, executed 1 time

        for (int i = 0; i < n; i++) { // Cost = 2, executed n+1 times (+1 for
            // the end false condition)
            sum = sum + A[i]; // Cost = 2, executed n times
        }

        return sum; // Cost = 1, executed 1 time
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int length = array.length;
        int result = listSum(array, length);
        System.out.println("Sum: " + result);
    }
}
