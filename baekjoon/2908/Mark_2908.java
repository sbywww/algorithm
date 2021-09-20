import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Mark_2908 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder reverseA = new StringBuilder();
        StringBuilder reverseB = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            reverseA.append(a.charAt(i));
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            reverseB.append(b.charAt(i));
        }

        int numA = Integer.parseInt(reverseA.toString());
        int numB = Integer.parseInt(reverseB.toString());

        if (numA > numB) {
            bw.write(numA + "");
        } else {
            bw.write(numB + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
