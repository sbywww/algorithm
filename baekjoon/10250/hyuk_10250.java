import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hyuk_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int X = N/H + 1;
            int Y = N%H;

            if (N%H == 0) {
                X = N/H;
                Y = H;
            }

            System.out.println(X + Y*100);
        }
    }
}
