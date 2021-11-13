import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class hyuk_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 개수
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 정렬할 숫자모음
        }

        Arrays.sort(arr); // 정렬!

        for (int i=0; i<N; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
