import java.util.Scanner;

public class hyuk_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        for(char c = 'a';c<='z';c++){
            System.out.print(S.indexOf(c)+" ");
        }
    }
}
