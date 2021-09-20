import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_10809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] S = br.readLine().toLowerCase().toCharArray();

        int[] result = new int[26];
        for (int i = 0; i < result.length; i++) {
            char x = (char) (i + 97);
            result[i] = -1;
            int count = 0;
            for (char c : S) {
                if (x == c) {
                    result[i] = count;
                    break;
                }
                count++;
            }

            bw.write(result[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
