import java.util.Scanner;

public class hyuk_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i=0; i<croatia.length; i++) {
            if (word.contains(croatia[i])) {
                word = word.replace(croatia[i], "0");
            }
        }
        System.out.println(word.length());
    }
}
