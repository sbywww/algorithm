import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_1065 {

    public static int arithmeticSequenceCount(int N) {
        if (N < 100) {
            return N;
        }

        if (N == 1000) {
            N--;
        }

        int x, y, z;
        int count = 99;

        for (int i = 100; i <= N; i++) {
            x = i / 100;
            y = (i % 100) / 10;
            z = i % 10;

            if (x - y == y - z) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = arithmeticSequenceCount(N);
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
