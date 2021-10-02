import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class hyuk_1978 {
    public static void main(String[] args) throws IOException {
        // 소수 찾기
        // 소수: 1과 자기 자신으로 밖에 안나눠지는 1보다 큰 양의 정수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int result = 0;

        for (int i=1; i<=N; i++) {
            int num = sc.nextInt();
            count = 0;

            for (int j=1; j<=num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                result++;
            }

        }
        System.out.println(result);
    }
}
