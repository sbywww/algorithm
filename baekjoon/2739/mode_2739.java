import java.util.Scanner;

public class mode_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= 9; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
