package array.practice;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    /**
     * Given an array of integers,
     * find the frequency of each element.
     */
    public static void findArrayFrequency(int[] numbs) {
        Map<Integer, Integer> frequencyElement = new HashMap<>();
        for (int number : numbs) {
            frequencyElement.put(number, frequencyElement.getOrDefault(number, 0) + 1);
        }

        System.out.println("Frequency of each element in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyElement.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
