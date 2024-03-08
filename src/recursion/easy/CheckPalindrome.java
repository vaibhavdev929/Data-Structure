package recursion.easy;

public class CheckPalindrome {
    public static boolean isPalindrome(int start, String data) {
        if (start >= data.length() / 2) {
            return true;
        }
        if (data.charAt(start) != data.charAt(data.length() - start-1)) {
            return false;
        } else {
            return isPalindrome(++start, data);
        }
    }
}
