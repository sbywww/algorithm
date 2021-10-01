import java.util.Scanner;

public class hyuk_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int i=0; i<C; i++) {
            double sum = 0;
            double count = 0;

            int N = sc.nextInt();
            int[] score = new int[N];
            for (int j=0; j<N; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            double aver = sum/N;
            for (int j=0; j<N; j++) {
                if (score[j] > aver) count++;
            }

            System.out.printf("%.3f%%\n", count/N*100);
        }
    }
}
