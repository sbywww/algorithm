import java.io.*;
import java.util.StringTokenizer;

public class mark_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, " ");
            if (!st.hasMoreTokens()) break;
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write((x + y) + "\n");

        }

        br.close();
        bw.flush();
        bw.close();
    }
}
