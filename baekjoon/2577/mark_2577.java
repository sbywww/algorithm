import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class mark_2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(br.readLine());
        }
        String[] values = String.valueOf(result).split("");

        int[] numbers = {0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0};
        for (String value : values) {
            int num = Integer.parseInt(value);
            switch (num) {
                case 0:
                    numbers[0]++;
                    break;
                case 1:
                    numbers[1]++;
                    break;
                case 2:
                    numbers[2]++;
                    break;
                case 3:
                    numbers[3]++;
                    break;
                case 4:
                    numbers[4]++;
                    break;
                case 5:
                    numbers[5]++;
                    break;
                case 6:
                    numbers[6]++;
                    break;
                case 7:
                    numbers[7]++;
                    break;
                case 8:
                    numbers[8]++;
                    break;
                case 9:
                    numbers[9]++;
                    break;
            }
        }

        for (int num : numbers) {
            bw.write(num + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
