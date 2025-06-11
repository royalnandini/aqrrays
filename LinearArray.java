public class LinearArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array elements using a loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element
        numbers[2] = 35;  // Change element at index 2

        System.out.println("\nAfter modification:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
