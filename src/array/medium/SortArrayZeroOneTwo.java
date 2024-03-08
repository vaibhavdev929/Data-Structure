package array.medium;

import Utils.SwipeData;
import jdk.jshell.execution.Util;

import java.util.Arrays;

public class SortArrayZeroOneTwo {
    /**
     * Brute force Algorithm
     */
    public static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
    }

    //{1,0,2,0,0,1,2,2,1}

    /**
     * Better solution - 3 variable solution
     */
    public static void sortArray1(int[] numbers) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int temp;
        for (int i = 0; i < numbers.length; i++) {

        }
    }

    /**
     * Optimal Solution - Using 3 pointer algorithm low ,mid ,high
     *
     * @param number list
     */
    public static void sortArray2(int[] number) {

    }
}
