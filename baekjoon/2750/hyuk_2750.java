import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hyuk_2750 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            int N = sc.nextInt();
            list.add(N);
        }

        // Collection에서 제공하는 일반 정렬(오름차순)
        Collections.sort(list);

        for (int result : list) {
            System.out.println(result);
        }
    }
}
