import java.util.Scanner;

public class hyuk_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] temp = new int[3];

        int count = 0;
        for (int i=1; i<=num; i++) {
            if (i<100) count++;
            else {
                int A = i / 100;
                int B = (i % 100) / 10;
                int C = (i % 100) % 10;

                if (A - B == B - C) count++;
            }
        }

        System.out.println(count);
    }
}
