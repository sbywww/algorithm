import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class mark_2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                bw.write(" ");
            }
            for (int k = i; k > 0; k--) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
