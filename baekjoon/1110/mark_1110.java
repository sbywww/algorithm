import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class mark_1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int cycle = 0;
        int a = N / 10;
        int b = N % 10;

        int result, x;

        while (true) {
            cycle++;
            result = a + b;
            if (result >= 10) {
                result = result % 10;
            }

            x = (b * 10 + result);
            if (x == N) break;

            a = x / 10;
            b = x % 10;
        }

        bw.write(cycle + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
