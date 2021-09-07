import java.io.*;
import java.util.ArrayList;

public class mode_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bufferedReader.readLine());

//        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < t; i++){
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
//            arrayList.add(a+b);

            bufferedWriter.write(a);
        }

//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < arrayList.size(); i++){
//            bufferedWriter.write(arrayList.get(i).toString());
//            bufferedWriter.newLine();
//        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
