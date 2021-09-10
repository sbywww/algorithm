import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class mark_11022 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #");
            bw.write(i + ": ");
            bw.write(String.valueOf(a));
            bw.write(" + ");
            bw.write(String.valueOf(b));
            bw.write(" = ");
            bw.write(String.valueOf(a+b));
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
