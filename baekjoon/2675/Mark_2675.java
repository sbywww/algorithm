import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Mark_2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] R = new int[T];
        String[] S = new String[T];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            R[i] = Integer.parseInt(st.nextToken());
            S[i] = st.nextToken();
        }

        for (int i = 0; i < T; i++) {
            StringBuilder result = new StringBuilder();
            char[] characters = S[i].toCharArray();
            int repeat = R[i];
            for (char c : characters) {
                for (int k = 0; k < repeat; k++) {
                    result.append(c);
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
