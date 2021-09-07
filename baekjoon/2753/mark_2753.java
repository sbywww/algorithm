import java.io.*;

public class mark_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());

        int result = -1;
        if ((input % 4) == 0 && (input % 100 != 0 || (input % 400) == 0)) {
            result = 1;
        } else {
            result = 0;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();

    }
}
