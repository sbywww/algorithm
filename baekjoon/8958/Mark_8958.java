import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int count = 0;
            int sum = 0;
            String[] ox = br.readLine().split("");
            for (String s : ox) {
                if (s.equals("O")) {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
