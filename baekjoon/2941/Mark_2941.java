import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toLowerCase();
        String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        // 갯수만 구하면 되기 때문에 크로아티아 알파벳인 경우 1의 길이인 문자열로 치환한다.
        for (String alpha : croatiaAlpha) {
            int index = input.indexOf(alpha);
            if (index != -1) {
                input = input.replaceAll(alpha, "*");
            }
        }

        bw.write(input.length() + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
