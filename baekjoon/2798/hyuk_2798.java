import java.util.Scanner;

public class hyuk_2798 {
    public static void main(String[] args) {
        // 블랙잭문제 .. N장의 카드에 M에 최대한 가까운 수 구하기
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[100];

        int result = 0;

        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int sum = A[i] + A[j] + A[k];
                    if (result < sum && sum <= M) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
