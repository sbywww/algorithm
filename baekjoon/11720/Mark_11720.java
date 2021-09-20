import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
