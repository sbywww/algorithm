import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_5622 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dial = {
                "",
                "",
                "ABC",
                "DEF",
                "GHI",
                "JKL",
                "MNO",
                "PQRS",
                "TUV",
                "WXYZ"
        };
        char[] alpha = br.readLine().toCharArray();
        int time = 0;
        for (char c : alpha) {
            for (int i = 0; i < dial.length; i++) {
                if (dial[i].contains(String.valueOf(c))) {
                    time += i + 1;
                    break;
                }
            }
        }

        bw.write(time + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
