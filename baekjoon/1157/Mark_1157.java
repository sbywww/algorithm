import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] words = br.readLine().toUpperCase().toCharArray();
        int[] wordCount = new int[26];

        for (int i = 0; i < wordCount.length; i++) {
            char alpha = (char) (i + 65);
            int count = 0;
            for (char word : words) {
                if (alpha == word) {
                    count++;
                }
            }

            wordCount[i] = count;
        }

        int max = 0;
        int over = 0;
        char result = 0;
        for (int i = 0; i < wordCount.length; i++) {
            int count = wordCount[i];
            if (max < count) {
                max = count;
                result = (char) (i + 65);
            } else if (max > 0 && max == count) {
                over = count;
            }
        }

        if (max > over) {
            bw.write(result);
        } else {
            bw.write("?");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
