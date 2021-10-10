import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hyuk_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
    }
}
