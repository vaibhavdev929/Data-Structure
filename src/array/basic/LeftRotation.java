package array.basic;

public class LeftRotation {

    /**
     * Brute Force Algorithm
     */
    public static int[] leftRotationArray(int[] numbers, int numberOfPlace) {
        int[] newList = new int[numbers.length];
        int count = 0;
        for (int i = numberOfPlace; i < numbers.length; i++) {
            newList[count]= numbers[i];
            count++;
        }
        for (int i = 0; i < numberOfPlace; i++) {
            newList[count]= numbers[i];
            count++;
        }
        return newList;
    }
    public static int[] leftRotationArray1(int[] numbers, int numberOfPlace) {
        return numbers;
    }

    public static int[] leftRotationArray2(int[] numbers, int numberOfPlace) {
        return numbers;
    }

    /**
     * { 0,1,2,3,4} = {1,2,3,4,0}
     */
    public static int[] leftRotateOnePlace(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++) {

        }
        return numbers;
    }
}
