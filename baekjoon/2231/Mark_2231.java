import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int digit = (int)(Math.log10(N) + 1);
        int result = 0;
        for (int i = N - (9 * digit); i < N; i++) {
            int temp = i;
            int num = i;
            while (temp != 0) {
                num += temp % 10;
                temp /= 10;
            }

            if (num == N) {
                result = i;
                break;
            }
        }
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
