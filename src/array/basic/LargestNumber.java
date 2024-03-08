package array.basic;

import java.util.Arrays;

public class LargestNumber {


    /**
     * Brute Force Algorithm
     */
    public static int findLargestNumberBruteForce(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    /**
     * Find the largest number using one pointer algorithm  (Optimal Way)
     */
    public static int findLargestNumber(int[] numbers) {
        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (largestNumber < numbers[i]) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    public static int findSecondLargestNumberBruteForce(int[] numbers) {
        Arrays.sort(numbers);
        int largestNumber = numbers[numbers.length - 1];
        int secondLargestNumber = Integer.MIN_VALUE;
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] < largestNumber) {
                secondLargestNumber = numbers[i];
                break;
            }
        }
        return secondLargestNumber;
    }


    /**
     * {5,1, 2, 3, 4, 5, 6,7,5,6,7}
     * Two Pointer algorithm.
     */
    public static int findSecondLargestNumber(int[] numbers) {
        Arrays.sort(numbers);
        int largestNumber = numbers[0];
        int secondLargestNumber = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (largestNumber < numbers[i]) {
                largestNumber = numbers[i];
            }
            if (secondLargestNumber < numbers[i - 1] && numbers[i - 1] < largestNumber) {
                secondLargestNumber = numbers[i];
            }
        }
        return secondLargestNumber;
    }

    /**
     * More optimal Way
     */
    public static int findSecondLargestNumber1(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largestNumber = numbers[0];
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = numbers[i];
            } else if (numbers[i] > secondLargestNumber && numbers[i] < largestNumber) {
                secondLargestNumber = numbers[i];
            }
        }

        return secondLargestNumber;
    }


}
