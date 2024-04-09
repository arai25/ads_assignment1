package task_1;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int n = 5;
        int[] arr = new int[]{10, 1, 32, 3, 45};
        int r = fun(n, arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(r);
        System.out.println("Time taken: " + duration + " milliseconds");

    }
    /*
     * This method finds the minimum value among the elements of the array
     * It takes given int n and an array
     * Time complexity: O(n), where n is the input number
     * Linear time complexity
     */
    public static int fun(int n, int[] arr) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
