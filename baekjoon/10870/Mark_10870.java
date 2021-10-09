import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_10870 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(fibonacci(N) + "");
        br.close();
        bw.flush();
        bw.close();
    }


    public static int fibonacci(int x) {
        if (x == 0) return 0;
        if (x == 1 || x == 2) return 1;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
