public class Mark_PalindromeNumber {
    public static void main(String[] args) {
        int[] inputs = {0, -1, 121, -121, 123, 232, 555, 9321239};

        for (int i : inputs) {
            System.out.println(isPalindrome(i));
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int target = x;
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result == target;
    }
}
