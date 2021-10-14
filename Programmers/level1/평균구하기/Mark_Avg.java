public class Mark_Avg {
    public static void main(String[] args) {
        int[][] inputs = {
                {1,2,3,4},
                {5,5}
        };

        for (int[] input : inputs) {
            System.out.println(solution(input));
        }
    }

    public static double solution(int[] arr) {
        double answer = 0;
        for (int a : arr) {
            answer += a;
        }
        return answer / arr.length;
    }
}
