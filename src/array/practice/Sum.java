package array.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {
    /**
     * Array Sum:
     * Given an array of integers, find pairs that add up to a given target sum.
     */
    //Using Hashing
    public static void findPair(int[] nums, int target) {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < nums.length; i++) {
            // check if pair (nums[i], target-nums[i]) exists

            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i])) {
                System.out.printf("Pair found (%d, %d)",
                        nums[map.get(target - nums[i])], nums[i]);
                return;
            }

            // store index of the current element in the map
            map.put(nums[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    //Using Sorting
    public static void findPair2(int[] nums, int target) {
        // sort the array in ascending order
        Arrays.sort(nums);

        // maintain two indices pointing to endpoints of the array
        int low = 0;
        int high = nums.length - 1;

        // reduce the search space `nums[low…high]` at each iteration of the loop

        // loop till the search space is exhausted
        while (low < high) {
            // sum found
            if (nums[low] + nums[high] == target) {
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }

            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (nums[low] + nums[high] < target) {
                low++;
            } else {
                high--;
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    //Using Brute-Force
    public static void findPair3(int[] nums, int target) {
        // consider each element except the last
        for (int i = 0; i < nums.length - 1; i++) {
            // start from the i'th element until the last element
            for (int j = i + 1; j < nums.length; j++) {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target) {
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    /**
     * Find the subarray with the maximum sum or
     * the maximum product within an array of integers
     */
    public static void findMaxSubArray(int[] nums) {

        int maxSubArray = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int count =0;
            for (int j = i; j < nums.length; j++) {
                  count = count + nums[j];
                if (count > maxSubArray) {
                    maxSubArray = count;
                }
            }
        }
       System.out.println(maxSubArray);
    }

    /**
     * Kadane’s Algorithm => is an iterative dynamic programming algorithm. It calculates the maximum sum subarray ending at a particular position by using the maximum sum subarray ending at the previous position. Follow the below steps to solve the problem.
     *
     * Define two-variable currSum which stores maximum sum ending here and maxSum which stores maximum sum so far.
     * Initialize currSum with 0 and maxSum with INT_MIN.
     * Now, iterate over the array and add the value of the current element to currSum and check
     * If currSum is greater than maxSum, update maxSum equals to currSum.
     * If currSum is less than zero, make currSum equal to zero.
     * Finally, print the value of maxSum.
     *
     */
    public static void findMaxSubArray2(int[] arr) {
        int n = arr.length;
        int maxSum =arr[0];
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println(maxSum);
    }

}
