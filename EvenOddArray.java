public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        System.out.println("\nEven numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        
        System.out.println("\nOdd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
