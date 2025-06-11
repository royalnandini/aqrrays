public class MinArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 7, 32, 18};

        int min = arr[0];  // Assume first element is minimum

        for (int num : arr) {
            if (num < min) {
                min = num;  // Update min if current number is smaller
            }
        }

        System.out.println("Minimum value in the array is: " + min);
    }
}
