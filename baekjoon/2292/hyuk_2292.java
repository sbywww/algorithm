import java.util.Scanner;

public class hyuk_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int N = sc.nextInt();

        // 벌집의 숫자는 10억.. 가장 큰 숫자 18258칸
        // 1..7..19..37..61
        // 1~1   -> 1번
        // 2~7   -> 2번, 숫자 6개
        // 8~19  -> 3번, 숫자 12개
        // 20~37 -> 4번, 숫자 18개
        for (int i=1; i<18258; i++) {
            count = count + 6 * i;
            if (N == 1) {
                System.out.println(1);
                break;
            } else if (N <= count) {
                System.out.println(i + 1);
                break;
            }

        }
    }
}
