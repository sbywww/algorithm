import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class mark_3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remainders = new int[10];
        for (int i = 0; i < 10; i++) {
            remainders[i] = Integer.parseInt(br.readLine()) % 42;
        }

        remainders = Arrays.stream(remainders).distinct().toArray();
        bw.write(remainders.length + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
