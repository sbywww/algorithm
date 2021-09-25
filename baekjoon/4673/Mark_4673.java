import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Mark_4673 {

    public static int d(int n) {
        int sum = n;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] numbers = new int[10001];
        int isSelfNumber = 0;
        for (int i = 1; i <= 10000; i++) {
            int notSelfNumber = d(i);
            if (notSelfNumber <= 10000) {
                numbers[notSelfNumber] = 1;
            }
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == isSelfNumber) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
