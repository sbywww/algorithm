import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Mark_4344 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            int sum = 0;
            int count = 0;
            double avg = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];

            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            avg = (double) sum / N;
            for (int score : scores) {
                if (avg < score) {
                    count++;
                }
            }

            bw.write(String.format("%.3f", (double) count / N * 100));
            bw.write("%\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
