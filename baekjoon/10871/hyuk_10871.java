import java.io.IOException;
import java.util.Scanner;

public class hyuk_10871 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int a;

        for (int i=0; i<n; i++) {
            a = sc.nextInt();
            if (a < x) System.out.print(a + " ");
        }
    }
}
