public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        printArray(arr);

        reverse(arr);

        System.out.println("Reversed array:");
        printArray(arr);
    }

    static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            // Swap elements at left and right
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
