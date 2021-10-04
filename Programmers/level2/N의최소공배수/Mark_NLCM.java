public class Mark_NLCM {
    public static void main(String[] args) {
        int [] input = {2, 6, 8, 14, 30, 40, 100};
        System.out.println(solution(input));
    }

    public static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
