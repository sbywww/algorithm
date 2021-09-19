import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Mark_15596 {

    public static long sum(int[] a) {
        long ans = 0;
        for (int x : a) {
            ans += x;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
        long result = sum(input);
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
