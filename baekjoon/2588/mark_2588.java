import java.util.Scanner;

public class mark_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        int temp = b;
        c = 10;

        System.out.println(a*(b%c));
        b /= c;
        System.out.println(a*(b%c));
        b /= c;
        System.out.println(a*(b%c));
        System.out.print(a*temp);
    }
}
