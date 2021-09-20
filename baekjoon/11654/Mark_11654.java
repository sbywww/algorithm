import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Mark_11654 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        byte[] ascii = br.readLine().getBytes(StandardCharsets.US_ASCII);
        bw.write(ascii[0] + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
