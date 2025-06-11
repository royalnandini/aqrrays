import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 8, 5, 6, 8, 8, 2};
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Print frequencies
        System.out.println("Number frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
