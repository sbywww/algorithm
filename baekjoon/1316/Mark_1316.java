import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mark_1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            StringBuilder tempWord = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                if (word.indexOf(word.charAt(j)) == j || word.charAt(j - 1) == word.charAt(j)) {
                    // 중복된 문자가 있으면 제거
                    // 단, 이전 문자와 현재 문자가 같으면 추가
                    tempWord.append(word.charAt(j));
                }
            }

            if (tempWord.length() == word.length()) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
