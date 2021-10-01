import java.util.Scanner;

public class hyuk_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            String str = sc.next();
            int plus = 1;
            int sum = 0;

            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    sum += plus++;
                } else {
                    plus = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
