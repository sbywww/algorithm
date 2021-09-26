import java.util.Scanner;

public class hyuk_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] coin = new int[N];

        for (int i=0; i<N; i++) {
            coin[i] = sc.nextInt();
        }

        int result = 0;

        for (int i=N-1; i>=0; i--) {
            result += K / coin[i];
            K %= coin[i];
        }

        System.out.println(result);
    }
}
