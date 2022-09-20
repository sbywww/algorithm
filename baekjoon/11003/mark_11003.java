import java.io.*;
import java.util.StringTokenizer;

public class mark_11003 {


    /*
    * N개의 수 A(1), A(2), A(N)과 L이 주어진다. A(i-L+1) ~ A(i) 중 최솟값을 D(i)라고 할 때 D에 저장된 수를 출력하는 프로그램 작성
    * 1번째 줄에 N과 L,
    * 2번째 줄에 N개의 수 A(i)가 주어진다.
    * */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // A[-2] ~ A[0],  i = 0  (1)
        // A[-1] ~ A[1],  i = 1  (1)
        // A[0] ~ A[2],   i = 2  (1)
        // A[1] ~ A[3],   i = 3  (2)

        int[] D = new int[N];
        for (int i = 0; i < A.length; i++) {
            int MIN = A[i];
            for (int j = (i - L + 1); j < i; j++) {
                if (j < 0) continue;

                if (MIN > A[j]) {
                    MIN = A[j];
                }
            }

            D[i] = MIN;
        }


        // 결과 출력
        for (int d : D) {
            bw.write(d + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
