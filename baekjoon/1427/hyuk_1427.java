import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class hyuk_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        String[] arr = num.split("");

        // 내림차순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        for (String result : arr) {
            System.out.print(result);
        }
    }
}
