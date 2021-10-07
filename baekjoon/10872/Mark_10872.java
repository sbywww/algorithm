import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_10872 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(factorial(N) + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static int factorial(int i) {
        if (i == 0) return 1;
        return i * factorial(i - 1);
    }
}
