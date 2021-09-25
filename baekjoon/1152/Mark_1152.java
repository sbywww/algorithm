import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().trim().split(" ");
        if (s[0].equals("")) {
            bw.write("0");
        } else {
            bw.write(s.length + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
