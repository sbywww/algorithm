import java.util.Scanner;

public class mode_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b >= 45){
            System.out.println(a + " " + (b-45));
        }else {
            if (a >= 1){
                System.out.println((a-1) + " " + (b+15));
            }else {
                System.out.println(23 + " " + (b+15));
            }
        }
    }
}