import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Mark_PhoneNumber {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] inputs = {
                "01033334444",
                "027778888"
        };
        for (String i : inputs) {
            String result = solution(i);
            bw.write(result);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static String solution(String phone_number) {
        String answer = "";
        char[] number = phone_number.toCharArray();
        for (int i = 0; i < number.length - 4; i++) {
            number[i] = '*';
        }

        answer = String.valueOf(number);
        return answer;
    }

}
