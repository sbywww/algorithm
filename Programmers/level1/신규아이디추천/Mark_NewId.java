import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Mark_NewId {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = {
                "...!@BaT#*..y.abcdefghijklm",
                "z-+.^.",
                "=.=",
                "123_.def",
                "abcdefghijklmn.p"
        };

        for (String i : input) {
            String answer = solution(i);
            bw.write(answer);
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }


    public static String solution(String new_id) {
        String answer = "";

        // stage 1
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

        // stage 2
        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        new_id = new_id.replaceAll("[^0-9a-z._-]", "");

        // stage 3
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // stage 4
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        new_id = new_id.replaceAll("^[.]", "").replaceAll("[.]$", "");

        // stage 5
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        // stage 6
        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15).replaceAll("[.]$", "");
        }


        // stage 7
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        for (int i = new_id.length(); i < 3; i++) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        answer = new_id;
        return answer;
    }
}
