public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 7, 32, 18};

        int max = arr[0];  // Assume first element is maximum

        for (int num : arr) {
            if (num > max) {
                max = num;  // Update max if current number is larger
            }
        }

        System.out.println("Maximum value in the array is: " + max);
    }
}
