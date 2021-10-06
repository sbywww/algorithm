import java.util.Scanner;

public class hyuk_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = reverse(sc.nextInt());
        int B = reverse(sc.nextInt());

        /*
        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
         */

        System.out.println(A > B ? A : B);
    }

    public static int reverse(int num) {
        String number = String.valueOf(num);
        String temp = "0";
        for (int i=3; i>0; i--) {
            temp += number.charAt(i-1);
        }
        return Integer.parseInt(temp);
    }
}
