package recursion.easy;

import Utils.SwipeData;
import jdk.jshell.execution.Util;

import java.util.Arrays;

public class SwapArray {
    public static void swapArray(int l, int r, int[] list) {
        if (l >= r) { // L >=list.length/2
            System.out.println(Arrays.toString(list));
            return;
        }
        SwipeData.swipeInteger(l, r, list);
        swapArray(++l, --r, list);  // (l,n-l+1)
    }
}
