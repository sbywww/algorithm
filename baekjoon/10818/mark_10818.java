import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class mark_10818 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int MAX = -1000000;
        int MIN = 10000000;
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());

            if (MAX < val) {
                MAX = val;
            }

            if (MIN > val) {
                MIN = val;
            }
        }

        bw.write(MIN + " " + MAX);

        br.close();
        bw.flush();
        bw.close();
    }
}
