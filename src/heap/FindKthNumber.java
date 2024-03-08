package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthNumber {
    public static void findNthSmallestNumber(int k, int[] list) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int number : list) {
            maxHeap.add(number);
        }
        System.out.println(Arrays.toString(Arrays.stream(maxHeap.toArray()).toArray()));

    }
     
    public static void findNthLargestNumber(int k, int[] list) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int number : list) {
            maxHeap.add(number);
        }
        System.out.println(Arrays.toString(Arrays.stream(maxHeap.toArray()).toArray()));

    }
    public static void findTopKLargestNumber(int k, int[] list) {

    }

}
