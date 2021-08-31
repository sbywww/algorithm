import java.io.*;
import java.util.StringTokenizer;

public class mark_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int add = a+b;
        int sub = a-b;
        int multiple = a*b;
        int div = a/b;
        int etc = a%b;

        bw.write(add + "\n");
        bw.write(sub + "\n");
        bw.write(multiple + "\n");
        bw.write(div + "\n");
        bw.write(etc + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
