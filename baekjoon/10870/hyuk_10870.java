import java.util.Scanner;

public class hyuk_10870 {
    public static void main(String[] args) {

        // 재귀 함수: 자기 자신 호출

        // 피보나치 수
        // 0 -> 1 -> 1 -> 2 -> 3 -> 5 -> 8 -> 13 -> 21 .....

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibo(N));
    }

    public static int fibo(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 1;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
}
