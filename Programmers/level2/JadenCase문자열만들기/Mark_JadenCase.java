import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Mark_JadenCase {
    public static void main(String[] args) throws Exception {
        String [] inputs = {
                "3people unFollowed me",
                "for the last week",
                " 2aabb UnFll mE",
                "4Eaa  UnfLL"
        };

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String i : inputs) {
            bw.write(solution(i));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static String solution(String s) {
        String answer = "";

        String[] words = s.toLowerCase().split("");
        boolean flag = false;

        for(String word : words) {
            answer += flag ? word.toUpperCase() : word;
            flag = word.equals(" ");
        }

        return answer;
    }
}
