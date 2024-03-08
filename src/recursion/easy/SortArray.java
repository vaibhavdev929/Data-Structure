package recursion.easy;

import java.util.Arrays;

public class SortArray {
    public static void sortArray(int[] list) {
        System.out.println(Arrays.toString(list));
        if (list.length < 2) {
            return;
        }
        int midElement = list.length/2;
        sortArray(Arrays.copyOfRange(list,0,midElement));
        sortArray(Arrays.copyOfRange(list,midElement,list.length));


    }
}
