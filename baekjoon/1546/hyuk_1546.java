import java.util.Scanner;

public class hyuk_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            if (max < a) {
                max = a;
            }
            sum += a;
        }

        System.out.printf("%.6f", sum * 100.0 / (max * N));
    }
}
