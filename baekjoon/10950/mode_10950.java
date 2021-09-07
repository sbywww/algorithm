import java.util.ArrayList;
import java.util.Scanner;

public class mode_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arrayList.add(a+b);
        }
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}